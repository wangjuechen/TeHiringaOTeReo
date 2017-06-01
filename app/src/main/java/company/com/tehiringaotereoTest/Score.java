package company.com.tehiringaotereoTest;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Score extends Activity {

    @BindView(R.id.tv_totalScore)
    TextView mTotalScore;
    @BindView(R.id.tv_level1Score)
    TextView mLevel1Score;
    @BindView(R.id.tv_level2Score)
    TextView mLevel2Score;
    @BindView(R.id.tv_level3Score)
    TextView mLevel3Score;
    @BindView(R.id.tv_level4Score)
    TextView mLevel4Score;
    @BindView(R.id.tv_level1Day1Score)
    TextView mLevel1Day1Score;
    @BindView(R.id.tv_level1Day2Score)
    TextView mLevel1Day2Score;
    @BindView(R.id.tv_level1Day3Score)
    TextView mLevel1Day3Score;
    @BindView(R.id.tv_level1Day4Score)
    TextView mLevel1Day4Score;
    @BindView(R.id.tv_level1Day5Score)
    TextView mLevel1Day5Score;
    @BindView(R.id.tv_level2Day1Score)
    TextView mLevel2Day1Score;
    @BindView(R.id.tv_level2Day2Score)
    TextView mLevel2Day2Score;
    @BindView(R.id.tv_level2Day3Score)
    TextView mLevel2Day3Score;
    @BindView(R.id.tv_level2Day4Score)
    TextView mLevel2Day4Score;
    @BindView(R.id.tv_level3Day1Score)
    TextView mLevel3Day1Score;
    @BindView(R.id.tv_level3Day2Score)
    TextView mLevel3Day2Score;
    @BindView(R.id.tv_level3Day3Score)
    TextView mLevel3Day3Score;
    @BindView(R.id.tv_level3Day4Score)
    TextView mLevel3Day4Score;
    @BindView(R.id.tv_level4Day1Score)
    TextView mLevel4Day1Score;
    @BindView(R.id.tv_level4Day2Score)
    TextView mLevel4Day2Score;
    @BindView(R.id.tv_level4Day3Score)
    TextView mLevel4Day3Score;
    @BindView(R.id.tv_level4Day4Score)
    TextView mLevel4Day4Score;
    @BindView(R.id.tv_level4Day5Score)
    TextView mLevel4Day5Score;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.score);

        ButterKnife.bind(this);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        mTotalScore.setText(String.valueOf(sharedPreferences.getInt("totalScore", 0)));
        mLevel1Score.setText(String.valueOf(sharedPreferences.getInt("Level 1Score", 0)));
        mLevel2Score.setText(String.valueOf(sharedPreferences.getInt("Level 2Score", 0)));
        mLevel3Score.setText(String.valueOf(sharedPreferences.getInt("Level 3Score", 0)));
        mLevel4Score.setText(String.valueOf(sharedPreferences.getInt("Level 4Score", 0)));

        mLevel1Day1Score.setText(String.valueOf(sharedPreferences.getInt("Level 1Day1Score", 0)));
        mLevel1Day2Score.setText(String.valueOf(sharedPreferences.getInt("Level 1Day2Score", 0)));
        mLevel1Day3Score.setText(String.valueOf(sharedPreferences.getInt("Level 1Day3Score", 0)));
        mLevel1Day4Score.setText(String.valueOf(sharedPreferences.getInt("Level 1Day4Score", 0)));
        mLevel1Day5Score.setText(String.valueOf(sharedPreferences.getInt("Level 1Day5Score", 0)));

        mLevel2Day1Score.setText(String.valueOf(sharedPreferences.getInt("Level 2Day1Score", 0)));
        mLevel2Day2Score.setText(String.valueOf(sharedPreferences.getInt("Level 2Day2Score", 0)));
        mLevel2Day3Score.setText(String.valueOf(sharedPreferences.getInt("Level 2Day3Score", 0)));
        mLevel2Day4Score.setText(String.valueOf(sharedPreferences.getInt("Level 2Day4Score", 0)));

        mLevel3Day1Score.setText(String.valueOf(sharedPreferences.getInt("Level 3Day1Score", 0)));
        mLevel3Day2Score.setText(String.valueOf(sharedPreferences.getInt("Level 3Day2Score", 0)));
        mLevel3Day3Score.setText(String.valueOf(sharedPreferences.getInt("Level 3Day3Score", 0)));
        mLevel3Day4Score.setText(String.valueOf(sharedPreferences.getInt("Level 3Day4Score", 0)));

        mLevel4Day1Score.setText(String.valueOf(sharedPreferences.getInt("Level 4Day1Score", 0)));
        mLevel4Day2Score.setText(String.valueOf(sharedPreferences.getInt("Level 4Day2Score", 0)));
        mLevel4Day3Score.setText(String.valueOf(sharedPreferences.getInt("Level 4Day3Score", 0)));
        mLevel4Day4Score.setText(String.valueOf(sharedPreferences.getInt("Level 4Day4Score", 0)));
        mLevel4Day5Score.setText(String.valueOf(sharedPreferences.getInt("Level 4Day5Score", 0)));
    }
}
