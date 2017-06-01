package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level3Day2ExerciseData {

    public static final String[] choiceData = new String[]{
            "He pouaka ēnei",
            "He aha ēnei?",
            "He kurī ērā",
            "He waka waka",
            "He aha ēnei?",
            "He pukapuka ēnei",
            "He āporo ērā",
            "He pene ēnei",
            "He aha ērā?",
            "He hū ēnā",
            "He pene ēnā",
            "He hū ēnei",
            "He aha ēnā?",
            "He aha ērā?",
            "He aha ēnā?",
            "He hōiho ērā"

    };
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] answerData = new String[]{
            "He aha ēnei?",
            "He pene ēnei",
            "He aha ēnā?",
            "He pene ēnā",
            "He aha ērā?",
            "He waka waka",
            "He pouaka ēnei",
            "He āporo ērā",
            "He aha ēnei?",
            "He aha ēnā?",
            "He aha ērā?",
            "He hū ēnei",
            "He kurī ērā",
            "He hōiho ērā",
            "He hū ēnā",
            "He pukapuka ēnei"

    };
    public static final String[] quesData = new String[]{
            "What are these?",
            "These are pens",
            "What are those?(Near listener)?",
            "Those are pencils ",
            "What are those?",
            "Those are cars (over yonder)",
            "These are boxes (near speaker)",
            "Those are apples (Over yonder) ",
            "What are these? (Near speaker)",
            "What are those? (Near listener)",
            "What are those? (Over yonder)",
            "These are shoes (near speaker)",
            "Those are dogs (over yonder)",
            "Those are horses (over yonder)",
            "Those are shoes (near listener)",
            "These are books (near speaker)"

    };

    public Level3Day2ExerciseData() {
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


