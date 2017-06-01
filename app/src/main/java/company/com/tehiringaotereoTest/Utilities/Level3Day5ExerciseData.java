package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level3Day5ExerciseData {

    public static final String[] choiceData = new String[]{

            "He aha ērā?",
            "Kei hea te manu?",
            "He aha tērā?",
            "Kei hea a Paea?",
            "Kei hea a Rangi?",
            "Kei Rotorua a Rangi.",
            "He rorohiko tēnā.",
            "He aha ēnei?",
            "He aha tēnei?",
            "He aha tēnā?",
            "He hōiho tērā.",
            "He rīwai ēnā.",
            "He tāngata ērā.",
            "Kei waho.",
            "Kei raro a Hoki i te waka.",
            "Toru tekau ngā manu",
            "Kei runga te rorohiko i te tēpu.",
            "E whitu ngā āporo kei runga i te tēpu.",
            "Kei roto te pene i te pouaka.",
            "He aha ēnā?",
            "He pouaka ēnei .",
            "He pepa ēnei.",
            "He āporo tēnei",
            "Kei Ruatōria a Paea",
            "He hōiho ērā.",

    };
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] answerData = new String[]{
            "He aha tēnei?",
            "He āporo tēnei",
            "He aha tēnā?",
            "He rorohiko tēnā.",
            "He aha tērā?",
            "He hōiho tērā.",
            "He aha ēnei?",
            "He pepa ēnei.",
            "He aha ēnā?",
            "He rīwai ēnā.",
            "He aha ērā?",
            "He hōiho ērā.",
            "He pouaka ēnei .",
            "He tāngata ērā.",
            "Kei hea te manu?",
            "Kei waho.",
            "Kei runga te rorohiko i te tēpu.",
            "Kei roto te pene i te pouaka.",
            "Kei hea a Paea?",
            "Kei Ruatōria a Paea",
            "Kei hea a Rangi?",
            "Kei Rotorua a Rangi.",
            "Kei raro a Hoki i te waka.",
            "E whitu ngā āporo kei runga i te tēpu.",
            "Toru tekau ngā manu"};
    public static final String[] quesData = new String[]{
            "What is this?",
            "This is an apple  ",
            "What is that? (Near listener)",
            "That is a computer (near listener) ",
            "What is that? (Over yonder)",
            "That is a house (over yonder)",
            "What are these?",
            "These are papers. ",
            "What are those? (Near listener)",
            "Those are potatoes. (Near listener)",
            "What are those? (Over yonder)",
            "Those are horses. (Over yonder)",
            "These are boxes. (Near speaker)",
            "Those are people. (Over yonder)",
            "Where is the bird?",
            "Outside.",
            "The computer is on top of the table. ",
            "The pen is inside of the box.",
            "Where is Paea? ",
            "Paea is in Ruatöria.",
            "Where is Rangi?",
            "Rangi is in Rotorua.",
            "Hoki is under the car.",
            "There are seven apples on the table.",
            "There are thirty birds "};

    public Level3Day5ExerciseData() {
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

