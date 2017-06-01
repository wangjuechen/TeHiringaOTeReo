package company.com.tehiringaotereoTest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import java.util.ArrayList;
import company.com.tehiringaotereoTest.Adapters.Topic_explanation_Adapter;

public class Topic_explanation extends Activity {

    public static ArrayList<Integer> mVoiceData;
    public static ArrayList<String> mTitleData;
    public static ArrayList<String> mContentData;
    public static ListView mListView;
    private LinearLayout btnNext;
    public Topic_explanation_Adapter mExplanationAdapter;
    private String mTopicOfCurrent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explanation_topic);
        mListView = (ListView) findViewById(R.id.list_explanationContent);
    }

    @Override
    protected void onResume() {
        super.onResume();

        mTitleData = new ArrayList<>();
        mContentData = new ArrayList<>();
        mVoiceData = new ArrayList<>();

        mTopicOfCurrent = getIntent().getStringExtra("topic");

        //currentItem index of slidepage starts from 0, so 0 is first day
        switch(mTopicOfCurrent){
            case("Level 10Explanation"):{
                setExplanationDataL1D1();
                break;
            }
            case("Level 11Explanation"):{
                setExplanationDataL1D2();
                break;
            }
            case("Level 12Explanation"):{
                setExplanationDataL1D3();
                break;
            }
            case("Level 13Explanation"):{
                setExplanationDataL1D4();
                break;
            }
            case("Level 14Explanation"):{
                setExplanationDataL1D5();
                break;
            }
            case("Level 20Explanation"):{
                setExplanationDataL2D1();
                break;
            }
            case("Level 21Explanation"):{
                setExplanationDataL2D2();
                break;
            }
            case("Level 22Explanation"):{
                setExplanationDataL2D3();
                break;
            }
            case("Level 23Explanation"):{
                setExplanationDataL2D4();
                break;
            }
            case("Level 30Explanation"):{
                setExplanationDataL3D1();
                break;
            }
            case("Level 31Explanation"):{
                setExplanationDataL3D2();
                break;
            }
            case("Level 32Explanation"):{
                setExplanationDataL3D3();
                break;
            }
            case("Level 33Explanation"):{
                setExplanationDataL3D4();
                break;
            }
            case("Level 34Explanation"):{
                setExplanationDataL3D5();
                break;
            }
            case("Level 40Explanation"):{
                setExplanationDataL4D1();
                break;
            }
            case("Level 41Explanation"):{
                setExplanationDataL4D2();
                break;
            }
            case("Level 42Explanation"):{
                setExplanationDataL4D3();
                break;
            }
            case("Level 43Explanation"):{
                setExplanationDataL4D4();
                break;
            }
            case("Level 44Explanation"):{
                setExplanationDataL4D5();
                break;
            }
        }

        if (mExplanationAdapter == null) {

            mExplanationAdapter = new Topic_explanation_Adapter(this, mTitleData, mContentData, mVoiceData,null);
            mListView.setAdapter(mExplanationAdapter);

        } else {
            mExplanationAdapter.notifyDataSetChanged();
        }

        btnNext = (LinearLayout) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Topic_explanation.this, Topic_listenSpeak.class);
                i.putExtra("topic",mTopicOfCurrent.replace("Explanation","Listen-Speak"));

                if (mExplanationAdapter.mMediaplayer != null) {
                    if (mExplanationAdapter.mMediaplayer.isPlaying()) {
                        mExplanationAdapter.mMediaplayer.stop();
                    }
                }
                startActivity(i);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mExplanationAdapter.mMediaplayer != null) {
            if (mExplanationAdapter.mMediaplayer.isPlaying()) {
                mExplanationAdapter.PlayerStop();
            }
        }
    }

    public void setExplanationDataL1D1() {
        mContentData.add(getString(R.string.ExplanationL1D1Part1));
        mContentData.add(getString(R.string.ExplanationL1D1Part2));
        mContentData.add(getString(R.string.ExplanationL1D1Part3));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));
        mTitleData.add(getString(R.string.ExplanationTitle3));

        mVoiceData.add(R.raw.nga_whainga_akoranga);
        mVoiceData.add(R.raw.whakamarama1_listen_repeat);
        mVoiceData.add(R.raw.whakamarama1_listen_repeat);
    }


    private void setExplanationDataL1D2(){
        mContentData.add(getString(R.string.ExplanationL1D2Part1));
        mContentData.add(getString(R.string.ExplanationL1D2Part2));
        mContentData.add(getString(R.string.ExplanationL1D2Part3));
        mContentData.add(getString(R.string.ExplanationL1D2Part4));
        mContentData.add(getString(R.string.ExplanationL1D2Part5));
        mContentData.add(getString(R.string.ExplanationL1D2Part6));
        mContentData.add(getString(R.string.ExplanationL1D2Part7));
        mContentData.add(getString(R.string.ExplanationL1D2Part8));
        mContentData.add(getString(R.string.ExplanationL1D2Part9));
        mContentData.add(getString(R.string.ExplanationL1D2Part10));
        mContentData.add(getString(R.string.ExplanationL1D2Part11));
        mContentData.add(getString(R.string.ExplanationL1D2Part12));
        mContentData.add(getString(R.string.ExplanationL1D2Part13));
        mContentData.add(getString(R.string.ExplanationL1D2Part14));
        mContentData.add(getString(R.string.ExplanationL1D2Part15));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));
        mTitleData.add(getString(R.string.ExplanationTitle3));
        mTitleData.add(getString(R.string.ExplanationTitle3));
        mTitleData.add(getString(R.string.ExplanationL1D2Title5));
        mTitleData.add(getString(R.string.ExplanationL1D2Title6));
        mTitleData.add(getString(R.string.ExplanationL1D2Title7));
        mTitleData.add(getString(R.string.ExplanationL1D2Title8));
        mTitleData.add(getString(R.string.ExplanationL1D2Title9));
        mTitleData.add(getString(R.string.ExplanationL1D2Title10));
        mTitleData.add(getString(R.string.ExplanationL1D2Title11));
        mTitleData.add(getString(R.string.ExplanationL1D2Title12));
        mTitleData.add(getString(R.string.ExplanationL1D2Title13));
        mTitleData.add(getString(R.string.ExplanationL1D2Title14));
        mTitleData.add(getString(R.string.ExplanationL1D2Title15));

        mVoiceData.add(R.raw.lev1_day2nga_akoranga);
        mVoiceData.add(R.raw.lev1_day2_he_whakamarama);
        mVoiceData.add(R.raw.lev1_day2hewhakamarama_4);
    }

    private void setExplanationDataL1D3(){
        mContentData.add(getString(R.string.ExplanationL1D3Part1));
        mContentData.add(getString(R.string.ExplanationL1D3Part2));
        mContentData.add(getString(R.string.ExplanationL1D3Part3));
        mContentData.add(getString(R.string.ExplanationL1D3Part4));
        mContentData.add(getString(R.string.ExplanationL1D3Part5));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));
        mTitleData.add(getString(R.string.ExplanationTitle4));
        mTitleData.add(getString(R.string.ExplanationTitle4));
        mTitleData.add(getString(R.string.ExplanationTitle4));

        mVoiceData.add(0);
        mVoiceData.add(R.raw.l1day3_1);
        mVoiceData.add(R.raw.l1day3_2);
        mVoiceData.add(R.raw.l1day3_3);
        mVoiceData.add(R.raw.l1day3_4);
    }

    private void setExplanationDataL1D4(){
        mContentData.add(getString(R.string.ExplanationL1D4Part1));
        mContentData.add(getString(R.string.ExplanationL1D4Part2));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));

        mVoiceData.add(R.raw.day4_1);
        mVoiceData.add(R.raw.day4_2);
    }

    private void setExplanationDataL1D5(){
        mContentData.add(getString(R.string.ExplanationL1D5Part1));
        mContentData.add(getString(R.string.ExplanationL1D5Part2));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));

        mVoiceData.add(R.raw.whakamarama1_listen_repeat);
    }

    private void setExplanationDataL2D1(){
        mContentData.add(getString(R.string.ExplanationL2D1Part1));
        mContentData.add(getString(R.string.ExplanationL2D1Part2));
        mContentData.add(getString(R.string.ExplanationL2D1Part3));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));
        mTitleData.add(getString(R.string.ExplanationTitle3));

        mVoiceData.add(0);
        mVoiceData.add(R.raw.w2day1_1);
        mVoiceData.add(R.raw.w2day1_6);
    }

    private void setExplanationDataL2D2(){
        mContentData.add(getString(R.string.ExplanationL2D2Part1));
        mContentData.add(getString(R.string.ExplanationL2D2Part2));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));

        mVoiceData.add(R.raw.w2d2_t1);
    }

    private void setExplanationDataL2D3(){
        mContentData.add(getString(R.string.ExplanationL2D3Part1));
        mContentData.add(getString(R.string.ExplanationL2D3Part2));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));

        mVoiceData.add(R.raw.w2day3_1);
    }

    private void setExplanationDataL2D4(){
        mContentData.add(getString(R.string.ExplanationL2D4Part1));
        mContentData.add(getString(R.string.ExplanationL2D4Part2));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));

        mVoiceData.add(R.raw.w2dayfour_1);
        mVoiceData.add(R.raw.w2dayfour_2);
    }

    private void setExplanationDataL3D1(){
        mContentData.add(getString(R.string.ExplanationL3D1Part1));
        mContentData.add(getString(R.string.ExplanationL3D1Part2));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));

        mVoiceData.add(R.raw.level3_day1_nga_whainga_akoranga);
        mVoiceData.add(R.raw.level3_day1_he_whakamarama);
    }

    private void setExplanationDataL3D2(){
        mContentData.add(getString(R.string.ExplanationL3D2Part1));
        mContentData.add(getString(R.string.ExplanationL3D2Part2));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));

        mVoiceData.add(R.raw.level3_day2_nga_whainga_akoranga);
        mVoiceData.add(R.raw.level3_day2_he_whakamarama);
    }

    private void setExplanationDataL3D3(){
        mContentData.add(getString(R.string.ExplanationL3D3Part1));
        mContentData.add(getString(R.string.ExplanationL3D3Part2));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));

        mVoiceData.add(R.raw.leve3_day3_nga_whainga_akoranga);
        mVoiceData.add(R.raw.level3_day3he_whakamarama_1);
    }

    private void setExplanationDataL3D4(){
        mContentData.add(getString(R.string.ExplanationL3D4Part1));
        mContentData.add(getString(R.string.ExplanationL3D4Part2));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));

        mVoiceData.add(R.raw.level3_day4_nga_whainga_akoranga);
        mVoiceData.add(R.raw.level3_day4__he_whakamarama);
    }

    private void setExplanationDataL3D5(){
        mContentData.add(getString(R.string.ExplanationL3D5Part1));
        mContentData.add(getString(R.string.ExplanationL3D5Part2));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));

        mVoiceData.add(R.raw.level3_day5_nga_whainga_akoranga);
    }

    private void setExplanationDataL4D1(){
        mContentData.add(getString(R.string.ExplanationL4D1Part1));
        mContentData.add(getString(R.string.ExplanationL4D1Part2));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));

        mVoiceData.add(0);
        mVoiceData.add(R.raw.level4_day1_a);
    }

    private void setExplanationDataL4D2(){
        mContentData.add(getString(R.string.ExplanationL4D2Part1));
        mContentData.add(getString(R.string.ExplanationL4D2Part2));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));

        mVoiceData.add(R.raw.level4_day2_a);
        mVoiceData.add(R.raw.level4_day2_b);
    }

    private void setExplanationDataL4D3(){
        mContentData.add(getString(R.string.ExplanationL4D3Part1));
        mContentData.add(getString(R.string.ExplanationL4D3Part2));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));

        mVoiceData.add(0);
        mVoiceData.add(R.raw.level4_day3_a);
    }

    private void setExplanationDataL4D4(){
        mContentData.add(getString(R.string.ExplanationL4D4Part1));
        mContentData.add(getString(R.string.ExplanationL4D4Part2));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));

        mVoiceData.add(0);
        mVoiceData.add(R.raw.level4_day4_a);
    }

    private void setExplanationDataL4D5(){
        mContentData.add(getString(R.string.ExplanationL4D5Part1));
        mContentData.add(getString(R.string.ExplanationL4D5Part2));

        mTitleData.add(getString(R.string.ExplanationTitle1));
        mTitleData.add(getString(R.string.ExplanationTitle2));

        mVoiceData.add(0);
        mVoiceData.add(R.raw.level4_day5_a);
    }
}
