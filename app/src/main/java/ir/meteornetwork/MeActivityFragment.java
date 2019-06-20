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
public class MeActivityFragment extends Fragment {

    private RecyclerView me_ac_list;
    public MeActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_me_activity, container, false);
        me_ac_list = v.findViewById(R.id.me_ac_list);
        LinearLayoutManager lm = new LinearLayoutManager(getContext());
        me_ac_list.setLayoutManager(lm);
        ActivityAdapter activityAdapter = new ActivityAdapter();
        me_ac_list.setAdapter(activityAdapter);

        return v;
    }

}
