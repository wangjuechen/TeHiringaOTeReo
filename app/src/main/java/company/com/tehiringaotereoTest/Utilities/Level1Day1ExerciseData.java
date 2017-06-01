package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level1Day1ExerciseData {

    public static final String[] choiceData = new String[]{"Kia ora e Kara",
            "Tēnā koutou e hine mā",
            "Tēnā koe e Tama",
            "Kia ora e Hone",
            "Tēnā kōrua",
            "Kia ora e Tama",
            "Hello you two, Pita",
            "Hello to you ladies",
            "Hello friend",
            "Hello ladies",
            "Hi there Ani",
            "Hello Pita and friends"};
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] answerData = new String[]{
            "Tēnā koe e Tama",
            "Kia ora e Hone",
            "Tēnā kōrua",
            "Kia ora e Kara",
            "Tēnā koutou e hine mā",
            "Kia ora e Tama",
            "Hello friend",
            "Hello ladies",
            "Hi there Ani",
            "Hello Pita and friends",
            "Hello you two, Pita",
            "Hello to you ladies"};
    public static final String[] quesData = new String[]{
            "Hello Tama!",
            "Hi Hone!",
            "Hello you 2!",
            "Hi Kara!",
            "Hello girls!",
            "Hi there Tama!",
            "Tēnā koe e hoa.",
            "Tēnā koutou wāhine mā.",
            "Kia ora ki a koe e Ani.",
            "Tēnā koutou e Pita mā.",
            "Tēnā kōrua e Pita.",
            "Tēnā koutou e ngā wāhine."};

    public Level1Day1ExerciseData() {
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
