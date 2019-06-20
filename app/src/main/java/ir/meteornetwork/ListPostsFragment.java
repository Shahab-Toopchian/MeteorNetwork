package ir.meteornetwork;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListPostsFragment extends Fragment {

    private RecyclerView l_post_list;

    public ListPostsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_list_posts, container, false);
        l_post_list = v.findViewById(R.id.l_post_list);
        LinearLayoutManager lm = new LinearLayoutManager(getContext());
        l_post_list.setLayoutManager(lm);
        PostsAdapter postsAdapter = new PostsAdapter(getContext());
        l_post_list.setAdapter(postsAdapter);
        return v;
    }

}
