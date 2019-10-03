package OthertASKS.Task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {

    private List<Sentence> text;
    private String title;

    public Text() {
        text = new ArrayList<Sentence>();
    }

    public Text(List<Sentence> text) {
        this.text = text;
    }

    public void setText(List<Sentence> text) {
        this.text = text;
    }

    public List<Sentence> getText() {
        return text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addSentenceToText(Sentence sentence) {
        text.add(sentence);
    }

    public void removeLastSentenceFromText(List<Sentence> listSentences) {
        text.remove(text.size() - 1);
    }

    public void printText() {
        System.out.println(text.toString());
    }

    public void printTitle() {
        System.out.println(title);
    }

    @Override
    public String toString() {
        return ""+text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Text)) return false;
        Text text1 = (Text) o;
        return getText().equals(text1.getText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getText());
    }
}
