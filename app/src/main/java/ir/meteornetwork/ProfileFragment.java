package ir.meteornetwork;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    private CircleImageView profile_image;
    private TextView follower_count, following_count;
    private TabLayout profile_tab;
    private Button btn_follow;
    private ViewPager profile_pager;
    private Profile_Pager ppager;


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        profile_image = v.findViewById(R.id.profile_image);
        follower_count = v.findViewById(R.id.follower_count);
        following_count = v.findViewById(R.id.following_count);
        btn_follow = v.findViewById(R.id.btn_follow);
        profile_tab = v.findViewById(R.id.profile_tab);
        profile_pager = v.findViewById(R.id.pager_profile);
        ppager = new Profile_Pager(getActivity().getSupportFragmentManager());
        ppager.AddFragment(new GridPostsFragment());
        ppager.AddFragment(new ListPostsFragment());
        profile_pager.setAdapter(ppager);
        profile_tab.getTabAt(0).setIcon(R.drawable.grid_btn);
        profile_tab.getTabAt(1).setIcon(R.drawable.list_btn);
        profile_tab.setupWithViewPager(profile_pager);

        follower_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        following_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        
        btn_follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return v;
    }

}
