package ir.meteornetwork;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class CommentFragment extends Fragment {

    private RecyclerView comment_list;
    private EditText comment_text;
    private Button btn_comment;


    public CommentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_comment, container, false);
        comment_list = v.findViewById(R.id.comment_list);
        comment_text = v.findViewById(R.id.comment_text);
        btn_comment = v.findViewById(R.id.btn_comment);
        LinearLayoutManager lm = new LinearLayoutManager(getContext());
        comment_list.setLayoutManager(lm);
        CommentAdapter commentAdapter = new CommentAdapter();
        comment_list.setAdapter(commentAdapter);

        btn_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return v;
    }


}
