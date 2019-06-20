package ir.meteornetwork;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class EditPostFragment extends Fragment {

    private ImageView post_image;
    private EditText post_text;
    private Button btn_edit_post;
    public EditPostFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_edit_post, container, false);
        post_image = v.findViewById(R.id.post_image);
        post_text = v.findViewById(R.id.post_text);
        btn_edit_post = v.findViewById(R.id.btn_new_post);

        btn_edit_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return v;
    }

}
