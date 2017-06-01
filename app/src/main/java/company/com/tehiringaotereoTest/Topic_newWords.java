package company.com.tehiringaotereoTest;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Adapters.Topic_newWords_Adapter;

public class Topic_newWords extends Activity {

    private Topic_newWords_Adapter mNewWordsAdapter;
    private ListView mListView;
    public static ArrayList<String> mEngData;
    public static ArrayList<String> mMaoriData;
    public static ArrayList<Integer> mVoiceId;
    private LinearLayout btnNext;
    private String mTopicOfCurrent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newwords_topic);
        mListView = (ListView) findViewById(R.id.list_newWordsContent);

    }

    @Override
    protected void onResume() {
        super.onResume();

        mEngData = new ArrayList<>();
        mMaoriData = new ArrayList<>();
        mVoiceId = new ArrayList<>();

        mTopicOfCurrent = getIntent().getStringExtra("topic");

        switch (mTopicOfCurrent) {
            case ("Level 10New Words"): {
                setNewWordsDataL1D1();
                break;
            }
            case ("Level 11New Words"): {
                setNewWordsDataL1D2();
                break;
            }
            case ("Level 12New Words"): {
                setNewWordsDataL1D3();
                break;
            }
            case ("Level 13New Words"): {
                setNewWordsDataL1D4();
                break;
            }
            case ("Level 14New Words"): {
                //setNewWordsDataL1D5();//TODO today has no newwords topic, need modified image to not open
                break;
            }
            case ("Level 20New Words"): {
                setNewWordsDataL2D1();
                break;
            }
            case ("Level 21New Words"): {
                setNewWordsDataL2D2();
                break;
            }
            case ("Level 22New Words"): {
                setNewWordsDataL2D3();
                break;
            }
            case ("Level 23New Words"): {
                setNewWordsDataL2D4();
                break;
            }
            case ("Level 30New Words"): {
                //setNewWordsDataL3D1();//TODO today has no newwords topic, need modified image to not open
                break;
            }
            case ("Level 31New Words"): {
                //setNewWordsDataL3D2();//TODO today has no newwords topic, need modified image to not open
                break;
            }
            case ("Level 32New Words"): {
                //setNewWordsDataL3D3();//TODO today has no newwords topic, need modified image to not open
                break;
            }
            case ("Level 33New Words"): {
                //setNewWordsDataL3D4();//TODO today has no newwords topic, need modified image to not open
                break;
            }
            case ("Level 34New Words"): {
                //setNewWordsDataL3D5();//TODO today has no newwords topic, need modified image to not open
                break;
            }
            case ("Level 40New Words"): {
                setNewWordsDataL4D1();
                break;
            }
            case ("Level 41New Words"): {
                setNewWordsDataL4D2();
                break;
            }
            case ("Level 42New Words"): {
                setNewWordsDataL4D3();
                break;
            }
            case ("Level 43New Words"): {
                setNewWordsDataL4D4();
                break;
            }
            case ("Level 44New Words"): {
                //setNewWordsDataL4D5();//TODO today has no newwords topic, need modified image to not open
                break;
            }
        }
        if (mNewWordsAdapter == null) {

            mNewWordsAdapter = new Topic_newWords_Adapter(Topic_newWords.this, mEngData, mMaoriData, mVoiceId, null);
            mListView.setAdapter(mNewWordsAdapter);
        } else {

            mNewWordsAdapter.notifyDataSetChanged();
        }

        btnNext = (LinearLayout) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // topicNo=topicNo+1;
                Intent i = new Intent(Topic_newWords.this, Topic_playGame.class);
                i.putExtra("topic", mTopicOfCurrent.replace("New Words", "PlayGame"));

                startActivity(i);

                if (mNewWordsAdapter.mMediaplayer != null) {
                    if (mNewWordsAdapter.mMediaplayer.isPlaying()) {
                        mNewWordsAdapter.mMediaplayer.stop();
                    }
                }
            }
        });

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mNewWordsAdapter.mMediaplayer != null) {
            if (mNewWordsAdapter.mMediaplayer.isPlaying()) {
                mNewWordsAdapter.PlayerStop();
            }
        }
    }

    public void setNewWordsDataL1D1() {
        mEngData.add(getResources().getString(R.string.Day1_2ae));
        mEngData.add(getResources().getString(R.string.Day1_2be));
        mEngData.add(getResources().getString(R.string.Day1_2ce));
        mEngData.add(getResources().getString(R.string.Day1_2de));
        mEngData.add(getResources().getString(R.string.Day1_2fe));
        mEngData.add(getResources().getString(R.string.Day1_2ge));
        mEngData.add(getResources().getString(R.string.Day1_2he));
        mEngData.add(getResources().getString(R.string.Day1_2ie));
        mEngData.add(getResources().getString(R.string.Day1_2je));
        mEngData.add(getResources().getString(R.string.Day1_2ke));
        mEngData.add(getResources().getString(R.string.Day1_2le));
        mEngData.add(getResources().getString(R.string.Day1_2me));
        mEngData.add(getResources().getString(R.string.Day1_2ne));
        mEngData.add(getResources().getString(R.string.Day1_2oe));
        mEngData.add(getResources().getString(R.string.Day1_2pe));
        mEngData.add(getResources().getString(R.string.Day1_2qe));
        mEngData.add(getResources().getString(R.string.Day1_2re));

        mMaoriData.add(getResources().getString(R.string.Day1_2a));
        mMaoriData.add(getResources().getString(R.string.Day1_2b));
        mMaoriData.add(getResources().getString(R.string.Day1_2c));
        mMaoriData.add(getResources().getString(R.string.Day1_2d));
        mMaoriData.add(getResources().getString(R.string.Day1_2f));
        mMaoriData.add(getResources().getString(R.string.Day1_2g));
        mMaoriData.add(getResources().getString(R.string.Day1_2h));
        mMaoriData.add(getResources().getString(R.string.Day1_2i));
        mMaoriData.add(getResources().getString(R.string.Day1_2j));
        mMaoriData.add(getResources().getString(R.string.Day1_2k));
        mMaoriData.add(getResources().getString(R.string.Day1_2l));
        mMaoriData.add(getResources().getString(R.string.Day1_2m));
        mMaoriData.add(getResources().getString(R.string.Day1_2n));
        mMaoriData.add(getResources().getString(R.string.Day1_2o));
        mMaoriData.add(getResources().getString(R.string.Day1_2p));
        mMaoriData.add(getResources().getString(R.string.Day1_2q));
        mMaoriData.add(getResources().getString(R.string.Day1_2r));

        mVoiceId.add(R.raw.tangata);
        mVoiceId.add(R.raw.tangata3);
        mVoiceId.add(R.raw.wahine);
        mVoiceId.add(R.raw.wahine3);
        mVoiceId.add(R.raw.whakarongo);
        mVoiceId.add(R.raw.korero);
        mVoiceId.add(R.raw.mihi);
        mVoiceId.add(R.raw.koe);
        mVoiceId.add(R.raw.korua);
        mVoiceId.add(R.raw.koutou);
        mVoiceId.add(R.raw.whanau);
        mVoiceId.add(R.raw.rangatira);
        mVoiceId.add(R.raw.whanaunga);
        mVoiceId.add(R.raw.tane);
        mVoiceId.add(R.raw.tokomaha);
        mVoiceId.add(R.raw.tukuruatia);
        mVoiceId.add(R.raw.tokorua);
    }

    public void setNewWordsDataL1D2() {
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart1));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart2));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart3));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart4));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart5));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart6));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart7));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart8));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart9));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart10));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart11));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart12));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart13));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart14));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart15));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart16));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart17));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart18));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart19));
        mEngData.add(getResources().getString(R.string.NewWordsL1D2EngPart20));

        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart4));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart6));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart7));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart8));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart9));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart10));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart11));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart12));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart13));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart14));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart15));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart16));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart17));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart18));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart19));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D2MaoriPart20));

        mVoiceId.add(R.raw.level2day2thirty);
        mVoiceId.add(R.raw.level2day2thirtyone);
        mVoiceId.add(R.raw.level2day2thirtytwo);
        mVoiceId.add(R.raw.level2day2thirtythree);
        mVoiceId.add(R.raw.level2day2thirtyfour);
        mVoiceId.add(R.raw.level2day2thirtyfive);
        mVoiceId.add(R.raw.level2day2thirtysix);
        mVoiceId.add(R.raw.level2day2thirtyseven);
        mVoiceId.add(R.raw.level2day2thirtyeight);
        mVoiceId.add(R.raw.level2day2thirtynine);
        mVoiceId.add(R.raw.level2day2forty);
        mVoiceId.add(R.raw.level2day2fortyone);
        mVoiceId.add(R.raw.level2day2fortytwo);
        mVoiceId.add(R.raw.level2day2fortythree);
        mVoiceId.add(R.raw.level2day2fortyfour);
        mVoiceId.add(R.raw.level2day2fortyfive);
        mVoiceId.add(R.raw.level2day2fortysix);
        mVoiceId.add(R.raw.level2day2fortyseven);
        mVoiceId.add(R.raw.level2day2fortyeight);
        mVoiceId.add(R.raw.level2day2fortynine);
    }

    private void setNewWordsDataL1D3() {
        mEngData.add(getResources().getString(R.string.NewWordsL1D3EngPart1));

        mMaoriData.add(getResources().getString(R.string.NewWordsL1D3MaoriPart1));

        mVoiceId.add(R.raw.nga_kopu_hou);
    }

    private void setNewWordsDataL1D4() {
        mEngData.add(getResources().getString(R.string.NewWordsL1D4EngPart1));
        mEngData.add(getResources().getString(R.string.NewWordsL1D4EngPart2));

        mMaoriData.add(getResources().getString(R.string.NewWordsL1D4MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.NewWordsL1D4MaoriPart2));

        mVoiceId.add(R.raw.day4_7);
        mVoiceId.add(R.raw.day4_8);
    }

    private void setNewWordsDataL2D1() {
        mEngData.add(getResources().getString(R.string.NewWordsL2D1EngPart1));
        mEngData.add(getResources().getString(R.string.NewWordsL2D1EngPart2));

        mMaoriData.add(getResources().getString(R.string.NewWordsL2D1MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D1MaoriPart2));

        mVoiceId.add(R.raw.w2day1_4);
        mVoiceId.add(R.raw.w2day1_5);
    }

    private void setNewWordsDataL2D2() {

        mMaoriData.add(getResources().getString(R.string.NewWordsL2D2MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D2MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D2MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D2MaoriPart4));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D2MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D2MaoriPart6));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D2MaoriPart7));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D2MaoriPart8));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D2MaoriPart9));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D2MaoriPart10));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D2MaoriPart11));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D2MaoriPart12));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D2MaoriPart13));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D2MaoriPart14));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D2MaoriPart15));

        mEngData.add(getResources().getString(R.string.NewWordsL2D2EngPart1));
        mEngData.add(getResources().getString(R.string.NewWordsL2D2EngPart2));
        mEngData.add(getResources().getString(R.string.NewWordsL2D2EngPart3));
        mEngData.add(getResources().getString(R.string.NewWordsL2D2EngPart4));
        mEngData.add(getResources().getString(R.string.NewWordsL2D2EngPart5));
        mEngData.add(getResources().getString(R.string.NewWordsL2D2EngPart6));
        mEngData.add(getResources().getString(R.string.NewWordsL2D2EngPart7));
        mEngData.add(getResources().getString(R.string.NewWordsL2D2EngPart8));
        mEngData.add(getResources().getString(R.string.NewWordsL2D2EngPart9));
        mEngData.add(getResources().getString(R.string.NewWordsL2D2EngPart10));
        mEngData.add(getResources().getString(R.string.NewWordsL2D2EngPart11));
        mEngData.add(getResources().getString(R.string.NewWordsL2D2EngPart12));
        mEngData.add(getResources().getString(R.string.NewWordsL2D2EngPart13));
        mEngData.add(getResources().getString(R.string.NewWordsL2D2EngPart14));
        mEngData.add(getResources().getString(R.string.NewWordsL2D2EngPart15));

        mVoiceId.add(R.raw.koe);
        mVoiceId.add(R.raw.au_ahau);
        mVoiceId.add(R.raw.ia);
        mVoiceId.add(R.raw.taku);
        mVoiceId.add(R.raw.to);
        mVoiceId.add(R.raw.tana);
        mVoiceId.add(R.raw.aku);
        mVoiceId.add(R.raw.o);
        mVoiceId.add(R.raw.ana);
        mVoiceId.add(R.raw.te);
        mVoiceId.add(R.raw.nga);
        mVoiceId.add(R.raw.he);
        mVoiceId.add(R.raw.koi_wai);
        mVoiceId.add(R.raw.raua);
        mVoiceId.add(R.raw.ratou);
    }

    private void setNewWordsDataL2D3() {

        mMaoriData.add(getResources().getString(R.string.NewWordsL2D3MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D3MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D3MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D3MaoriPart4));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D3MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D3MaoriPart6));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D3MaoriPart7));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D3MaoriPart8));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D3MaoriPart9));

        mEngData.add(getResources().getString(R.string.NewWordsL2D3EngPart1));
        mEngData.add(getResources().getString(R.string.NewWordsL2D3EngPart2));
        mEngData.add(getResources().getString(R.string.NewWordsL2D3EngPart3));
        mEngData.add(getResources().getString(R.string.NewWordsL2D3EngPart4));
        mEngData.add(getResources().getString(R.string.NewWordsL2D3EngPart5));
        mEngData.add(getResources().getString(R.string.NewWordsL2D3EngPart6));
        mEngData.add(getResources().getString(R.string.NewWordsL2D3EngPart7));
        mEngData.add(getResources().getString(R.string.NewWordsL2D3EngPart8));
        mEngData.add(getResources().getString(R.string.NewWordsL2D3EngPart9));

        mVoiceId.add(R.raw.w2day3_3);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(R.raw.w2day3_4);

    }

    private void setNewWordsDataL2D4() {

        mMaoriData.add(getResources().getString(R.string.NewWordsL2D4MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D4MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D4MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D4MaoriPart4));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D4MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D4MaoriPart6));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D4MaoriPart7));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D4MaoriPart8));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D4MaoriPart9));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D4MaoriPart10));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D4MaoriPart11));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D4MaoriPart12));
        mMaoriData.add(getResources().getString(R.string.NewWordsL2D4MaoriPart13));

        mEngData.add(getResources().getString(R.string.NewWordsL2D4EngPart1));
        mEngData.add(getResources().getString(R.string.NewWordsL2D4EngPart2));
        mEngData.add(getResources().getString(R.string.NewWordsL2D4EngPart3));
        mEngData.add(getResources().getString(R.string.NewWordsL2D4EngPart4));
        mEngData.add(getResources().getString(R.string.NewWordsL2D4EngPart5));
        mEngData.add(getResources().getString(R.string.NewWordsL2D4EngPart6));
        mEngData.add(getResources().getString(R.string.NewWordsL2D4EngPart7));
        mEngData.add(getResources().getString(R.string.NewWordsL2D4EngPart8));
        mEngData.add(getResources().getString(R.string.NewWordsL2D4EngPart9));
        mEngData.add(getResources().getString(R.string.NewWordsL2D4EngPart10));
        mEngData.add(getResources().getString(R.string.NewWordsL2D4EngPart11));
        mEngData.add(getResources().getString(R.string.NewWordsL2D4EngPart12));
        mEngData.add(getResources().getString(R.string.NewWordsL2D4EngPart13));
    }

    private void setNewWordsDataL4D1() {
        mEngData.add(getResources().getString(R.string.NewWordsL4D1EngPart1));

        mMaoriData.add(getResources().getString(R.string.NewWordsL4D1MaoriPart1));

        mVoiceId.add(R.raw.leve4_day1_nga_kupu_hou);
    }

    private void setNewWordsDataL4D2() {
        mEngData.add(getResources().getString(R.string.NewWordsL4D2EngPart1));

        mMaoriData.add(getResources().getString(R.string.NewWordsL4D2MaoriPart1));
    }

    private void setNewWordsDataL4D3() {
        mEngData.add(getResources().getString(R.string.NewWordsL4D3EngPart1));

        mMaoriData.add(getResources().getString(R.string.NewWordsL4D3MaoriPart1));
    }

    private void setNewWordsDataL4D4() {
        mEngData.add(getResources().getString(R.string.NewWordsL4D4EngPart1));

        mMaoriData.add(getResources().getString(R.string.NewWordsL4D4MaoriPart1));

        mVoiceId.add(R.raw.level4_day4_h);
    }

}
