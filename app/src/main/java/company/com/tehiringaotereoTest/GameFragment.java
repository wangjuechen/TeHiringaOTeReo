package company.com.tehiringaotereoTest;

import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link GameFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link GameFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GameFragment extends Fragment {

    private SharedPreferences shPref;
    private int TotalScore;
    private ImageButton btn_level1;
    private ImageButton btn_level2;
    private ImageButton btn_level3;
    private ImageButton btn_level4;
    private int mLevelAccesser;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public GameFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GameFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GameFragment newInstance(String param1, String param2) {
        GameFragment fragment = new GameFragment();
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
        View view =  inflater.inflate(R.layout.fragment_game, container, false);
        TextView tx = (TextView) view.findViewById(R.id.tv_leftTitleExtended);

        Typeface custom_font = Typeface.createFromAsset(getActivity().getAssets(), "JosefinSans-Light.ttf");

        tx.setTypeface(custom_font);

        shPref = PreferenceManager.getDefaultSharedPreferences(getActivity());

        TotalScore = shPref.getInt("totalScore", 0);

        mLevelAccesser = shPref.getInt("levelEnterance", 1);

        SharedPreferences.Editor editor = shPref.edit();

        if (TotalScore >= 48 && mLevelAccesser == 1) {
            mLevelAccesser = 2;
            DialogFragment newFragment = new DialogForEnteringLevel2Fragment();
            newFragment.show(getActivity().getFragmentManager(), "EnteringLevel2");


        } else if (TotalScore >= 86 && mLevelAccesser == 2) {//TODO 86 is not accurate , need reccalculate, i think its 123*80% = 98
            mLevelAccesser = 3;
            DialogFragment newFragment = new DialogForEnteringLevel3Fragment();
            newFragment.show(getActivity().getFragmentManager(), "EnteringLevel3");


        } else if (TotalScore >= 165 && mLevelAccesser == 3) {//TODO 165 is not accurate , need reccalculate
            mLevelAccesser = 4;
            DialogFragment newFragment = new DialogForEnteringLevel4Fragment();
            newFragment.show(getActivity().getFragmentManager(), "EnteringLevel4");
        }

        editor.putInt("levelEnterance", mLevelAccesser);
        editor.putInt("totalScore",TotalScore);

        btn_level1 = (ImageButton) view.findViewById(R.id.btn_level1);
        btn_level2 = (ImageButton) view.findViewById(R.id.btn_level2);
        btn_level3 = (ImageButton) view.findViewById(R.id.btn_level3);
        btn_level4 = (ImageButton) view.findViewById(R.id.btn_level4);


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
                Intent intent = new Intent(getActivity(), Topics_ForAllDays_Activity.class);
                intent.putExtra("level", "Level 1");
                startActivity(intent);
            }
        });

        btn_level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mLevelAccesser >= 2) {
                    Intent i = new Intent(getActivity(), Topics_ForAllDays_Activity.class);
                    i.putExtra("level", "Level 2");
                    startActivity(i);

                } else {
                    DialogFragment newFragment = new dialogForNotOpen();
                    newFragment.show(getActivity().getFragmentManager(), "notOpen");
                }
            }
        });

        btn_level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mLevelAccesser >= 3) {
                    Intent i = new Intent(getActivity(), Topics_ForAllDays_Activity.class);
                    i.putExtra("level", "Level 3");
                    startActivity(i);

                } else {
                    DialogFragment newFragment = new dialogForNotOpen();
                    newFragment.show(getActivity().getFragmentManager(), "notOpen");
                }
            }
        });

        btn_level4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mLevelAccesser >= 4) {
                    Intent i = new Intent(getActivity(), Topics_ForAllDays_Activity.class);
                    i.putExtra("level", "Level 4");
                    startActivity(i);
                } else {
                    DialogFragment newFragment = new dialogForNotOpen();
                    newFragment.show(getActivity().getFragmentManager(), "notOpen");
                }

            }
        });

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
