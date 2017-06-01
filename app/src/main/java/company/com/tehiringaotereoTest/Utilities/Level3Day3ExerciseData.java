package company.com.tehiringaotereoTest.Utilities;

import java.util.ArrayList;

import company.com.tehiringaotereoTest.Models.QuesAnsModel;

public class Level3Day3ExerciseData {

    public static final String[] choiceData = new String[]{"Kei hea te kurī?", "Kei roto te pene i te pouaka.", "Kei hea tōku tī-hāte?", "Kei hea te manu?", "Kei hea te pene?", "Kei runga te pukapuka i te ēpu.",
            "Kei hea te pukapuka?", "Kei roto tōu tī hate i te whare", "Kei hea te pene?", "Kei waho.", "Kei waho te manu i te whare.", "Kei waho te manu i te whare", "Kei roto te tote I te kāpata.", "Kei runga.", "Kei roto te tāne i te waka",
            "Kei hea te pata?", "Kei runga te āporo i te tēpu",};
    public static final ArrayList<QuesAnsModel> quesAnsData = new ArrayList<>();
    public static final String[] answerData = new String[]{"Kei hea te manu?", "Kei waho.", "Kei hea te pene?", "Kei runga.", "Kei hea te pukapuka?",
            "Kei runga te pukapuka i te ēpu.", "Kei waho te manu i te whare.", "Kei roto te pene i te pouaka.", "Kei roto te tote I te kāpata.", "Kei runga te āporo i te tēpu", "Kei waho te manu i te whare",
            "Kei roto te tāne i te waka", "Kei hea te kurī?", "Kei hea te pene?", "Kei hea tōku tī-hāte?", "Kei hea te pata?", "Kei roto tōu tī hate i te whare"};
    public static final String[] quesData = new String[]{"Where is the bird?", "Outside.", "Where is the pen?", "On top. ",
            "Where is the book?", "The book is on the table", "The bird is outside the house",
            "The pen is inside of the box", "The salt is inside the cupboard", "The apple is on the table", "The bird is outside of the house",
            "The man is inside the car", "Where is the dog?", "Where is the pen?", "Where is my t-shirt?", "Where is the butter?", "Your t-shirt is inside the house"};

    public Level3Day3ExerciseData() {
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

