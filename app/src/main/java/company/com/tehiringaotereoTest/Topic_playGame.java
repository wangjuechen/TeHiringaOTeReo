package company.com.tehiringaotereoTest;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import company.com.tehiringaotereoTest.Adapters.AnswerGridAdapter;
import company.com.tehiringaotereoTest.Utilities.Level1Day1ExerciseData;
import company.com.tehiringaotereoTest.Utilities.Level1Day2ExerciseData;
import company.com.tehiringaotereoTest.Utilities.Level1Day3ExerciseData;
import company.com.tehiringaotereoTest.Utilities.Level1Day4ExerciseData;
import company.com.tehiringaotereoTest.Utilities.Level1Day5ExerciseData;
import company.com.tehiringaotereoTest.Utilities.Level2Day1ExerciseData;
import company.com.tehiringaotereoTest.Utilities.Level2Day2ExerciseData;
import company.com.tehiringaotereoTest.Utilities.Level2Day3ExerciseData;
import company.com.tehiringaotereoTest.Utilities.Level2Day4ExerciseData;
import company.com.tehiringaotereoTest.Utilities.Level3Day1ExerciseData;
import company.com.tehiringaotereoTest.Utilities.Level3Day2ExerciseData;
import company.com.tehiringaotereoTest.Utilities.Level3Day3ExerciseData;
import company.com.tehiringaotereoTest.Utilities.Level3Day4ExerciseData;
import company.com.tehiringaotereoTest.Utilities.Level3Day5ExerciseData;
import company.com.tehiringaotereoTest.Utilities.Level4Day1ExerciseData;
import company.com.tehiringaotereoTest.Utilities.Level4Day2ExerciseData;
import company.com.tehiringaotereoTest.Utilities.Level4Day3ExerciseData;
import company.com.tehiringaotereoTest.Utilities.Level4Day4ExerciseData;


public class Topic_playGame extends Activity implements View.OnDragListener {

