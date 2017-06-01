package company.com.tehiringaotereoTest;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import company.com.tehiringaotereoTest.Utilities.PhoneUtils;
import me.relex.circleindicator.CircleIndicator;


public class Topics_ForAllDays_Activity extends FragmentActivity {

    private static final int NUM_PAGES = 5;

    private ViewPager mViewPager;

    public static String mlevel;
    private int mDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_levelstopics);
        LayoutInflater inflater = (LayoutInflater) Topics_ForAllDays_Activity.this.getSystemService(LAYOUT_INFLATER_SERVICE);

        mViewPager = (ViewPager) findViewById(R.id.vp_days);
        ImageButton mExplanation = (ImageButton) findViewById(R.id.ib_explanation);
        final ImageButton mListenSpeak = (ImageButton) findViewById(R.id.ib_listen);
        final ImageButton mNewWords = (ImageButton) findViewById(R.id.ib_newWords);
        final ImageButton mPlayGame = (ImageButton) findViewById(R.id.ib_PlayGame);
        final TextView mLevelTitle = (TextView) findViewById(R.id.tv_level1Details_levelTitle);

        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        mlevel = getIntent().getStringExtra("level");

        mLevelTitle.setText(mlevel);

        switch (mlevel) {
            case ("Level 1"): {
                mLevelTitle.setTextColor(ContextCompat.getColor(this, R.color.level1_title));
                Level1ProgressFragment fragment = new Level1ProgressFragment();
                fragmentTransaction.add(R.id.fl_progress, fragment);
                fragmentTransaction.commit();

                break;
            }
            case ("Level 2"): {
                mLevelTitle.setTextColor(ContextCompat.getColor(this, R.color.level2_title));
                Level2ProgressFragment fragment = new Level2ProgressFragment();
                fragmentTransaction.add(R.id.fl_progress, fragment);
                fragmentTransaction.commit();

                break;
            }
            case ("Level 3"): {
                mLevelTitle.setTextColor(ContextCompat.getColor(this, R.color.level3_title));
                Level3ProgressFragment fragment = new Level3ProgressFragment();
                fragmentTransaction.add(R.id.fl_progress, fragment);
                fragmentTransaction.commit();
                mNewWords.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.levelpage_newwordlocked_btn,null));
                mNewWords.setEnabled(false);

                break;
            }
            case ("Level 4"): {
                mLevelTitle.setTextColor(ContextCompat.getColor(this, R.color.level4_title));
                Level4ProgressFragment fragment = new Level4ProgressFragment();
                fragmentTransaction.add(R.id.fl_progress, fragment);
                fragmentTransaction.commit();

                break;
            }
            default: {
                break;
            }
        }

        PagerAdapter mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);

        mViewPager.setAdapter(mPagerAdapter);
        indicator.setViewPager(mViewPager);

        ViewGroup.LayoutParams layoutParams = mViewPager.getLayoutParams();
        layoutParams.width = PhoneUtils.getScreenW(this) - PhoneUtils.dip2px(this, 100);
        mViewPager.setPageMargin(PhoneUtils.dip2px(this, 24));
        mViewPager.setLayoutParams(layoutParams);
        mViewPager.setOffscreenPageLimit(2);

        mExplanation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Topics_ForAllDays_Activity.this, Topic_explanation.class);

                mDay = mViewPager.getCurrentItem();
                intent.putExtra("topic", mlevel + mDay + "Explanation");

                startActivity(intent);
            }
        });

        mListenSpeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Topics_ForAllDays_Activity.this, Topic_listenSpeak.class);

                mDay = mViewPager.getCurrentItem();
                intent.putExtra("topic", mlevel + mDay + "Listen-Speak");

                startActivity(intent);
            }
        });

        mNewWords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Topics_ForAllDays_Activity.this, Topic_newWords.class);

                mDay = mViewPager.getCurrentItem();
                intent.putExtra("topic", mlevel + mDay + "New Words");

                startActivity(intent);
            }
        });

        mPlayGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Topics_ForAllDays_Activity.this, Topic_playGame.class);

                mDay = mViewPager.getCurrentItem();
                intent.putExtra("topic", mlevel + mDay + "PlayGame");

                startActivity(intent);
            }
        });

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(mlevel.equals("Level 1") && position == 4){
                    mNewWords.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.levelpage_newwordlocked_btn,null));
                    mNewWords.setEnabled(false);
                }
                else if(mlevel.equals("Level 4") && position ==4){
                    mNewWords.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.levelpage_newwordlocked_btn,null));
                    mPlayGame.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.levelpage_playgamelocked_btn,null));
                    mNewWords.setEnabled(false);
                    mPlayGame.setEnabled(false);
                }
                else if(mlevel.equals("Level 3")){
                    mNewWords.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.levelpage_newwordlocked_btn,null));
                    mNewWords.setEnabled(false);
                }
                else{
                    mNewWords.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.levelpage_newword_btn,null));
                    mPlayGame.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.levelpage_playgame_btn,null));
                    mNewWords.setEnabled(true);
                    mPlayGame.setEnabled(true);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new SlidesDay1Fragment();
                case 1:
                    return new SlidesDay2Fragment();
                case 2:
                    return new SlidesDay3Fragment();
                case 3:
                    return new SlidesDay4Fragment();
                case 4:
                    if (mlevel.equals("Level 2")) {
                        return null;
                    } else {
                        return new SlidesDay5Fragment();
                    }
                default:
                    return null;
            }
        }



        @Override
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
        }

        @Override
        public int getCount() {
            if (mlevel.equals("Level 2")) {
                return NUM_PAGES-1;
            } else {
                return NUM_PAGES;
            }

        }

    }

}
