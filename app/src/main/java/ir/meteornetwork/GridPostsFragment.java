package ir.meteornetwork;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class GridPostsFragment extends Fragment {

    private RecyclerView grid_post_list;
    public GridPostsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_grid_posts, container, false);
        grid_post_list = v.findViewById(R.id.grid_post_list);
        GridLayoutManager lm = new GridLayoutManager(getContext(),3);
        grid_post_list.setLayoutManager(lm);
        PostsAdapter postsAdapter = new PostsAdapter(getContext());
        grid_post_list.setAdapter(postsAdapter);
        return v;
    }


}
