package company.com.tehiringaotereoTest;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SlidesDay5Fragment extends Fragment {

    private double mTotalScore;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.day5progress_for_viewpage, container, false);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        String mLevel = Topics_ForAllDays_Activity.mlevel;
        String mTopicForDay5 = mLevel + "Day5Score";

        switch(mLevel) {
            case("Level 1"):{
                mTotalScore = 14;
                break;
            }
            case("Level 2"):{
                mTotalScore = 0;
                break;
            }
            case("Level 3"):{
                mTotalScore = 25;
                break;
            }
            case("Level 4"):{
                mTotalScore = 0;
                break;
            }
            default:{
                break;
            }
        }
        double mScoreForDay5 = sharedPreferences.getInt(mTopicForDay5,0);

        TextView mScoreForDays = (TextView) rootView.findViewById(R.id.tv_day_score);
        ImageView mProgressImage = (ImageView) rootView.findViewById(R.id.iv_viewPage_day5Progress);

        mScoreForDays.setText(String.format("%.0f",mScoreForDay5) + " / " + String.format("%.0f",mTotalScore));

        if(mScoreForDay5/mTotalScore >= 0 && mScoreForDay5/mTotalScore < 0.15){
            mProgressImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.levelpage_progress1,null));
        }
        else if(mScoreForDay5/mTotalScore >= 0.15 && mScoreForDay5/mTotalScore < 0.35){
            mProgressImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.levelpage_progress2,null));
        }
        else if(mScoreForDay5/mTotalScore >= 0.35 && mScoreForDay5/mTotalScore < 0.55){
            mProgressImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.levelpage_progress3,null));
        }
        else if(mScoreForDay5/mTotalScore >= 0.55 && mScoreForDay5/mTotalScore < 0.75){
            mProgressImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.levelpage_progress4,null));
        }
        else if(mScoreForDay5/mTotalScore >= 0.75 && mScoreForDay5/mTotalScore < 0.99){
            mProgressImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.levelpage_progress5,null));
        }
        else{
            mProgressImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.levelpage_progress6,null));
        }

        return  rootView;
    }


}
