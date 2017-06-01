package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level4Day1ExerciseData {

    public static final String[] choiceData = new String[]{

            "Ko te aha tērā?",
            "Ko te aha tēnei?",
            "Ko te aha tēnā?",
            "Ko te aha tēnei?",
            "Ko te pene rākau tēnei.",
            "Ko te aha tērā?",
            "Ko te kūaha tērā.",
            "Ko te pukapuka tēnā.",
            "Ko te tēpu tēnā",
            "Ko te tūru tēnei.",
            "Ko te papatuhituhi tērā.",
            "Ko te aha tēnei?",
            "Ko te pene rākau tēnā",
            "Ko te pukapuka tēnei?",
            "Ko te ārai tērā",
            "Ko te aha tēnā?",
            "Ko te kūaha tērā",
            "Ko te pene tēnei",
            "Ko te aha tērā?",
            "Ko te aha tēnā?",
            "Ko te kōpaki tēnā",


    };
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] answerData = new String[]{

            "Ko te aha tēnei?",
            "Ko te pukapuka tēnā.",
            "Ko te aha tēnei?",
            "Ko te tēpu tēnā",
            "Ko te aha tēnā?",
            "Ko te tūru tēnei.",
            "Ko te aha tēnā?",
            "Ko te pene rākau tēnei.",
            "Ko te aha tērā?",
            "Ko te papatuhituhi tērā.",
            "Ko te aha tērā?",
            "Ko te kūaha tērā.",
            "Ko te aha tēnei?",
            "Ko te kōpaki tēnā",
            "Ko te pene rākau tēnā",
            "Ko te aha tēnā?",
            "Ko te pukapuka tēnei?",
            "Ko te pene tēnei",
            "Ko te aha tērā?",
            "Ko te kūaha tērā",
            "Ko te ārai tērā"

    };
    public static final String[] quesData = new String[]{
            "What is this? (by speaker)",
            "That (by listener) is the book",
            "What’s this? (by speaker)",
            "That (by listener) is the desk",
            " What’s that ? (by listener)",
            "This (by speaker) is the chair",
            "What’s that? (by listener)",
            "This (by speaker) is the pencil",
            "What’s that?  (over yonder)",
            "That (over yonder) is the whiteboard",
            "What’s that? (over yonder)",
            "That (over yonder) is the door",
            "What is this? (By speaker)",
            "That is the folder (By listener)",
            "That is the pencil (By listener)",
            "What is that? (By listener)",
            "This is the book (By speaker)",
            "This is the pen (By speaker)",
            "What is that? (Over yonder)",
            "That is the door (over yonder)",
            "That is the curtain (over yonder)"
    };

    public Level4Day1ExerciseData() {
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

