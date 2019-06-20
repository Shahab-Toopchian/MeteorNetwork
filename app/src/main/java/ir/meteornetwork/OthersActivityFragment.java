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
public class OthersActivityFragment extends Fragment {

    private RecyclerView others_ac_list;
    public OthersActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_others_activity, container, false);
        others_ac_list = v.findViewById(R.id.others_ac_list);
        LinearLayoutManager lm = new LinearLayoutManager(getContext());
        others_ac_list.setLayoutManager(lm);
        ActivityAdapter activityAdapter = new ActivityAdapter();
        others_ac_list.setAdapter(activityAdapter);

        return v;
    }

}
