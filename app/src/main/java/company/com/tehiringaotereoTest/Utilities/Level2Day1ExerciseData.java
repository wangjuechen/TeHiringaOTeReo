package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level2Day1ExerciseData {

    public static final String[] choiceData = new String[]{"Ko wai koe?",
            "Ko Mārama ahau",
            "Ko wai ia?",
            "Ko Hine ia",
            "I am Tama",
            "Ko wai ahau?",
            "Who are you?",
            " Ko Whare te matua",
            " Ko MÄrama te whaea",
            " Ko Mere te mÄtÄmua", "Who is he?",
            "Ko Whare koe",
            "He is Peta",
            "You are Timoti",
            " You are Timoti",
            " Who am I?", " " +
            "I am Tama",
            " Who are you?",
            " He is Peta",
            " Who is he?"
            , " Ko wai ahau?",
            "Ko wai koe?", "Ko wai ia?", "Ko MÄrama ahau", " Ko Hine ia", " Ko Hine ia"};
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] answerData = new String[]{
            "Ko wai ahau?",
            "Ko wai koe?",
            "Ko Mārama ahau",
            "Ko wai ia?",
            "Ko Hine ia",
            "Ko wai ahau?",
            "Ko Whare koe",
            "Who is he?",
            "He is Peta",
            "Who are you?",
            "I am Tama",
            "You are Timoti"};
    public static final String[] quesData = new String[]{
            "Who am I?",
            "Who are you?",
            "I am Mārama ",
            "Who is she?",
            "She is Hine.",
            "Who am I?",
            "You are Whare.",
            "Ko wai ia?",
            "Ko Peta ia",
            "Ko wai koe?",
            "Ko Tama au",
            "Ko Timoti koe"};

    public Level2Day1ExerciseData() {
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
