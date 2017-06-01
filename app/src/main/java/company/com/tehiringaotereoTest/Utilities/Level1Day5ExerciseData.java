package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level1Day5ExerciseData {

    public static final String[] answerData = new String[]{"Rāhina", "Rātū", "Rāapa", "Rāpare", "Rāmere",
            "Rāhoroi", "Rātapu", "December", "November", "October", "September", "August",
            "July", "January"};
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] quesData = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
            "Saturday", "Sunday", "Hakihea", "Whiri-nga-ā-rangi",
            "Whiringa-ā-nuku", "Māhuru", "Here-turi-kōkā", "Hōngongoi", "Kohitātea"};
    public static String[] choiceData = new String[]{"October", "September", "August",
            "July", "January", "Rāhina", "Rātū", "Rāhoroi", "Rātapu", "December", "November", "Rāapa", "Rāpare", "Rāmere"};

    public Level1Day5ExerciseData() {
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
