package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level3Day4ExerciseData {

    public static final String[] choiceData = new String[]{"Kei Te Māhia a Wai.", "Kei Rotorua a Rangi.", "Kei hea a Rangi?", "Kei Ruatōria a Paea.", "Kei hea a Wai?", "Kei hea a Hōri?", "Kei waho a Hōri i te whare.", "Kei hea a Paea?",
            "Kei roto a Paora i te wharepaku", "Kei Paraparaumu a Herita.", "Kei raro a Hoki i te waka.", "E toru ngā pene.", "Whitu tekau mā rima ngā tāngata.",
            "E waru ngā pene rākau.", "E hia ngā tūru?", "E whā ngā tūru.", "E toru ngā pene.", "E whitu ngā āporo kei Runga i te tēpu.", "Toru tekau ngā manu.", "E hia ngā tēpu?",
            "E hia ngā pene kei runga i te tēpu?"};
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] answerData = new String[]{"Kei hea a Paea?", "Kei Ruatōria a Paea.", "Kei hea a Rangi?", "Kei Rotorua a Rangi.", "Kei hea a Wai?",
            "Kei Te Māhia a Wai.", "Kei Paraparaumu a Herita.", "Kei hea a Hōri?", "Kei waho a Hōri i te whare.", "Kei roto a Paora i te wharepaku", "Kei raro a Hoki i te waka.",
            "E hia ngā tēpu?", "E hia ngā tūru?", "E hia ngā pene kei runga i te tēpu?", "E whā ngā tūru.", "E waru ngā pene rākau.", "E toru ngā pene.",
            "E whitu ngā āporo kei Runga i te tēpu.", "Toru tekau ngā manu.", "Whitu tekau mā rima ngā tāngata."};
    public static final String[] quesData = new String[]{
            "Where is Paea?",
            "Paea is in Ruatōria. ",
            "Where is Rangi?",
            "Rangi is in Rotorua. ",
            "Where is Wai?",
            "Wai is in Te Māhia.",
            "Herita is in Paraparaumu",
            "Where is Hōri?",
            "Hōri is outside of the house.",
            "Paora is in the toilet.",
            "Hoki is under the car.",
            "How many tables are there?",
            "How many chairs are there?",
            "How many pens are there on the table?",
            "There are four chairs.",
            "There are eight pencils.",
            "There are three pens.",
            "There are seven apples on the table.",
            "There are thirty birds.",
            "There are seventy-five people."};

    public Level3Day4ExerciseData() {
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

