package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level2Day4ExerciseData {

    public static final String[] choiceData = new String[]{"Nō whea te whaea o Mere rāua ko Kata?", "Nō Te Kauwhata te whaea o Mere rāua ko Kata.", "Nō whea te matua o Kata?", "Nō Waikanae te matua o Kata.", "Nō whea te whaea o te tama?", "Nō Tūrangi te whaea o te tama."
            , "Nō whea te whaea o  Roimata?", "Nō whea te matua o te whānau?", "Nō Tauranga te whaea o Roimata.", "Nō Te Whanganui a Tara te matua o te whānau."};
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] answerData = new String[]{"Nō whea te whaea o  Roimata?", "Nō whea te matua o te whānau?"
            , "Nō Tauranga te whaea o Roimata.", "Nō Te Whanganui a Tara te matua o te whānau.",
            "Nō whea te whaea o Mere rāua ko Kata?", "Nō Te Kauwhata te whaea o Mere rāua ko Kata.",
            "Nō whea te matua o Kata?", "Nō Waikanae te matua o Kata.", "Nō whea te whaea o te tama?", "Nō Tūrangi te whaea o te tama."};
    public static final String[] quesData = new String[]{"Hello there"
            , "Hi friend!", "How are you?",
            "Fine thanks!",
            "What is your name?", "My name is Whare."
            , "Where are you from Whare?", "I am from Te Araroa!",
            "Where are you living now?"/*,
            "I am living in Porirua.",
			"Who are your parents?","Whare and Mārama are my parents.","Where is your sister?","My sister is over yonder.","Where is her car?"
			,"Where is her car?","That is her car by you.","Here is my car!"*/};

    public Level2Day4ExerciseData() {
        addOptionsDay1(quesData);
    }


    private void addOptionsDay1(String[] qdata) {

        for (int i = 0; i < qdata.length - 1; i++) {
            QuesAnsModel obj = new QuesAnsModel();
            obj.setQuesText(qdata[i]);
            obj.setAnswer(answerData[i]);

            quesAnsData.add(obj);
        }
    }

}
