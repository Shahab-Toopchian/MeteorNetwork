package ir.meteornetwork;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class LatestActivityFragment extends Fragment {

    private TabLayout tab_lay;
    private ViewPager view_pager;


    public LatestActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_latest_activity, container, false);
        tab_lay = v.findViewById(R.id.tab_lay);
        view_pager = v.findViewById(R.id.view_pager);
        tab_lay.setupWithViewPager(view_pager);
        Fragment_Pager fp = new Fragment_Pager(getActivity().getSupportFragmentManager());
        view_pager.setAdapter(fp);

        return v;
    }

}
