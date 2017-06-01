package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level4Day4ExerciseData {

    public static final String[] choiceData = new String[]{

            "Ko ngā pene whīrā a Hine ēnei",
            "Ko ngā pene tīpako a Timi ēnā",
            "Ko ngā pikitia a Kare ērā",
            "Ko ngā aha ēnā?",
            "Ko ngā hū o Pare ēnā",
            "Ko ngā pukapuka a Mita ērā",
            "Ko ngā hū o  Tama ēnei",
            "Ko ngā rūri a Tama ērā",
            "Ko ngā aha ērā?",
            "Ko ngā aha ēnei?",
            "Ko ngā pukapuka a Tama_ēnā",
            "Ko ngā pēke a Hōri ēnei",
            "Ko ngā pēke a Tama ērā",
            "Ko ngā aha ēnei?",
            "Ko ngā aha ēnei?",
            "Ko ngā hū o Tama ēnā",
            "Ko ngā pikitia a Tama ēnei",
            "Ko ngā aha ēnā?",
            "Ko ngā aha ērā?",
            "Ko ngā aha ēnā?",
            "Ko ngā aha ērā?",


    };
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] answerData = new String[]{
            "Ko ngā aha ēnā?",
            "Ko ngā pēke a Hōri ēnei",
            "Ko ngā pene whīrā a Hine ēnei",
            "Ko ngā aha ēnei?",
            "Ko ngā hū o Pare ēnā",
            "Ko ngā pene tīpako a Timi ēnā",
            "Ko ngā aha ērā?",
            "Ko ngā pukapuka a Mita ērā",
            "Ko ngā pikitia a Kare ērā",
            "Ko ngā aha ēnei?",
            "Ko ngā pukapuka a Tama_ēnā",
            "Ko ngā aha ēnei?",
            "Ko ngā hū o Tama ēnā",
            "Ko ngā aha ēnā?",
            "Ko ngā hū o  Tama ēnei",
            "Ko ngā aha ēnā?",
            "Ko ngā pikitia a Tama ēnei",
            "Ko ngā aha ērā?",
            "Ko ngā pēke a Tama ērā",
            "Ko ngā aha ērā?",
            "Ko ngā rūri a Tama ērā"
    };
    public static final String[] quesData = new String[]{
            "What are those? (Near the listener)",
            "These are Hōri’s bags",
            "These are Hine’s felts",
            "What are these? (Near the speaker)",
            "Those are Pare’s shoes",
            "Those are Timi’s highlighters",
            "What are those? (Over yonder)",
            "Those are Mita’s books (Over yonder)",
            "Those are Kare’s pictures (over yonder)",
            "What are these? (Near speaker)",
            "Those are Tama’s books",
            "What are these? (Near speaker)",
            "Those are Tama’s shoes",
            "What are those? (Near listener)",
            "These are Tama’s shoes",
            "What are those? (Near listener)",
            "These are Tama’s pictures",
            "What are those? (Over yonder)",
            "Those (over yonder) are Tama’s bags",
            "What are those? (Over yonder)",
            "Those (over yonder) are Tama’s rulers"

    };

    public Level4Day4ExerciseData() {
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
