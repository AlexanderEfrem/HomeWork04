package OthertASKS.Task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {

    private List<Word> sentence;

    public Sentence(List<Word> sentences) {
        this.sentence = sentences;

    }

    public Sentence() {
        this.sentence = new ArrayList<Word>();

    }

    public List<Word> getSentence() {
        return sentence;
    }

    public void setSentence(List<Word> sentences) {
        this.sentence = sentences;
    }

    public void addWordToSentence(Word word) {
        sentence.add(word);
    }

    public void addWordToNewSentence(Word word) {
        ArrayList<Word> wordList = new ArrayList<>();
        wordList.add(word);
        sentence = wordList;
    }

    public void removeLastWordFromSentence(List<Word> listWord) {
        sentence.remove(sentence.size() - 1);

    }

    public void printSentence() {
        System.out.println(sentence.toString());
    }

    @Override
    public String toString() {
        return "" + sentence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence1 = (Sentence) o;
        return Objects.equals(sentence, sentence1.sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentence);
    }

}
