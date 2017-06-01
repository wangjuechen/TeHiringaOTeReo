package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level2Day2ExerciseData {

    public static final String[] choiceData = {"Whare is the husband of Mārama.", " Ko Whati tōna tuakana", "Ko _Whare te matua", "Ko Mere rātou ko Kata, ko Roimata ōna tuāhine", "Rāmere",
            "Ko Roimata te pōtiki", "Ko Kata te tamāhine", "Ko Whati rāua ko Hōri ngā", "Mere, rātou ko Roimata,", "ko Kata ngā tamāhine", "Whare raua ko Mārama ", "ngā mātua", " He wahine a Mārama", " Kata is your sister", " He kōtiro a Mere", " Ko Whati raua ko Hōri", " ngā tungāne o ngā kōtiro", " Ko Whare tōna matua.", " Ko Whare tōna matua", " Ko Mārama tōna whaea", " Ko Hōri tōna taina", " Ko au te whaea ", " Ko Mere te mātāmua.", " Whati and Hōri are the sons.", " where is my father", " Ko Mārama  ahau ", " He / She is my grand parent.", " Roimata is the youngest child of my family", " He tāne a Whare", " He tama a Whati ", " I am his son"};
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] quesData = new String[]{"I am Mārama.", "I am the mother", " Whare is the father", " Mere is the oldest child", "Roimata is the youngest child",
            "Kata is the daughter", "Whati and Hōri are the sons", "Mere, Roimata and Ko", "Kata are the daughters", "Whati and Hōri are the sons.", " Mere, Roimata and", " Kata are the daughters", " Whare and Mārama are the parents.", " Whare is a man.", " Mārama is a woman.", " Whati is a boy.", " Mere is a girl.", " Whati and Hōri arethe girl’s brothers", " Ko wai tōna matua?", " Ko wai tōna matua?", " Ko wai tōna whaea?", " Ko wai tōna taina?", " Ko wai tōna tuakana?", " Ko wai ōna tuāhine?", " Ko Whare tōku matua.", " Ko ahau tana tama.", " Ko ia tōku matua tipuna.", " Ko Roimata te pōtiki o tōku whānau", "Ko Kata tō tuahine. ", " Ko Whati rāua ko Hōri ngā tama"};
    public static final String[] answerData = new String[]{"Ko Mārama  ahau", "Ko au te whaea", "Ko _Whare te matua", "Ko Mere te mātāmua.", "Rāmere",
            "Ko Roimata te pōtiki", "Ko Kata te tamāhine", "Ko Whati rāua ko Hōri ngā", "Mere, rātou ko Roimata,", "ko Kata ngā tamāhine", "Whare raua ko Mārama ", "ngā mātua", " He wahine a Mārama", " He tama a Whati", " He kōtiro a Mere", " Ko Whati raua ko Hōri", " ngā tungāne o ngā kōtiro", " Ko Whare tōna matua.", " Ko Whare tōna matua", " Ko Mārama tōna whaea", " Ko Hōri tōna taina", " Ko Whati tōna tuakana", " Ko Mere rātou ko Kata, ko Roimata ōna tuāhine", " Whare is my father.", " I am his son", " Whare is the husband of Mārama.", " He / She is my grand parent.", " Roimata is the youngest child of my family", " He tāne a Whare", " Kata is your sister", " Whati and Hōri are the sons."};

    public Level2Day2ExerciseData() {
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
