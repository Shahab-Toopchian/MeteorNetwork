package ir.meteornetwork;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabReselectListener;

public class MainActivity extends AppCompatActivity {
    private BottomBar bottomBar;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        setup_bottomBar();


    }

    private void setup_bottomBar() {

        bottomBar =  findViewById(R.id.bottom_bar);
        bottomBar.setOnTabReselectListener(new OnTabReselectListener() {
            @Override
            public void onTabReSelected(int tabId) {

                switch (tabId) {
                    case R.id.home_tab:
                        HomeFragment homeFragment = new HomeFragment();
                        fragmentManager.beginTransaction().replace(R.id.container, homeFragment).commit();
                        break;
                    case R.id.search_tab:
                        SearchFragment searchFragment = new SearchFragment();
                        fragmentManager.beginTransaction().replace(R.id.container, searchFragment).commit();
                        break;
                    case R.id.new_post_tab:
                        NewPostFragment newPostFragment = new NewPostFragment();
                        fragmentManager.beginTransaction().replace(R.id.container, newPostFragment).commit();
                        break;
                    case R.id.latest_activity_tab:
                        LatestActivityFragment latestActivityFragment = new LatestActivityFragment();
                        fragmentManager.beginTransaction().replace(R.id.container, latestActivityFragment).commit();
                        break;
                    case R.id.profile_tab:
                        ProfileFragment profileFragment = new ProfileFragment();
                        fragmentManager.beginTransaction().replace(R.id.container, profileFragment).commit();
                        break;
                }
            }
        });

    }
}
