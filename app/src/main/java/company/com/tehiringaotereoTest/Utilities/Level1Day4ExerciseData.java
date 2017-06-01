package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level1Day4ExerciseData {

    public static final String[] answerData = new String[]{"Maunganui", "Awaroa", "Rotohōhonu", "Whenua-wātea", "Ngāti Tangata",
            "Ngāti Ira", "Wahine-toa", "Maunganui", "Awaroa", "Rotohōhonu", "Whenua-wātea", "Ngāti Tangata",
            "Ngāti Ira", "Wahine-toa"};
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] quesData = new String[]{"Ko ________ te maunga", "Ko ________ te awa", "Ko ________ te moana", "Ko _________ te marae", "Ko __________ te hapū",
            "Ko _________ te iwi", "Ko ________ te tipuna", "________ is the mountain", "________ is the river",
            "________ is the lake/ocean", "________ is the marae", "_______ is the sub-tribe", "_______ is the tribe", "_______ is the ancestor"};
    public static String[] choiceData = new String[]{"Ngāti Tangata", "Maunganui", "Awaroa", "Rotohōhonu", "Whenua-wātea",
            "Ngāti Ira", "Ngāti Tangata", "Ngāti Ira", "Wahine-toa", "Wahine-toa", "Maunganui", "Awaroa", "Rotohōhonu", "Whenua-wātea"};

    public Level1Day4ExerciseData() {
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
