package OthertASKS.Task01;

public class Word {

    private String word;

    public Word(String word) {
        this.word = word;
    }
    public Word() {
        this.word = "Default word";
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "" + word;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
