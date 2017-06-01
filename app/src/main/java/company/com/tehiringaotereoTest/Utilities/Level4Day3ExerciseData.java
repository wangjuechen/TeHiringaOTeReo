package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level4Day3ExerciseData {

    public static final String[] choiceData = new String[]{


            "Ko te rorohiko o Tama tēnei",
            "Ko te tēpu o Tama tēnā",
            "Ko te pene a Tama tēnā",
            "Ko te tēpu o Hine tēnei",
            "Ko te pōtae o Hēmi tērā",
            "Ko te pēke a Hine tērā",
            "Ko te aha tēnā?",
            "Ko te aha tēnā?",
            "Ko te aha tēnei?",
            "Ko te aha tērā?",
            "Ko te tūru o Pare tēnā",
            "Ko te aha tērā?",
            "Ko te aha tēnei?",
            "Ko te aha tēnā?",
            "Ko te aha tēna?",
            "Ko te pene a Hine tēnā",
            "Ko te pūtea a Hōri tēnei",
            "Ko te koti o Hera tēnei",

    };
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] answerData = new String[]{
            "Ko te aha tēnei?",
            "Ko te rorohiko o Tama tēnei",
            "Ko te pūtea a Hōri tēnei",
            "Ko te aha tēnā?",
            "Ko te pene a Hine tēnā",
            "Ko te tēpu o Tama tēnā",
            "Ko te aha tērā?",
            "Ko te pēke a Hine tērā",
            "Ko te pene rākau a Hōri tērā",
            "Ko te aha tēnei?",
            "Ko te pene a Tama tēnā",
            "Ko te aha tēna?",
            "Ko te tūru o Pare tēnā",
            "Ko te aha tēnā?",
            "Ko te tēpu o Hine tēnei",
            "Ko te aha tēnā?",
            "Ko te koti o Hera tēnei",
            "Ko te aha tērā?",
            "Ko te pōtae o Hēmi tērā"
    };
    public static final String[] quesData = new String[]{
            "What is this? (Near speaker)",
            "This is Tama’s computer",
            "This is Hōri’s wallet",
            "What is that? (Near listener)",
            "That is Hine’s pen",
            "That is Tama’s table",
            "What is that? (Over yonder)",
            "That is Hine’s bag (over yonder)",
            "That is Hōri’s pencil (over yonder)",
            "What is this? (Near speaker)",
            "That is Tama’s pen",
            "What’s that? (Near listener)",
            "That is Pare’s tūru",
            "What’s that? (Near speaker)",
            "This is Hine’s table",
            "What’s that? (Near listener)",
            "This is Hera’s coat",
            "What’s that …(Over yonder)",
            "That (over yonder) is Hēmi’s hat"

    };

    public Level4Day3ExerciseData() {
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
