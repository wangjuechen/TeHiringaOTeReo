package company.com.tehiringaotereoTest;


import android.app.AlertDialog;
import android.app.DialogFragment;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;


public class MainActivity extends FragmentActivity implements GameFragment.OnFragmentInteractionListener,
        VoiceFragment.OnFragmentInteractionListener, ScoreFragment.OnFragmentInteractionListener, HelpFragment.OnFragmentInteractionListener{
    private SharedPreferences shPref;
    private int TotalScore;
    private ImageButton btn_level1;
    private ImageButton btn_level2;
    private ImageButton btn_level3;
    private ImageButton btn_level4;
    private int mLevelAccesser;

    private BottomNavigationView.OnNavigationItemSelectedListener mNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener(){

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case(R.id.game_btn):{
                    shiftToGamePage();
                    return true;
                }
                case(R.id.voice_btn):{
                    shiftToVoicePage();
                    return true;

                }
                case(R.id.score_btn):{
                    shiftToScorePage();
                    return true;

                }
                case(R.id.help_btn):{
                    shiftToHelpPage();
                    return true;
                }
            }

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        GameFragment gameFragment = new GameFragment();

        FragmentManager manager = getSupportFragmentManager();

        manager.beginTransaction().add(R.id.fragment_container,gameFragment).commit();

        TextView tx = (TextView) findViewById(R.id.tv_leftTitleExtended);

        BottomNavigationViewEx bnve = (BottomNavigationViewEx) findViewById(R.id.navigation);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "JosefinSans-Light.ttf");

        //tx.setTypeface(custom_font);

        bnve.setOnNavigationItemSelectedListener(mNavigationItemSelectedListener);
        bnve.enableItemShiftingMode(false);
        bnve.enableShiftingMode(false);



    }

    protected void onResume() {
        super.onResume();


        /*shPref = PreferenceManager.getDefaultSharedPreferences(this);
        TotalScore = shPref.getInt("Level 1Score", 0) + shPref.getInt("Level 2Score", 0) + shPref.getInt("Level 3Score", 0)
                + shPref.getInt("Level 4Score", 0);

        mLevelAccesser = shPref.getInt("levelEnterance", 1);

        SharedPreferences.Editor editor = shPref.edit();

        //TotalScore = 90;
        //mLevelAccesser = 2;

        if (TotalScore >= 48 && mLevelAccesser == 1) {
            mLevelAccesser = 2;
            DialogFragment newFragment = new DialogForEnteringLevel2Fragment();
            newFragment.show(getFragmentManager(), "EnteringLevel2");


        } else if (TotalScore >= 86 && mLevelAccesser == 2) {//TODO 86 is not accurate , need reccalculate, i think its 123*80% = 98
            mLevelAccesser = 3;
            DialogFragment newFragment = new DialogForEnteringLevel3Fragment();
            newFragment.show(getFragmentManager(), "EnteringLevel3");


        } else if (TotalScore >= 165 && mLevelAccesser == 3) {//TODO 165 is not accurate , need reccalculate
            mLevelAccesser = 4;
            DialogFragment newFragment = new DialogForEnteringLevel4Fragment();
            newFragment.show(getFragmentManager(), "EnteringLevel4");
        }

        editor.putInt("levelEnterance", mLevelAccesser);
        editor.putInt("totalScore",TotalScore);

        btn_level1 = (ImageButton) findViewById(R.id.btn_level1);
        btn_level2 = (ImageButton) findViewById(R.id.btn_level2);
        btn_level3 = (ImageButton) findViewById(R.id.btn_level3);
        btn_level4 = (ImageButton) findViewById(R.id.btn_level4);
       *//* btn_Game = (LinearLayout) findViewById(R.id.btn_play);
        btn_help = (LinearLayout) findViewById(R.id.btn_help);
        btn_score = (LinearLayout) findViewById(R.id.btn_score);
        btn_voice = (LinearLayout) findViewById(R.id.btn_voice);
        *//*
        if(mLevelAccesser ==2){
            btn_level2.setImageResource(R.drawable.defaultpage_level2_icon);
        }
        else if(mLevelAccesser ==3){
            btn_level2.setImageResource(R.drawable.defaultpage_level2_icon);
            btn_level3.setImageResource(R.drawable.defaultpage_level3_icon);
        }
        else if(mLevelAccesser ==4){
            btn_level2.setImageResource(R.drawable.defaultpage_level2_icon);
            btn_level3.setImageResource(R.drawable.defaultpage_level3_icon);
            btn_level4.setImageResource(R.drawable.defaultpage_level4_icon);
        }


        btn_level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Topics_ForAllDays_Activity.class);
                intent.putExtra("level", "Level 1");
                startActivity(intent);
            }
        });

        btn_level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mLevelAccesser >= 2) {
                    Intent i = new Intent(MainActivity.this, Topics_ForAllDays_Activity.class);
                    i.putExtra("level", "Level 2");
                    startActivity(i);

                } else {
                    //alertDialog(String.valueOf(Week1totalScore), "You need 80% marks (48 scores).Try Level 1 Exercises Again to Unlock Level 2");
                }
            }
        });

        btn_level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mLevelAccesser >= 3) {
                    Intent i = new Intent(MainActivity.this, Topics_ForAllDays_Activity.class);
                    i.putExtra("level", "Level 3");
                    startActivity(i);

                } else {//TODO need design a new dialog
                    //alertDialog(String.valueOf(Week1totalScore), "You need 80% marks(86 scores). Try Level 1 and 2 Exercises Again to Unlock Level 3");
                }
            }
        });

        btn_level4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mLevelAccesser >= 4) {
                    Intent i = new Intent(MainActivity.this, Topics_ForAllDays_Activity.class);
                    i.putExtra("level", "Level 4");
                    startActivity(i);
                } else {
                    //alertDialog(String.valueOf(Week1totalScore), "You need 80% marks(165 scores).Try Level 2 and 3 Exercises Again to Unlock Level 4");
                }

            }
        });

        *//*btn_Game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                //intent.putExtra("title", "Game");
                startActivity(intent);
            }
        });


        btn_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Help.class);
                //intent.putExtra("title", "Help");
                startActivity(intent);
            }
        });

        btn_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Score.class);
                //intent.putExtra("title", "Score");
                startActivity(intent);
            }
        });

        btn_voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Voice.class);
                //intent.putExtra("title", "Voice");
                startActivity(intent);
            }
        });*/
    }




    public void alertDialog(String score, String message) {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(new ContextThemeWrapper(this, android.R.style.Theme_Holo_Light_Dialog));
        //TODO here might can be changed to another dialog style to achieve

        alertDialogBuilder
                .setMessage(message)
                .setTitle("Your Scores-" + score)
                .setCancelable(false)

                .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int arg1) {
                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();

        alertDialog.show();
    }

    private void shiftToGamePage(){
        GameFragment gameFragment = new GameFragment();

        FragmentManager manager = getSupportFragmentManager();

        manager.beginTransaction().replace(R.id.fragment_container,gameFragment).commit();
    }

    private void shiftToVoicePage(){
        VoiceFragment voiceFragment = new VoiceFragment();

        FragmentManager manager = getSupportFragmentManager();

        manager.beginTransaction().replace(R.id.fragment_container,voiceFragment).commit();
    }

    private void shiftToScorePage(){
        ScoreFragment scoreFragment = new ScoreFragment();

        FragmentManager manager = getSupportFragmentManager();

        manager.beginTransaction().replace(R.id.fragment_container,scoreFragment).commit();
    }

    private void shiftToHelpPage(){
        HelpFragment helpFragment = new HelpFragment();

        FragmentManager manager = getSupportFragmentManager();

        manager.beginTransaction().add(R.id.fragment_container,helpFragment).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}