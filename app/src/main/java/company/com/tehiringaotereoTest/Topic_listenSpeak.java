package company.com.tehiringaotereoTest;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Adapters.Topic_listenSpeak_Adapter;


public class Topic_listenSpeak extends Activity {

    private Topic_listenSpeak_Adapter mListenAdapter;
    private ListView mListView;
    public static ArrayList<String> mEngData;
    public static ArrayList<String> mMaoriData;
    public static ArrayList<Integer> mVoiceId;
    private LinearLayout btnNext;
    private String mTopicOfCurrent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listen_topic);
        mListView = (ListView) findViewById(R.id.list_listenSpeakContent);
    }

    @Override
    protected void onResume() {
        super.onResume();

        mEngData = new ArrayList<>();
        mMaoriData = new ArrayList<>();
        mVoiceId = new ArrayList<>();

        mTopicOfCurrent = getIntent().getStringExtra("topic");

        switch (mTopicOfCurrent) {
            case ("Level 10Listen-Speak"): {
                setListenDataL1D1();
                break;
            }
            case ("Level 11Listen-Speak"): {
                setListenDataL1D2();
                break;
            }
            case ("Level 12Listen-Speak"): {
                setListenDataL1D3();
                break;
            }
            case ("Level 13Listen-Speak"): {
                setListenDataL1D4();
                break;
            }
            case ("Level 14Listen-Speak"): {
                setListenDataL1D5();
                break;
            }
            case ("Level 20Listen-Speak"): {
                setListenDataL2D1();
                break;
            }
            case ("Level 21Listen-Speak"): {
                setListenDataL2D2();
                break;
            }
            case ("Level 22Listen-Speak"): {
                setListenDataL2D3();
                break;
            }
            case ("Level 23Listen-Speak"): {
                setListenDataL2D4();
                break;
            }
            case ("Level 30Listen-Speak"): {
                setListenDataL3D1();
                break;
            }
            case ("Level 31Listen-Speak"): {
                setListenDataL3D2();
                break;
            }
            case ("Level 32Listen-Speak"): {
                setListenDataL3D3();
                break;
            }
            case ("Level 33Listen-Speak"): {
                setListenDataL3D4();
                break;
            }
            case ("Level 34Listen-Speak"): {
                setListenDataL3D5();
                break;
            }
            case ("Level 40Listen-Speak"): {
                setListenDataL4D1();
                break;
            }
            case ("Level 41Listen-Speak"): {
                setListenDataL4D2();
                break;
            }
            case ("Level 42Listen-Speak"): {
                setListenDataL4D3();
                break;
            }
            case ("Level 43Listen-Speak"): {
                setListenDataL4D4();
                break;
            }
            case ("Level 44Listen-Speak"): {
                setListenDataL4D5();
                break;
            }
        }

        if (mListenAdapter == null) {

            mListenAdapter = new Topic_listenSpeak_Adapter(this, mEngData, mMaoriData, mVoiceId, null);
            mListView.setAdapter(mListenAdapter);

        } else {
            mListenAdapter.notifyDataSetChanged();
        }

        btnNext = (LinearLayout) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Topic_listenSpeak.this, Topic_newWords.class);
                i.putExtra("topic",mTopicOfCurrent.replace("Listen-Speak","New Words"));


                if (mListenAdapter.mMediaplayer != null) {
                    if (mListenAdapter.mMediaplayer.isPlaying()) {
                        mListenAdapter.mMediaplayer.stop();
                    }
                }
                startActivity(i);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mListenAdapter.mMediaplayer != null) {
            if (mListenAdapter.mMediaplayer.isPlaying()) {
                mListenAdapter.PlayerStop();
            }
        }
    }

    public void setListenDataL1D1() {
        mEngData.add(getResources().getString(R.string.Day1_1de));
        mEngData.add(getResources().getString(R.string.Day1_1ee));
        mEngData.add(getResources().getString(R.string.Day1_1fe));
        mEngData.add(getResources().getString(R.string.Day1_1ge));
        mEngData.add(getResources().getString(R.string.Day1_1he));
        mEngData.add(getResources().getString(R.string.Day1_1ie));
        mEngData.add(getResources().getString(R.string.Day1_1je));
        mEngData.add(getResources().getString(R.string.Day1_1ke));
        mEngData.add(getResources().getString(R.string.Day1_1le));
        mEngData.add(getResources().getString(R.string.Day1_1me));
        mEngData.add(getResources().getString(R.string.Day1_1ne));
        mEngData.add(getResources().getString(R.string.Day1_1oe));
        mEngData.add(getResources().getString(R.string.Day1_1pe));
        mEngData.add(getResources().getString(R.string.Day1_1qe));
        mEngData.add(getResources().getString(R.string.Day1_1re));
        mEngData.add(getResources().getString(R.string.Day1_1se));

        mMaoriData.add(getResources().getString(R.string.Day1_1d));
        mMaoriData.add(getResources().getString(R.string.Day1_1e));
        mMaoriData.add(getResources().getString(R.string.Day1_1f));
        mMaoriData.add(getResources().getString(R.string.Day1_1g));
        mMaoriData.add(getResources().getString(R.string.Day1_1h));
        mMaoriData.add(getResources().getString(R.string.Day1_1i));
        mMaoriData.add(getResources().getString(R.string.Day1_1j));
        mMaoriData.add(getResources().getString(R.string.Day1_1k));
        mMaoriData.add(getResources().getString(R.string.Day1_1l));
        mMaoriData.add(getResources().getString(R.string.Day1_1m));
        mMaoriData.add(getResources().getString(R.string.Day1_1n));
        mMaoriData.add(getResources().getString(R.string.Day1_1o));
        mMaoriData.add(getResources().getString(R.string.Day1_1p));
        mMaoriData.add(getResources().getString(R.string.Day1_1q));
        mMaoriData.add(getResources().getString(R.string.Day1_1r));
        mMaoriData.add(getResources().getString(R.string.Day1_1s));

        mVoiceId.add(R.raw.p1_1);
        mVoiceId.add(R.raw.p1_2);
        mVoiceId.add(R.raw.p1_3);
        mVoiceId.add(R.raw.p1_4);
        mVoiceId.add(R.raw.p1_5);
        mVoiceId.add(R.raw.p1_6);
        mVoiceId.add(R.raw.p1_7);
        mVoiceId.add(R.raw.p1_8);
        mVoiceId.add(R.raw.p1_9);
        mVoiceId.add(R.raw.p1_10);
        mVoiceId.add(R.raw.p1_11);
        mVoiceId.add(R.raw.p1_12);
        mVoiceId.add(R.raw.p1_13);
        mVoiceId.add(R.raw.p1_14);
        mVoiceId.add(R.raw.p1_15);
        mVoiceId.add(R.raw.p1_16);
    }

    private void setListenDataL1D2() {

        mMaoriData.add(getResources().getString(R.string.Day2_4a));
        mMaoriData.add(getResources().getString(R.string.Day2_4b));
        mMaoriData.add(getResources().getString(R.string.Day2_4c));
        mMaoriData.add(getResources().getString(R.string.Day2_4d));
        mMaoriData.add(getResources().getString(R.string.Day2_4e));
        mMaoriData.add(getResources().getString(R.string.Day2_4f));
        mMaoriData.add(getResources().getString(R.string.Day2_4g));
        mMaoriData.add(getResources().getString(R.string.Day2_4h));
        mMaoriData.add(getResources().getString(R.string.Day2_4i));
        mMaoriData.add(getResources().getString(R.string.Day2_4j));
        mMaoriData.add(getResources().getString(R.string.Day2_4k));
        mMaoriData.add(getResources().getString(R.string.Day2_4l));
        mMaoriData.add(getResources().getString(R.string.Day2_4m));
        mMaoriData.add(getResources().getString(R.string.Day2_4n));
        mMaoriData.add(getResources().getString(R.string.Day2_4o));
        mMaoriData.add(getResources().getString(R.string.Day2_4p));
        mMaoriData.add(getResources().getString(R.string.Day2_4q));
        mMaoriData.add(getResources().getString(R.string.Day2_4r));
        mMaoriData.add(getResources().getString(R.string.Day2_4s));
        mMaoriData.add(getResources().getString(R.string.Day2_5a));
        mMaoriData.add(getResources().getString(R.string.Day2_5b));
        mMaoriData.add(getResources().getString(R.string.Day2_5c));
        mMaoriData.add(getResources().getString(R.string.Day2_5d));
        mMaoriData.add(getResources().getString(R.string.Day2_5e));
        mMaoriData.add(getResources().getString(R.string.Day2_5g));
        mMaoriData.add(getResources().getString(R.string.Day2_5h));
        mMaoriData.add(getResources().getString(R.string.Day2_5j));
        mMaoriData.add(getResources().getString(R.string.Day2_5k));
        mMaoriData.add(getResources().getString(R.string.Day2_5l));
        mMaoriData.add(getResources().getString(R.string.Day2_5m));
        mMaoriData.add(getResources().getString(R.string.Day2_5n));
        mMaoriData.add(getResources().getString(R.string.Day2_5o));

        mEngData.add(getResources().getString(R.string.Day2_4ar));
        mEngData.add(getResources().getString(R.string.Day2_4br));
        mEngData.add(getResources().getString(R.string.Day2_4cr));
        mEngData.add(getResources().getString(R.string.Day2_4dr));
        mEngData.add(getResources().getString(R.string.Day2_4er));
        mEngData.add(getResources().getString(R.string.Day2_4fr));
        mEngData.add(getResources().getString(R.string.Day2_4gr));
        mEngData.add(getResources().getString(R.string.Day2_4hr));
        mEngData.add(getResources().getString(R.string.Day2_4ir));
        mEngData.add(getResources().getString(R.string.Day2_4jr));
        mEngData.add(getResources().getString(R.string.Day2_4kr));
        mEngData.add(getResources().getString(R.string.Day2_4lr));
        mEngData.add(getResources().getString(R.string.Day2_4mr));
        mEngData.add(getResources().getString(R.string.Day2_4nr));
        mEngData.add(getResources().getString(R.string.Day2_4or));
        mEngData.add(getResources().getString(R.string.Day2_4pr));
        mEngData.add(getResources().getString(R.string.Day2_4qr));
        mEngData.add(getResources().getString(R.string.Day2_4rr));
        mEngData.add(getResources().getString(R.string.Day2_4sr));
        mEngData.add("");
        mEngData.add("");
        mEngData.add(getResources().getString(R.string.Day2_5cr));
        mEngData.add(getResources().getString(R.string.Day2_5dr));
        mEngData.add(getResources().getString(R.string.Day2_5er));
        mEngData.add(getResources().getString(R.string.Day2_5fr));
        mEngData.add(getResources().getString(R.string.Day2_5gr));
        mEngData.add(getResources().getString(R.string.Day2_5hr));
        mEngData.add(getResources().getString(R.string.Day2_5jr));
        mEngData.add(getResources().getString(R.string.Day2_5kr));
        mEngData.add(getResources().getString(R.string.Day2_5lr));
        mEngData.add(getResources().getString(R.string.Day2_5mr));
        mEngData.add(getResources().getString(R.string.Day2_5nr));
        mEngData.add(getResources().getString(R.string.Day2_5or));

        mVoiceId.add(R.raw.lev1d2_2);
        mVoiceId.add(R.raw.lev1d2_3);
        mVoiceId.add(R.raw.lev1d2_4);
        mVoiceId.add(R.raw.lev1d2_5);
        mVoiceId.add(R.raw.lev1d2_6);
        mVoiceId.add(R.raw.lev1d2_7);
        mVoiceId.add(R.raw.lev1d2_8);
        mVoiceId.add(R.raw.lev1d2_9);
        mVoiceId.add(R.raw.lev1d2_10);
        mVoiceId.add(R.raw.lev1d2_11);
        mVoiceId.add(R.raw.lev1d2_12);
        mVoiceId.add(R.raw.lev1d2_13);
        mVoiceId.add(R.raw.lev1d2_14);
        mVoiceId.add(R.raw.lev1d2_15);
        mVoiceId.add(R.raw.lev1d2_16);
        mVoiceId.add(R.raw.lev1d2_17);
        mVoiceId.add(R.raw.lev1d2_18);
        mVoiceId.add(R.raw.lev1d2_19);
        mVoiceId.add(R.raw.lev1d2_20);
        mVoiceId.add(R.raw.he_whakamrama_mihi);
        mVoiceId.add(R.raw.say_good_bye_number);
        mVoiceId.add(R.raw.haere);
        mVoiceId.add(R.raw.e_noho_ra);
        mVoiceId.add(R.raw.ka_kite_i);
        mVoiceId.add(R.raw.hei_apopo);
        mVoiceId.add(R.raw.noho_ora);
        mVoiceId.add(R.raw.haere_ra_tama);
        mVoiceId.add(R.raw.e_noho_ra_pita);
        mVoiceId.add(R.raw.ka_kite_i);
        mVoiceId.add(R.raw.ae_e_pita);
        mVoiceId.add(R.raw.hei_apopo);
        mVoiceId.add(R.raw.noho_ora_mai);

    }

    private void setListenDataL1D3() {
        mMaoriData.add(getResources().getString(R.string.ListenL1D3MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL1D3MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL1D3MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.ListenL1D3MaoriPart4));
        mMaoriData.add(getResources().getString(R.string.ListenL1D3MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.ListenL1D3MaoriPart6));

        mEngData.add(getResources().getString(R.string.ListenL1D3EngPart1));
        mEngData.add(getResources().getString(R.string.ListenL1D3EngPart2));
        mEngData.add(getResources().getString(R.string.ListenL1D3EngPart3));
        mEngData.add(getResources().getString(R.string.ListenL1D3EngPart4));
        mEngData.add(getResources().getString(R.string.ListenL1D3EngPart5));
        mEngData.add(getResources().getString(R.string.ListenL1D3EngPart6));

        mVoiceId.add(R.raw.l1day3_5);
        mVoiceId.add(R.raw.l1day3_6);
        mVoiceId.add(R.raw.l1day3_7);
        mVoiceId.add(R.raw.l1day3_8);
    }

    private void setListenDataL1D4() {
        mMaoriData.add(getResources().getString(R.string.ListenL1D4MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL1D4MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL1D4MaoriPart3));
        mMaoriData.add("");

        mEngData.add(getResources().getString(R.string.ListenL1D4EngPart1));
        mEngData.add(getResources().getString(R.string.ListenL1D4EngPart2));
        mEngData.add(getResources().getString(R.string.ListenL1D4EngPart3));
        mEngData.add(getResources().getString(R.string.ListenL1D4EngPart4));

        mVoiceId.add(R.raw.day4_3);
        mVoiceId.add(R.raw.day4_4);
        mVoiceId.add(R.raw.day4_5);
        mVoiceId.add(R.raw.day4_6);
    }

    private void setListenDataL1D5() {
        mMaoriData.add(getResources().getString(R.string.ListenL1D5MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL1D5MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL1D5MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.ListenL1D5MaoriPart4));
        mMaoriData.add(getResources().getString(R.string.ListenL1D5MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.ListenL1D5MaoriPart6));
        mMaoriData.add(getResources().getString(R.string.ListenL1D5MaoriPart7));
        mMaoriData.add(getResources().getString(R.string.ListenL1D5MaoriPart8));
        mMaoriData.add(getResources().getString(R.string.ListenL1D5MaoriPart9));
        mMaoriData.add(getResources().getString(R.string.ListenL1D5MaoriPart10));
        mMaoriData.add(getResources().getString(R.string.ListenL1D5MaoriPart11));
        mMaoriData.add(getResources().getString(R.string.ListenL1D5MaoriPart12));
        mMaoriData.add(getResources().getString(R.string.ListenL1D5MaoriPart13));
        mMaoriData.add(getResources().getString(R.string.ListenL1D5MaoriPart14));

        mEngData.add(getResources().getString(R.string.ListenL1D5EngPart1));
        mEngData.add(getResources().getString(R.string.ListenL1D5EngPart2));
        mEngData.add(getResources().getString(R.string.ListenL1D5EngPart3));
        mEngData.add(getResources().getString(R.string.ListenL1D5EngPart4));
        mEngData.add(getResources().getString(R.string.ListenL1D5EngPart5));
        mEngData.add(getResources().getString(R.string.ListenL1D5EngPart6));
        mEngData.add(getResources().getString(R.string.ListenL1D5EngPart7));
        mEngData.add(getResources().getString(R.string.ListenL1D5EngPart8));
        mEngData.add(getResources().getString(R.string.ListenL1D5EngPart9));
        mEngData.add(getResources().getString(R.string.ListenL1D5EngPart10));
        mEngData.add(getResources().getString(R.string.ListenL1D5EngPart11));
        mEngData.add(getResources().getString(R.string.ListenL1D5EngPart12));
        mEngData.add(getResources().getString(R.string.ListenL1D5EngPart13));
        mEngData.add(getResources().getString(R.string.ListenL1D5EngPart14));

        mVoiceId.add(R.raw.l1day5_3);
        mVoiceId.add(R.raw.l1day5_4);
        mVoiceId.add(R.raw.l1day5_5);
        mVoiceId.add(R.raw.l1day5_6);
        mVoiceId.add(R.raw.l1day5_7);
        mVoiceId.add(R.raw.l1day5_8);
        mVoiceId.add(R.raw.l1day5_9);
        mVoiceId.add(R.raw.l1day5_10);
        mVoiceId.add(R.raw.l1day5_11);
        mVoiceId.add(R.raw.l1day5_12);
        mVoiceId.add(R.raw.l1day5_13);
        mVoiceId.add(R.raw.l1day5_14);
        mVoiceId.add(R.raw.l1day5_15);
        mVoiceId.add(R.raw.l1day5_16);
    }

    private void setListenDataL2D1() {
        mMaoriData.add(getResources().getString(R.string.ListenL2D1Title1));
        mMaoriData.add(getResources().getString(R.string.ListenL2D1Title2));
        mMaoriData.add(getResources().getString(R.string.ListenL2D1Title1));
        mMaoriData.add(getResources().getString(R.string.ListenL2D1Title2));

        mEngData.add(getResources().getString(R.string.ListenL2D1Part1));
        mEngData.add(getResources().getString(R.string.ListenL2D1Part2));
        mEngData.add(getResources().getString(R.string.ListenL2D1Part3));
        mEngData.add(getResources().getString(R.string.ListenL2D1Part4));

        mVoiceId.add(R.raw.w2day1_2);
        mVoiceId.add(R.raw.w2day1_7);
        mVoiceId.add(R.raw.w2day1_3);
        mVoiceId.add(R.raw.w2day1_8);
    }

    private void setListenDataL2D2() {
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart4));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart6));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart7));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart8));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart9));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart10));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart11));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart12));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart13));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart14));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart15));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart16));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart17));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart18));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart19));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart20));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart21));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart22));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart23));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart24));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart25));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart26));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart27));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart28));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart29));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart30));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart31));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart32));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart33));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart34));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart35));
        mMaoriData.add(getResources().getString(R.string.ListenL2D2MaoriPart36));


        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart1));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart2));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart3));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart4));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart5));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart6));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart7));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart8));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart9));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart10));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart11));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart12));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart13));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart14));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart15));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart16));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart17));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart18));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart19));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart20));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart21));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart22));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart23));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart24));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart25));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart26));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart27));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart28));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart29));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart30));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart31));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart32));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart33));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart34));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart35));
        mEngData.add(getResources().getString(R.string.ListenL2D2EngPart36));


        mVoiceId.add(0);
        mVoiceId.add(R.raw.daytwo_two);
        mVoiceId.add(R.raw.daytwo_three);
        mVoiceId.add(R.raw.daytwo_four);
        mVoiceId.add(R.raw.daytwo_five);
        mVoiceId.add(R.raw.daytwo_six);
        mVoiceId.add(R.raw.daytwo_seven);
        mVoiceId.add(R.raw.daytwo_eight);
        mVoiceId.add(R.raw.daytwo_nine);
        mVoiceId.add(R.raw.daytwo_ten);
        mVoiceId.add(R.raw.daytwo_eleven);

        mVoiceId.add(0);
        mVoiceId.add(R.raw.daytwo_twelve);
        mVoiceId.add(R.raw.daytwo_thirteen);
        mVoiceId.add(R.raw.daytwo_forteen);
        mVoiceId.add(R.raw.daytwo_fifteen);
        mVoiceId.add(0);
        mVoiceId.add(R.raw.daytwo_seventeen);
        mVoiceId.add(R.raw.daytwo_eighteen);


        mVoiceId.add(0);
        mVoiceId.add(R.raw.daytwo__ninteen);
        mVoiceId.add(R.raw.daytwo_twenty);
        mVoiceId.add(R.raw.daytwo_twentyone);
        mVoiceId.add(R.raw.daytwo_twentythree);
        mVoiceId.add(R.raw.daytwo_twentyfour);
        mVoiceId.add(R.raw.daytwo_twentyfive);
        mVoiceId.add(R.raw.daytwo_twentysix);
        mVoiceId.add(R.raw.daytwo_twentyseven);
        mVoiceId.add(R.raw.daytwo_twentyeight);
        mVoiceId.add(R.raw.daytwo_twentynine);
        mVoiceId.add(R.raw.daytwo_thirty);
        //mVoiceId.add(R.raw.daytwo_thirtyone); this file has no match text, this page has 11 text but 12 ogg file.

        mVoiceId.add(0);
        mVoiceId.add(R.raw.daytwo_thirtytwo);
        mVoiceId.add(R.raw.daytwo_thirtythree);
        mVoiceId.add(R.raw.daytwo_thirtyfour);
        mVoiceId.add(R.raw.daytwo_thirtyfive);
        //In previous code, there is a lot of ogg file added to list, see Level2Adapter4 in previous version code
    }

    private void setListenDataL2D3() {
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart4));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart6));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart7));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart8));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart9));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart10));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart11));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart12));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart13));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart14));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart15));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart16));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart17));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart18));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart19));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart20));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart21));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart22));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart23));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart24));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart25));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart26));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart27));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart28));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart29));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart30));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart31));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart32));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart33));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart34));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart35));
        mMaoriData.add(getResources().getString(R.string.ListenL2D3MaoriPart36));


        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart1));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart2));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart3));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart4));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart5));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart6));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart7));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart8));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart9));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart10));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart11));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart12));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart13));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart14));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart15));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart16));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart17));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart18));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart19));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart20));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart21));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart22));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart23));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart24));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart25));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart26));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart27));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart28));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart29));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart30));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart31));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart32));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart33));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart34));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart35));
        mEngData.add(getResources().getString(R.string.ListenL2D3EngPart36));


        mVoiceId.add(R.raw.w2day3_2);
        mVoiceId.add(R.raw.w2day3_5);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(R.raw.w2day3_6);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);
        mVoiceId.add(0);

    }

    private void setListenDataL2D4() {
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart4));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart6));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart7));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart8));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart9));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart10));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart11));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart12));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart13));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart14));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart15));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart16));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart17));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart18));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart19));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart20));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart21));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart22));
        mMaoriData.add(getResources().getString(R.string.ListenL2D4MaoriPart23));

        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart1));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart2));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart3));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart4));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart6));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart7));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart8));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart9));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart10));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart11));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart12));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart13));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart14));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart15));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart16));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart17));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart18));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart19));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart20));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart21));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart22));
        mEngData.add(getResources().getString(R.string.ListenL2D4EngPart23));

        mVoiceId.add(R.raw.w2dayfour_3);
        mVoiceId.add(R.raw.w2dayfour_4);
        mVoiceId.add(R.raw.w2dayfour_5);
        mVoiceId.add(R.raw.w2dayfour_6);
        mVoiceId.add(R.raw.w2dayfour_7);
        mVoiceId.add(R.raw.w2dayfour_8);
        mVoiceId.add(R.raw.w2dayfour_9);
        mVoiceId.add(R.raw.w2dayfour_10);
        mVoiceId.add(R.raw.w2dayfour_11);
        mVoiceId.add(R.raw.w2dayfour_12);
        mVoiceId.add(R.raw.w2dayfour_13);
        mVoiceId.add(R.raw.w2dayfour_14);
        mVoiceId.add(R.raw.w2dayfour_15);
        mVoiceId.add(R.raw.w2dayfour_16);
        mVoiceId.add(R.raw.w2dayfour_17);
        mVoiceId.add(R.raw.w2dayfour_18);
        mVoiceId.add(R.raw.w2dayfour_19);
        mVoiceId.add(R.raw.w2dayfour_20);
        mVoiceId.add(R.raw.w2dayfour_21);
        mVoiceId.add(R.raw.w2dayfour_22);
        mVoiceId.add(R.raw.w2dayfour_23);
        mVoiceId.add(R.raw.w2dayfour_24);
    }

    private void setListenDataL3D1() {
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle1));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle2));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle2));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle2));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle3));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle4));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle3));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle4));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle3));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle4));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle3));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle4));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle3));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle4));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle3));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle4));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle3));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle4));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle3));
        mMaoriData.add(getResources().getString(R.string.ListenL3D1MaoriTitle4));

        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart1));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart2));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart3));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart4));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart5));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart6));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart7));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart8));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart9));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart10));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart11));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart12));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart13));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart14));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart15));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart16));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart17));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart18));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart19));
        mEngData.add(getResources().getString(R.string.ListenL3D1EngPart20));

        mVoiceId.add(R.raw.level3_day1_he_korerorero);
        mVoiceId.add(R.raw.level3_day1_hei_mahi_1);
        mVoiceId.add(R.raw.level3_day1_hei_mahi_2);
        mVoiceId.add(R.raw.level3_day1_hei_mahi_3);
        mVoiceId.add(R.raw.level3_day1_hei_mahi_whakarongo);

    }

    private void setListenDataL3D2() {
        mMaoriData.add(getResources().getString(R.string.ListenL3D2MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL3D2MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL3D2MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL3D2MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL3D2MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.ListenL3D2MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL3D2MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.ListenL3D2MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.ListenL3D2MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL3D2MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL3D2MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.ListenL3D2MaoriPart4));
        mMaoriData.add(getResources().getString(R.string.ListenL3D2MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.ListenL3D2MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.ListenL3D2MaoriPart4));
        mMaoriData.add(getResources().getString(R.string.ListenL3D2MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.ListenL3D2MaoriPart4));

        mEngData.add(getResources().getString(R.string.ListenL3D2EngPart1));
        mEngData.add(getResources().getString(R.string.ListenL3D2EngPart2));
        mEngData.add(getResources().getString(R.string.ListenL3D2EngPart3));
        mEngData.add(getResources().getString(R.string.ListenL3D2EngPart4));
        mEngData.add(getResources().getString(R.string.ListenL3D2EngPart5));
        mEngData.add(getResources().getString(R.string.ListenL3D2EngPart6));
        mEngData.add(getResources().getString(R.string.ListenL3D2EngPart7));
        mEngData.add(getResources().getString(R.string.ListenL3D2EngPart8));
        mEngData.add(getResources().getString(R.string.ListenL3D2EngPart9));
        mEngData.add(getResources().getString(R.string.ListenL3D2EngPart10));
        mEngData.add(getResources().getString(R.string.ListenL3D2EngPart11));
        mEngData.add(getResources().getString(R.string.ListenL3D2EngPart12));
        mEngData.add(getResources().getString(R.string.ListenL3D2EngPart13));
        mEngData.add(getResources().getString(R.string.ListenL3D2EngPart14));
        mEngData.add(getResources().getString(R.string.ListenL3D2EngPart15));
        mEngData.add(getResources().getString(R.string.ListenL3D2EngPart16));
        mEngData.add(getResources().getString(R.string.ListenL3D2EngPart17));

        mVoiceId.add(R.raw.level3_day2_he_korerorero_1);
        mVoiceId.add(R.raw.level3_day2_he_korerorero_2);
        mVoiceId.add(0);
        mVoiceId.add(R.raw.level3_day2_hemahi_whakarongo_korero_hoki);

    }

    private void setListenDataL3D3() {
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart4));
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart6));
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart7));
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart7));
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart6));
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart8));
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart9));
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart9));
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart8));
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart10));
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart11));
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart11));
        mMaoriData.add(getResources().getString(R.string.ListenL3D3MaoriPart10));

        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart1));
        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart2));
        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart3));
        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart4));
        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart5));
        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart6));
        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart7));
        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart8));
        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart9));
        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart10));
        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart11));
        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart12));
        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart13));
        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart14));
        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart15));
        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart16));
        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart17));
        mEngData.add(getResources().getString(R.string.ListenL3D3EngPart18));

        mVoiceId.add(R.raw.level3_day3_hei_mahi_korero_whakarongo_hoki_1);
        mVoiceId.add(R.raw.level3_day3_hei_mahi_korero_whakarongo_hoki_2);
        mVoiceId.add(R.raw.level3_day3_hei_mahi_korero_whakarongo_hoki_3_runga);
        mVoiceId.add(R.raw.level3_day3_hei_mahi_korerow_whakarongo_hoki_4_raro);
        mVoiceId.add(R.raw.level3_day3_hei_mahi_korero_whakarongo_hoki_5_roto);
        mVoiceId.add(R.raw.level3_day3_hei_mahi_korero_whakarongo_hoki_6_waho);
        mVoiceId.add(R.raw.level3_day3_hei_mahi_korero_whakarongo_hoki_1);
    }

    private void setListenDataL3D4() {
        mMaoriData.add(getResources().getString(R.string.ListenL3D4MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL3D4MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL3D4MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL3D4MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL3D4MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL3D4MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL3D4MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL3D4MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL3D4MaoriPart1));

        mEngData.add(getResources().getString(R.string.ListenL3D4EngPart1));
        mEngData.add(getResources().getString(R.string.ListenL3D4EngPart2));
        mEngData.add(getResources().getString(R.string.ListenL3D4EngPart3));
        mEngData.add(getResources().getString(R.string.ListenL3D4EngPart4));
        mEngData.add(getResources().getString(R.string.ListenL3D4EngPart5));
        mEngData.add(getResources().getString(R.string.ListenL3D4EngPart6));
        mEngData.add(getResources().getString(R.string.ListenL3D4EngPart7));
        mEngData.add(getResources().getString(R.string.ListenL3D4EngPart8));
        mEngData.add(getResources().getString(R.string.ListenL3D4EngPart9));

        mVoiceId.add(R.raw.level3_day4_hei_mahi_whakarongo_korero_hoki);
        mVoiceId.add(R.raw.level3_day4_hei_mahi_whakarongo_korero_hoki_2);
        mVoiceId.add(R.raw.level3_day4_hei_mahi_whakarongo_korero_hoki_3);
        mVoiceId.add(R.raw.level3_day4_hei_mahi_whakarongo_korero_hoki_4);
        mVoiceId.add(R.raw.level3_day4_audio5);
        mVoiceId.add(R.raw.level3_day4_hei_mahi_whakarongo_korero_hoki_6_number);
        mVoiceId.add(R.raw.level3_day4_hei_mahi_whakarongo_korero_hoki_7_number);
        mVoiceId.add(R.raw.level3_day4_hei_tauira_1);
        mVoiceId.add(R.raw.level3_day4_hei_tauira_2);
    }

    private void setListenDataL3D5() {
        mMaoriData.add(getResources().getString(R.string.ListenL3D5MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL3D5MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL3D5MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.ListenL3D5MaoriPart4));
        mMaoriData.add(getResources().getString(R.string.ListenL3D5MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.ListenL3D5MaoriPart6));
        mMaoriData.add(getResources().getString(R.string.ListenL3D5MaoriPart7));

        mEngData.add(getResources().getString(R.string.ListenL3D5EngPart1));
        mEngData.add(getResources().getString(R.string.ListenL3D5EngPart2));
        mEngData.add(getResources().getString(R.string.ListenL3D5EngPart3));
        mEngData.add(getResources().getString(R.string.ListenL3D5EngPart4));
        mEngData.add(getResources().getString(R.string.ListenL3D5EngPart5));
        mEngData.add(getResources().getString(R.string.ListenL3D5EngPart6));
        mEngData.add(getResources().getString(R.string.ListenL3D5EngPart7));

        mVoiceId.add(R.raw.level3_day5_hei_mahi_whakarongo_korero_hoki_1);
        mVoiceId.add(R.raw.level3_day5_hei_mahi_whakarongo_korero_hoki_2);
        mVoiceId.add(R.raw.level3_day5_singularandplural);
        mVoiceId.add(0);
        mVoiceId.add(R.raw.level3_day5_hei_mahi_whakarongo_korero_hoki_4);
        mVoiceId.add(R.raw.level3_day5_hei_mahi_whakarongo_korero_hoki_6);
        mVoiceId.add(R.raw.level3_day4_audio5);
    }

    private void setListenDataL4D1() {
        mMaoriData.add(getResources().getString(R.string.ListenL4D1MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL4D1MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL4D1MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.ListenL4D1MaoriPart4));
        mMaoriData.add(getResources().getString(R.string.ListenL4D1MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.ListenL4D1MaoriPart6));
        mMaoriData.add(getResources().getString(R.string.ListenL4D1MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.ListenL4D1MaoriPart7));
        mMaoriData.add(getResources().getString(R.string.ListenL4D1MaoriPart8));

        mEngData.add(getResources().getString(R.string.ListenL4D1EngPart1));
        mEngData.add(getResources().getString(R.string.ListenL4D1EngPart2));
        mEngData.add(getResources().getString(R.string.ListenL4D1EngPart3));
        mEngData.add(getResources().getString(R.string.ListenL4D1EngPart4));
        mEngData.add(getResources().getString(R.string.ListenL4D1EngPart5));
        mEngData.add(getResources().getString(R.string.ListenL4D1EngPart6));
        mEngData.add(getResources().getString(R.string.ListenL4D1EngPart7));
        mEngData.add(getResources().getString(R.string.ListenL4D1EngPart8));

        mVoiceId.add(R.raw.level4_day1_b);
        mVoiceId.add(R.raw.level4_day1_c);
        mVoiceId.add(0);
        mVoiceId.add(R.raw.level4_day1_d);
        mVoiceId.add(R.raw.level4_day1_e);
        mVoiceId.add(R.raw.level4_day1_f);
    }

    private void setListenDataL4D2() {
        mMaoriData.add(getResources().getString(R.string.ListenL4D2MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL4D2MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL4D2MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.ListenL4D2MaoriPart4));
        mMaoriData.add(getResources().getString(R.string.ListenL4D2MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.ListenL4D2MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL4D2MaoriPart6));
        mMaoriData.add(getResources().getString(R.string.ListenL4D2MaoriPart7));


        mEngData.add(getResources().getString(R.string.ListenL4D2EngPart1));
        mEngData.add(getResources().getString(R.string.ListenL4D2EngPart2));
        mEngData.add(getResources().getString(R.string.ListenL4D2EngPart3));
        mEngData.add(getResources().getString(R.string.ListenL4D2EngPart4));
        mEngData.add(getResources().getString(R.string.ListenL4D2EngPart5));
        mEngData.add(getResources().getString(R.string.ListenL4D2EngPart6));
        mEngData.add(getResources().getString(R.string.ListenL4D2EngPart7));
        mEngData.add(getResources().getString(R.string.ListenL4D2EngPart8));

        mVoiceId.add(R.raw.level4_day2_c);
        mVoiceId.add(0);
        mVoiceId.add(R.raw.level4_day2_d);
        mVoiceId.add(R.raw.level4_day2_e);
        mVoiceId.add(R.raw.level4_day2_f);
        mVoiceId.add(0);
        mVoiceId.add(R.raw.level4_day2_e);
        mVoiceId.add(R.raw.level4_day2_f);
    }

    private void setListenDataL4D3() {
        mMaoriData.add(getResources().getString(R.string.ListenL4D3MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL4D3MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL4D3MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.ListenL4D3MaoriPart4));
        mMaoriData.add(getResources().getString(R.string.ListenL4D3MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.ListenL4D3MaoriPart6));
        mMaoriData.add(getResources().getString(R.string.ListenL4D3MaoriPart7));

        mEngData.add(getResources().getString(R.string.ListenL4D3EngPart1));
        mEngData.add(getResources().getString(R.string.ListenL4D3EngPart2));
        mEngData.add(getResources().getString(R.string.ListenL4D3EngPart3));
        mEngData.add(getResources().getString(R.string.ListenL4D3EngPart4));
        mEngData.add(getResources().getString(R.string.ListenL4D3EngPart5));
        mEngData.add(getResources().getString(R.string.ListenL4D3EngPart6));
        mEngData.add(getResources().getString(R.string.ListenL4D3EngPart7));

        mVoiceId.add(R.raw.level4_week3_b);
        mVoiceId.add(R.raw.level4_day3_c);
        mVoiceId.add(R.raw.level4_day3_d);
        mVoiceId.add(R.raw.level4_day3_e);
        mVoiceId.add(0);
        mVoiceId.add(R.raw.level4_day3_f);
        mVoiceId.add(R.raw.level4_day3_g);
    }

    private void setListenDataL4D4() {
        mMaoriData.add(getResources().getString(R.string.ListenL4D4MaoriPart1));
        mMaoriData.add(getResources().getString(R.string.ListenL4D4MaoriPart2));
        mMaoriData.add(getResources().getString(R.string.ListenL4D4MaoriPart3));
        mMaoriData.add(getResources().getString(R.string.ListenL4D4MaoriPart4));
        mMaoriData.add(getResources().getString(R.string.ListenL4D4MaoriPart5));
        mMaoriData.add(getResources().getString(R.string.ListenL4D4MaoriPart6));
        mMaoriData.add(getResources().getString(R.string.ListenL4D4MaoriPart7));


        mEngData.add(getResources().getString(R.string.ListenL4D4EngPart1));
        mEngData.add(getResources().getString(R.string.ListenL4D4EngPart2));
        mEngData.add(getResources().getString(R.string.ListenL4D4EngPart3));
        mEngData.add(getResources().getString(R.string.ListenL4D4EngPart4));
        mEngData.add(getResources().getString(R.string.ListenL4D4EngPart5));
        mEngData.add(getResources().getString(R.string.ListenL4D4EngPart6));
        mEngData.add(getResources().getString(R.string.ListenL4D4EngPart7));


        mVoiceId.add(R.raw.level4_day4_b);
        mVoiceId.add(R.raw.level4_day4_c);
        mVoiceId.add(R.raw.level4_day4_d);
        mVoiceId.add(R.raw.level4_day4_e);
        mVoiceId.add(0);
        mVoiceId.add(R.raw.level4_day4_f);
        mVoiceId.add(R.raw.level4_day4_g);
    }

    private void setListenDataL4D5() {
        mMaoriData.add(getResources().getString(R.string.ListenL4D5MaoriPart1));

        mEngData.add(getResources().getString(R.string.ListenL4D5EngPart1));

        mVoiceId.add(R.raw.level4_day5_b);

    }
}

