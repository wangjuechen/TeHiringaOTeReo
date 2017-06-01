package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level3Day1ExerciseData {

    public static final String[] choiceData = new String[]{
            "He aha tēnā?", "He pouaka tēnā", "He pukapuka tēnei.", "He aha tēnei?", "He aha tērā?",
            "That is a box", "He āporo tēnā", "He waka tērā", "He aha tēnei?", "He hōiho tērā",
            "He pouaka tēnei", "He aha tēnā?", "He aha tērā?", "He aha tēnā?", "He pene tēnā",
            "He aha tēnei?", "He aha tērā", "He pouaka tēnā", "He āporo tēnei", "He pene tēnā",
            "He hōiho tērā"};
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] answerData = new String[]{"He aha tēnei?", "He āporo tēnā", "He aha tēnei?", "He pene tēnā", "He aha tēnā?",
            "He pukapuka tēnei.", "He aha tēnā?", "He pouaka tēnā", "He aha tērā?", "He hōiho tērā", "He aha tērā?", "He aha tēnei?", "He āporo tēnei", "He pouaka tēnei", "He aha tēnā?",
            "He pene tēnā", "That is a box", "He pouaka tēnā", "He aha tēr", "He waka tērā", "He hōiho tērā"};
    public static final String[] quesData = new String[]{"What is this?", "That is an apple", "What is this?", "That is a pencil",
            "What is that? (Near listener)", "This is a book (near listener)", "What is that? (Near listener)",
            "This is a box (near listener)", "What is that? (Over yonder)", "That is a horse (over yonder)",
            "What is that? (Over yonder)", "What is this? (Near speaker)", "This is an apple", "This is a box", "What is that? (Near listener)", "That is pen",
            "What is that? (Over yonder)", "That is a car (over yonder)", "That is a horse (over yonder)"};

    public Level3Day1ExerciseData() {
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
