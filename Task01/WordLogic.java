package OthertASKS.Task01;

import java.util.Scanner;

public class WordLogic {
    private Word word = new Word();

    Scanner sc = new Scanner(System.in);

    public Word CreateWord() {
        System.out.println("Enter New Word");
        String x = sc.next();
        this.word = new Word(x);
        return word;
    }
}
