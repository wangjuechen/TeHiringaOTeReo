package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level1Day2ExerciseData {

    public static final String[] choiceData = new String[]{"Hello friends.", "Stay and be well Tama.", "Hello Pita"
            , "How are you Tama?", "How are you two?", "How are you?", "We are good!", "Tomorrow girls.", "We will see you again", "Yes Ani, we will see you again"};
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] answerData = new String[]{"Hello Pita", "How are you Tama?", "How are you two?", "Hello friends.",
            "Stay and be well Tama.", "Tomorrow girls.", "We will see you again", "Yes Ani, we will see you again", "How are you?"
            , "We are good!"};
    public static  final String[] quesData = new String[]{"Tēnā koe e Pita", "Kei te pēhea koe e Tama?", "Kei te pēhea kōrua?", "Tēnā koutou e hoa mā", "Noho ora mai e Tama!",
            "Hei āpōpō e hine mā", "Ka kite anō i a koe!", "Āe e Ani, ka kite anō i a koe", "Kei te pēhea koutou?",
            "Kei te pai mātou!"};

    public Level1Day2ExerciseData() {
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
