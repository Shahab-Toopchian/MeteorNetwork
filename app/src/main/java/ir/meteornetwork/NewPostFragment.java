package ir.meteornetwork;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewPostFragment extends Fragment {

    private ImageView post_image;
    private EditText post_text;
    private Button btn_new_post;
    private AlertDialog Alert;
    private String fileAddr;

    public NewPostFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_new_post, container, false);
        post_image = v.findViewById(R.id.post_image);
        post_text = v.findViewById(R.id.post_text);
        btn_new_post = v.findViewById(R.id.btn_new_post);

        btn_new_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        post_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence items[] = {"گرفتن تصویر از دوربین", "گرفتن دوربین از ویدیو", "انتخاب عکس از گالری", "انتخاب ویدیو از گالری"};
                AlertDialog.Builder ab = new AlertDialog.Builder(getContext());
                ab.setTitle("انتخاب از :");
                ab.setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int position) {

                        switch (position) {
                            case 0:
                                takePicCamera();
                                break;
                            case 1:
                                takeVideoCamera();
                                break;
                            case 2:
                                pickGalleryPic();
                                break;
                            case 3:
                                pickGalleryVideo();
                                break;
                        }

                    }
                });
                Alert = ab.create();
                Alert.show();
            }
        });
        return v;
    }

    private void takePicCamera() {
        Intent intent = new Intent();
        intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
        fileAddr = String.valueOf(System.currentTimeMillis()) + ".jpg";
        File file = new File(getActivity().getExternalCacheDir(), fileAddr);
        Uri uri = Uri.fromFile(file);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
        startActivityForResult(intent, 1);
    }

    private void takeVideoCamera() {
        Intent intent = new Intent();
        intent.setAction(MediaStore.ACTION_VIDEO_CAPTURE);
        fileAddr = String.valueOf(System.currentTimeMillis()) + ".mp4";
        File file = new File(getActivity().getExternalCacheDir(), fileAddr);
        Uri uri = Uri.fromFile(file);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
        startActivityForResult(intent, 2);
    }

    private void pickGalleryPic() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        startActivityForResult(intent, 3);

    }

    private void pickGalleryVideo() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.setType("video/*");
        startActivityForResult(intent, 4);

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        switch (requestCode) {
            case 1:
                if (resultCode == Activity.RESULT_OK) {
                    handleTakePic(data);
                }
                break;
            case 2:
                if (resultCode == Activity.RESULT_OK) {
                    handleTakeVid(data);
                }
                break;
            case 3:
                if (resultCode == Activity.RESULT_OK) {
                    handlePickImg(data);
                }
                break;
            case 4:
                if (resultCode == Activity.RESULT_OK) {
                    handlePickVid(data);
                }
                break;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void handleTakePic(Intent data) {
        Bitmap b = BitmapFactory.decodeFile(getActivity().getExternalCacheDir()+"/"+fileAddr);
        post_image.setImageBitmap(b);

    }

    private void handleTakeVid(Intent data) {
        //getActivity().getExternalCacheDir()+"/"+fileAddr;
        Toast.makeText(getContext(),"ویدیو شما با موفقیت انتخاب شد.", Toast.LENGTH_SHORT).show();
    }


    private void handlePickImg(Intent data) {
        Uri uri = data.getData();
        fileAddr = Path1.getPath(getContext(),uri);
        Bitmap b = BitmapFactory.decodeFile(fileAddr);
        post_image.setImageBitmap(b);
    }

    private void handlePickVid(Intent data) {
        Uri uri = data.getData();
        fileAddr = Path1.getPath(getContext(),uri);
        Toast.makeText(getContext(),"ویدیو شما با موفقیت انتخاب شد.", Toast.LENGTH_SHORT).show();
    }
}
