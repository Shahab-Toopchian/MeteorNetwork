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
public class ShowUsersFragment extends Fragment {

    private RecyclerView users_list;
    public ShowUsersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_show_users, container, false);
        users_list = v.findViewById(R.id.users_list);
        LinearLayoutManager lm =new LinearLayoutManager(getContext());
        users_list.setLayoutManager(lm);
        SearchAdapter searchAdapter = new SearchAdapter();
        users_list.setAdapter(searchAdapter);
        return v;
    }

}
