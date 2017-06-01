package company.com.tehiringaotereoTest;


import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Level2ProgressFragment extends Fragment{
    private int mScore;
    private ImageView mProgresStar1;
    private ImageView mProgresStar2;
    private ImageView mProgresStar3;
    private ImageView mProgresStar4;
    private ImageView mProgresStar5;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.layout_for_level2_progress, container, false);

        mProgresStar1 = (ImageView) rootview.findViewById(R.id.iv_star1);
        mProgresStar2 = (ImageView) rootview.findViewById(R.id.iv_star2);
        mProgresStar3 = (ImageView) rootview.findViewById(R.id.iv_star3);
        mProgresStar4 = (ImageView) rootview.findViewById(R.id.iv_star4);
        mProgresStar5 = (ImageView) rootview.findViewById(R.id.iv_star5);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        mScore = sharedPreferences.getInt("Level 2Score", 0);

        if (mScore >= 24) {
            mProgresStar1.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.defaultpage_yellowstar_icon, null));
        } else if (mScore >= 48) {
            mProgresStar1.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.defaultpage_yellowstar_icon, null));
            mProgresStar2.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.defaultpage_yellowstar_icon, null));
        } else if (mScore >= 72) {
            mProgresStar1.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.defaultpage_yellowstar_icon, null));
            mProgresStar2.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.defaultpage_yellowstar_icon, null));
            mProgresStar3.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.defaultpage_yellowstar_icon, null));
        } else if (mScore >= 96) {
            mProgresStar1.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.defaultpage_yellowstar_icon, null));
            mProgresStar2.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.defaultpage_yellowstar_icon, null));
            mProgresStar3.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.defaultpage_yellowstar_icon, null));
            mProgresStar4.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.defaultpage_yellowstar_icon, null));
        } else if (mScore == 123) {
            mProgresStar1.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.defaultpage_yellowstar_icon, null));
            mProgresStar2.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.defaultpage_yellowstar_icon, null));
            mProgresStar3.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.defaultpage_yellowstar_icon, null));
            mProgresStar4.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.defaultpage_yellowstar_icon, null));
            mProgresStar5.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.defaultpage_yellowstar_icon, null));
        }

        return rootview;

    }
}

