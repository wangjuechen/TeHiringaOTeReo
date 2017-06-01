package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level4Day2ExerciseData {

    public static final String[] choiceData = new String[]{


            "Those (over yonder) are the doors",
            "Ko ngā aha ēnei?",
            "What are those? (By listener)",
            "What are those? (By listener)",
            "What are these? (By speaker",
            "Ko ngā tūru ēnei",
            "These (by speaker) are the desks",
            "What are those? (Over yonder",
            "What are those? (Over yonder",
            "Those (by listener) are the pencils?",
            "Ko ngā pene ēnā",
            "Those (over yonder) are the erasers",
            "Ko ngā aha ērā?",
            "Ko ngā tēpu ērā",
            "What are these? (By speaker)",
            "Those (by listener) are the books.",
            "These (by speaker) are the windows",
            "Ko ngā aha ēnā?",

    };
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] answerData = new String[]{

            "What are these? (By speaker)",
            "Those (by listener) are the pencils?",
            "What are these? (By speaker",
            "Those (by listener) are the books.",
            "What are those? (By listener)",
            "These (by speaker) are the desks",
            "What are those? (By listener)",
            "These (by speaker) are the windows",
            "What are those? (Over yonder",
            "Those (over yonder) are the doors",
            "What are those? (Over yonder",
            "Those (over yonder) are the erasers",
            "Ko ngā aha ēnei?",
            "Ko ngā pene ēnā",
            "Ko ngā aha ēnā?",
            "Ko ngā tūru ēnei",
            "Ko ngā aha ērā?",
            "Ko ngā tēpu ērā",

    };
    public static final String[] quesData = new String[]{
            "Ko ngā aha ēnei?",
            "Ko ngā pene rākau ēnā.",
            "Ko  ngā aha ēnei?",
            "Ko ngā pukapuka ēnā.",
            "Ko ngā aha ēnā?",
            "Ko ngā  tēpu ēnei",
            "Ko ngā aha ēnā?",
            "Ko ngā matapihi ēnei.",
            "Ko ngā  aha ērā?",
            "Ko ngā kūaha ērā",
            "Ko ngā aha ērā?",
            "Ko ngā ūkui ērā.",
            "What are these called? (Near the speaker)",
            "Those are the pens (near the listener)",
            "What are those? (Near the listener)",
            "These are the seats (near the speaker)",
            "What are those? (Over yonder)",
            "Those are the tables (over yonder)"
    };

    public Level4Day2ExerciseData() {
        addOptionsDay1(quesData);
    }


    private void addOptionsDay1(String[] qdata) {

        for (int i = 0; i < qdata.length; i++) {
            QuesAnsModel obj = new QuesAnsModel();
            obj.setQuesText(qdata[i]);
            obj.setAnswer(answerData[i]);

            quesAnsData.add(obj);
        }
    }

}

