package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level2Day3ExerciseData {

    public static final String[] choiceData = new String[]{"Nō whea te whaea o Mere rāua ko Kata?", "Nō Te Kauwhata te whaea o Mere rāua ko Kata.", "Nō whea te matua o Kata?", "Nō Waikanae te matua o Kata.", "Nō whea te whaea o te tama?", "Nō Tūrangi te whaea o te tama."
            , "Nō whea te whaea o  Roimata?", "Nō whea te matua o te whānau?", "Nō Tauranga te whaea o Roimata.", "Nō Te Whanganui a Tara te matua o te whānau",
            " Nō whea te matua o Kata rāua ko Hōri?",
            " Nō Tūhoe te matua o Kata rāua ko Hōri."};
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] answerData = new String[]{"Nō whea te whaea o  Roimata?", "Nō whea te matua o te whānau?"
            , "Nō Tauranga te whaea o Roimata.", "Nō Te Whanganui a Tara te matua o te whānau.",
            "Nō whea te whaea o Mere rāua ko Kata?", "Nō Te Kauwhata te whaea o Mere rāua ko Kata.",
            "Nō whea te matua o Kata?", "Nō Waikanae te matua o Kata.", "Nō whea te whaea o te tama?", "Nō Tūrangi te whaea o te tama.", "Nō whea te matua o Kata rāua ko Hōri?", "Nō Tūhoe te matua o Kata rāua ko Hōri."};
    public static final String[] quesData = new String[]{"Where is Roimata’s mother from?", "Where is the father of the family from?"
            , "Roimata’s mother is from Tauranga.", "The father of the family is from Wellington.",
            "Where is Mere and Kata’s mother from?",
            "Mere and Kata’s mum is from Te Kauwhata.", "Where is Kata’s Dad from?"
            , "Kata’s Dad is from Waikanae.", "Where is the boy’s mother from?",
            " Where is Kata and Hōri’s father from?.",
            " Kata and Hōri’s Dad is from Tūhoe."};

    public Level2Day3ExerciseData() {
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
