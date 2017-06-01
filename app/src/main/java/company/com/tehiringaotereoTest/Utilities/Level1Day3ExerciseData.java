package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level1Day3ExerciseData {

    public static final String[] choiceData = new String[]{"Kei hea koe e noho ana?", "Kia ora e Hera", "Tēnā koe e Hera", "Kei te pēhea koe?",
            "Kei hea kōrua e noho ana?", "Kia ora", "Nō hea koe?", "Nō hea kōrua?", "Noho ora mai, kōrua"
            , "Ka kite anō i a koe"};
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] answerData = new String[]{"Kia ora e Hera", "Tēnā koe e Hera", "Kei te pēhea koe?", "Kei hea koe e noho ana?",
            "Kei hea kōrua e noho ana?", "Nō hea koe?", "Nō hea kōrua?", "Noho ora mai, kōrua", "Kia ora"
            , "Ka kite anō i a koe"};
    public static final String[] quesData = new String[]{"Hi there Hera.", "Hello Pare", "How are you?", "Where do you live?",
            "Where do the two of you live?", "Where are you from?", "Where are the two of you from?",
            "Be well the two of you", "Thank you.", "See you again"};

    public Level1Day3ExerciseData() {
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
