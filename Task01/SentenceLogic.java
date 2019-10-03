package OthertASKS.Task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SentenceLogic {
    private ArrayList<Word> list = new ArrayList<Word>();
    private Sentence sentences = new Sentence(list);
    private WordLogic wordLogic = new WordLogic();
    private Scanner sc = new Scanner(System.in);


    public Sentence createSentence() {
        boolean wordIsAdded = false;
        loop:
        while (wordIsAdded == false) {
            System.out.println("Now choose what would you want:" + "\n 1.Add new word to previous sentence" + "\n 2.Add new word to new sentence" + "\n 3.Remove last added word" + "\n 4.Print" + "\n 5.Continue");
            while (sc.hasNextInt() == false) {
                sc.next();
                System.out.println("Now choose what would you want:" + "\n 1.Add new word to previous sentence" + "\n 2.Add new word to new sentence" + "\n 3.Remove last added word" + "\n 4.Print" + "\n 5.Continue");
            }
            int firstChoice = sc.nextInt();

            switch (firstChoice) {
                case 1:
                    Word word = wordLogic.CreateWord();
                    sentences.addWordToSentence(word);
                    break;

                case 2:
                    Word word2 = wordLogic.CreateWord();
                    Sentence sentence = new Sentence();
                    sentence.addWordToNewSentence(word2);
                    this.sentences = sentence;
                    break;
                case 3:
                    List<Word> wordArrayList = this.sentences.getSentence();
                    this.sentences.removeLastWordFromSentence(wordArrayList);
                    this.sentences.setSentence(wordArrayList);
                    break;

                case 4:
                    this.sentences.printSentence();
                    break;
                case 5:
                    wordIsAdded = true;
                    break;

            }
        }
        return sentences;
    }
}
