package OthertASKS.Task01;

import java.util.List;
import java.util.Scanner;

public class TextLogic {

    private Text text = new Text();
    private SentenceLogic sentenceLogic = new SentenceLogic();
    private Scanner sc = new Scanner(System.in);

    public Text createNewText () {
        boolean textIsAdded = false;
        loop:
        while (textIsAdded == false) {
            System.out.println("Now choose what would you want:" + "\n 1.Add new sentence" + "\n 2.Remove last sentence" + "\n 3.Print Text" + "\n 4.Print title" + "\n 5.Quite");
            while (sc.hasNextInt() == false) {
                sc.next();
                System.out.println("Now choose what would you want:" + "\n 1.Add new sentence" + "\n 2.Remove last sentence" + "\n 3.Print Text" + "\n 4.Print title" + "\n 5.Quite");
            }
            int SecondChoice = sc.nextInt();

            switch (SecondChoice) {
                case 1:
                    Sentence sentence = sentenceLogic.createSentence();
                    text.addSentenceToText(sentence);
                    break;
                case 2:
                    List<Sentence> sentenceList = text.getText();
                    text.removeLastSentenceFromText(sentenceList);
                    text.setText(sentenceList);
                    break;

                case 3:
                    text.printText();
                    break;
                case 4:
                    text.printTitle();
                    break;
                case 5:
                    textIsAdded = true;
                    break;

            }
        }
        return text;
    }
    public void createTitle() {
        System.out.println("Enter Text Title");
        String x = sc.next();
        this.text.setTitle(x);
    }

}
