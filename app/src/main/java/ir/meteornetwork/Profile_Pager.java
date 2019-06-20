package ir.meteornetwork;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Profile_Pager extends FragmentPagerAdapter {

    private List<Fragment> Fragments = new ArrayList<>();


    public Profile_Pager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return Fragments.get(position);
    }

    @Override
    public int getCount() {
        return Fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }


    public void AddFragment(Fragment fragment) {
        Fragments.add(fragment);
    }


}
