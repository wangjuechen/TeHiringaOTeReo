package company.com.tehiringaotereoTest;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ScoreFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ScoreFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ScoreFragment extends Fragment {

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
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ScoreFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ScoreFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ScoreFragment newInstance(String param1, String param2) {
        ScoreFragment fragment = new ScoreFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_score, container, false);

        ButterKnife.bind(this,view);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());

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

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
