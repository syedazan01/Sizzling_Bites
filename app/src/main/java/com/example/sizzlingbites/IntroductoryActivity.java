package com.example.sizzlingbites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class IntroductoryActivity extends AppCompatActivity {

    ImageView logo,appname,bg;
    LottieAnimationView lottieAnimationView;
    private static final int NUM_PAGE = 3;
    private ViewPager viewPager;
    private ScreenSlidePageAdapter PageAdapter;
    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);
        initViews();


        //animation transition
        bg.animate().translationY(-1600).setDuration(2000).setStartDelay(4000);
        logo.animate().translationY(1400).setDuration(2000).setStartDelay(4000);
        appname.animate().translationY(1400).setDuration(2000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1400).setDuration(2000).setStartDelay(4000);


    }

    private void initViews() {
        viewPager = findViewById(R.id.liquid_pager);
        logo = findViewById(R.id.intro_logo);
        appname = findViewById(R.id.app_name);
        bg = findViewById(R.id.bg_img);
        lottieAnimationView = findViewById(R.id.lottie);
        PageAdapter = new ScreenSlidePageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(PageAdapter);
        anim = AnimationUtils.loadAnimation(this,R.anim.o_b_anim);
        viewPager.setAnimation(anim);
    }

    private class ScreenSlidePageAdapter extends FragmentStatePagerAdapter{

        public ScreenSlidePageAdapter(@NonNull FragmentManager fm ) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    OnBoardingFragment1 tab1 = new OnBoardingFragment1();
                    return tab1;

                case 1:
                    OnBoardingFragment2 tab2 = new OnBoardingFragment2();
                    return tab2;

                case 2:
                    OnBoardingFragment3 tab3 = new OnBoardingFragment3();
                    return tab3;
            }
            return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGE;
        }
    }
}