    private static final String LOGCAT = null;
    private TextView tv_Question;
    private TextView tv_Final;
    private GridView gridOptions;
    private String[] exerciseData;
    private String[] answers;
    private String[] rightAnswers;
    private AnswerGridAdapter gridAdapter;
    private SharedPreferences mPref;
    private String mTopic;
    private int QuestionNo;
    private int marks;
    private TextView mQuestionCurrentNum;
    private TextView mQuestionTotalNum;
    private Intent intent;
    private String mTopicLevelDay;
    private int level1Marks;
    private int level2Marks;
    private int level3Marks;
    private int level4Marks;
    private int totalMarks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.playgame_topic);
        mPref = PreferenceManager.getDefaultSharedPreferences(this);



        QuestionNo = mPref.getInt("QuestionNo", 1);

        mTopic = getIntent().getStringExtra("topic");
        switch (mTopic) {
            case ("Level 10PlayGame"): {
                exerciseData = Level1Day1ExerciseData.quesData;
                answers = Level1Day1ExerciseData.choiceData;
                rightAnswers = Level1Day1ExerciseData.answerData;
                break;
            }
            case ("Level 11PlayGame"): {
                exerciseData = Level1Day2ExerciseData.quesData;
                answers = Level1Day2ExerciseData.choiceData;
                rightAnswers = Level1Day2ExerciseData.answerData;
                break;

            }
            case ("Level 12PlayGame"): {
                exerciseData = Level1Day3ExerciseData.quesData;
                answers = Level1Day3ExerciseData.choiceData;
                rightAnswers = Level1Day3ExerciseData.answerData;
                break;

            }
            case ("Level 13PlayGame"): {
                exerciseData = Level1Day4ExerciseData.quesData;
                answers = Level1Day4ExerciseData.choiceData;
                rightAnswers = Level1Day4ExerciseData.answerData;
                break;

            }
            case ("Level 14PlayGame"): {
                exerciseData = Level1Day5ExerciseData.quesData;
                answers = Level1Day5ExerciseData.choiceData;
                rightAnswers = Level1Day5ExerciseData.answerData;
                break;
            }
            case ("Level 20PlayGame"): {
                exerciseData = Level2Day1ExerciseData.quesData;
                answers = Level2Day1ExerciseData.choiceData;
                rightAnswers = Level2Day1ExerciseData.answerData;
                break;

            }
            case ("Level 21PlayGame"): {
                exerciseData = Level2Day2ExerciseData.quesData;
                answers = Level2Day2ExerciseData.choiceData;
                rightAnswers = Level2Day2ExerciseData.answerData;
                break;

            }
            case ("Level 22PlayGame"): {
                exerciseData = Level2Day3ExerciseData.quesData;
                answers = Level2Day3ExerciseData.choiceData;
                rightAnswers = Level2Day3ExerciseData.answerData;
                break;

            }
            case ("Level 23PlayGame"): {
                exerciseData = Level2Day4ExerciseData.quesData;
                answers = Level2Day4ExerciseData.choiceData;
                rightAnswers = Level2Day4ExerciseData.answerData;
                break;

            }
            case ("Level 30PlayGame"): {
                exerciseData = Level3Day1ExerciseData.quesData;
                answers = Level3Day1ExerciseData.choiceData;
                rightAnswers = Level3Day1ExerciseData.answerData;
                break;

            }
            case ("Level 31PlayGame"): {
                exerciseData = Level3Day2ExerciseData.quesData;
                answers = Level3Day2ExerciseData.choiceData;
                rightAnswers = Level3Day2ExerciseData.answerData;
                break;
            }
            case ("Level 32PlayGame"): {
                exerciseData = Level3Day3ExerciseData.quesData;
                answers = Level3Day3ExerciseData.choiceData;
                rightAnswers = Level3Day3ExerciseData.answerData;
                break;
            }
            case ("Level 33PlayGame"): {
                exerciseData = Level3Day4ExerciseData.quesData;
                answers = Level3Day4ExerciseData.choiceData;
                rightAnswers = Level3Day4ExerciseData.answerData;
                break;

            }
            case ("Level 34PlayGame"): {
                exerciseData = Level3Day5ExerciseData.quesData;
                answers = Level3Day5ExerciseData.choiceData;
                rightAnswers = Level3Day5ExerciseData.answerData;
                break;

            }
            case ("Level 40PlayGame"): {
                exerciseData = Level4Day1ExerciseData.quesData;
                answers = Level4Day1ExerciseData.choiceData;
                rightAnswers = Level4Day1ExerciseData.answerData;
                break;

            }
            case ("Level 41PlayGame"): {
                exerciseData = Level4Day2ExerciseData.quesData;
                answers = Level4Day2ExerciseData.choiceData;
                rightAnswers = Level4Day2ExerciseData.answerData;

            }
            case ("Level 42PlayGame"): {
                exerciseData = Level4Day3ExerciseData.quesData;
                answers = Level4Day3ExerciseData.choiceData;
                rightAnswers = Level4Day3ExerciseData.answerData;
                break;

            }
            case ("Level 43PlayGame"): {
                exerciseData = Level4Day4ExerciseData.quesData;
                answers = Level4Day4ExerciseData.choiceData;
                rightAnswers = Level4Day4ExerciseData.answerData;
                break;
            }

            case ("Level 44PlayGame"): {
                //exerciseData = Level4Day5ExerciseData.quesAnsData;//TODO today has no exercise , need change image
                //answers = Level4Day5ExerciseData.choiceData;
            }
        }


        tv_Final = (TextView)

                findViewById(R.id.iv_answerContainer);

        gridOptions = (GridView)

                findViewById(R.id.layout_answer);

        tv_Question = (TextView)

                findViewById(R.id.tv_questionContent);

        mQuestionCurrentNum = (TextView)

                findViewById(R.id.tv_questionCurrentNumber);

        mQuestionTotalNum = (TextView)

                findViewById(R.id.tv_questionTotalNumber);


        mQuestionCurrentNum.setText(String.valueOf(QuestionNo));
        mQuestionTotalNum.setText(String.valueOf(exerciseData.length));
        marks = mPref.getInt("Marks", 0);

        tv_Question.setText(exerciseData[QuestionNo - 1]);

        tv_Final.setOnDragListener(this);
        gridAdapter = new

                AnswerGridAdapter(this, answers);
        gridOptions.setAdapter(gridAdapter);
        gridOptions.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()

        {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(null, shadowBuilder, view, 0);

                return true;
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public boolean onDrag(View layoutview, DragEvent dragevent) {
        int action = dragevent.getAction();
        final Handler handler = new Handler();
        switch (action) {
            case DragEvent.ACTION_DRAG_STARTED:
                Log.d(LOGCAT, "Drag event started");
                break;

            case DragEvent.ACTION_DRAG_ENTERED:
                Log.d(LOGCAT, "Drag event entered into " + layoutview.toString());
                break;

            case DragEvent.ACTION_DRAG_EXITED:
                Log.d(LOGCAT, "Drag event exited from " + layoutview.toString());
                break;

            case DragEvent.ACTION_DROP:
                Log.d(LOGCAT, "Dropped");

                View view = (View) dragevent.getLocalState();
                ViewGroup owner = (ViewGroup) view.getParent();
                TextView text = (TextView) owner.findViewById(R.id.lblListItem);

                if (text.getText().toString().equalsIgnoreCase(rightAnswers[QuestionNo - 1])) {
                    tv_Final.setTextColor(Color.GREEN);
                    tv_Final.setText(getString(R.string.playgamePage_AnswerRight));
                    marks = marks + 1;
                         }else {
                    tv_Final.setTextColor(Color.RED);
                    tv_Final.setText(getString(R.string.playgamePage_AnswerWrong));

                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            tv_Final.setTextColor(Color.BLACK);
                            tv_Final.setText(rightAnswers[QuestionNo - 1]);
                        }
                    },500);
                }
                movetoNextQuestion();

                break;

            case DragEvent.ACTION_DRAG_ENDED:
                break;
        }
        return true;
    }

    private void movetoNextQuestion() {
        tv_Final.setOnDragListener(null);
        gridOptions.setOnLongClickListener(null);
        final SharedPreferences.Editor edit = mPref.edit();
        mTopicLevelDay = mTopic.substring(0, 8);
        Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(2500);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

                    if (QuestionNo != exerciseData.length) {
                        edit.putInt("QuestionNo", QuestionNo + 1);
                        edit.putInt("Marks", marks);

                        intent = new Intent(Topic_playGame.this, Topic_playGame.class);
                        intent.putExtra("topic", mTopic);

                    } else {

                        edit.putInt("Marks", 0);
                        edit.putInt("QuestionNo", 1);
                        switch (mTopicLevelDay) {
                            case ("Level 10"): {
                                edit.putInt("Level 1Day1Score", marks);
                                break;
                            }
                            case ("Level 11"): {
                                edit.putInt("Level 1Day2Score", marks);
                                break;
                            }
                            case ("Level 12"): {
                                edit.putInt("Level 1Day3Score", marks);
                                break;
                            }
                            case ("Level 13"): {
                                edit.putInt("Level 1Day4Score", marks);
                                break;
                            }
                            case ("Level 14"): {
                                edit.putInt("Level 1Day5Score", marks);
                                break;
                            }
                            case ("Level 20"): {
                                edit.putInt("Level 2Day1Score", marks);
                                break;
                            }
                            case ("Level 21"): {
                                edit.putInt("Level 2Day2Score", marks);
                                break;
                            }
                            case ("Level 22"): {
                                edit.putInt("Level 2Day3Score", marks);
                                break;
                            }
                            case ("Level 23"): {
                                edit.putInt("Level 2Day4Score", marks);
                                break;
                            }
                            case ("Level 30"): {
                                edit.putInt("Level 3Day1Score", marks);
                                break;
                            }
                            case ("Level 31"): {
                                edit.putInt("Level 3Day2Score", marks);
                                break;
                            }
                            case ("Level 32"): {
                                edit.putInt("Level 3Day3Score", marks);
                                break;
                            }
                            case ("Level 33"): {
                                edit.putInt("Level 3Day4Score", marks);
                                break;
                            }
                            case ("Level 34"): {
                                edit.putInt("Level 3Day5Score", marks);
                                break;
                            }
                            case ("Level 40"): {
                                edit.putInt("Level 4Day1Score", marks);
                                break;
                            }
                            case ("Level 41"): {
                                edit.putInt("Level 4Day2Score", marks);
                                break;
                            }
                            case ("Level 42"): {
                                edit.putInt("Level 4Day3Score", marks);
                                break;
                            }
                            case ("Level 43"): {
                                edit.putInt("Level 4Day4Score", marks);
                                break;
                            }
                        }

                        level1Marks = mPref.getInt("Level 1Day1Score", 0) + mPref.getInt("Level 1Day2Score", 0) +
                                mPref.getInt("Level 1Day3Score", 0) + mPref.getInt("Level 1Day4Score", 0) +
                                mPref.getInt("Level 1Day5Score", 0);

                        level2Marks = mPref.getInt("Level 2Day1Score", 0) + mPref.getInt("Level 2Day2Score", 0) +
                                mPref.getInt("Level 2Day3Score", 0) + mPref.getInt("Level 2Day4Score", 0);

                        level3Marks = mPref.getInt("Level 3Day1Score", 0) + mPref.getInt("Level 3Day2Score", 0) +
                                mPref.getInt("Level 3Day3Score", 0) + mPref.getInt("Level 3Day4Score", 0) +
                                mPref.getInt("Level 3Day5Score", 0);

                        level4Marks = mPref.getInt("Level 4Day1Score", 0) + mPref.getInt("Level 4Day2Score", 0) +
                                mPref.getInt("Level 4Day3Score", 0) + mPref.getInt("Level 4Day4Score", 0);

                        edit.putInt("Level 1Score", level1Marks);
                        edit.putInt("Level 2Score", level2Marks);
                        edit.putInt("Level 3Score", level3Marks);
                        edit.putInt("Level 4Score", level4Marks);

                        totalMarks = mPref.getInt("Level 1Score",0) +  mPref.getInt("Level 2Score",0) +  mPref.getInt("Level 3Score",0) +  mPref.getInt("Level 4Score",0);

                        edit.putInt("totalScore", totalMarks);

                        intent = new Intent(Topic_playGame.this, Topics_ForAllDays_Activity.class);
                        intent.putExtra("level", mTopic.substring(0, 7));
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    }

                    edit.commit();
                    startActivity(intent);
                    finish();
                }
            }
        };
        timerThread.start();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        SharedPreferences.Editor edit = mPref.edit();
        edit.putInt("Marks", 0);
        edit.putInt("Day1Score", 0);
        edit.putInt("QuestionNo", 1);
        edit.commit();
    }

}