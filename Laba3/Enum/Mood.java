package Enum;
public enum Mood {
    Happy("Счастливый"),
    Sad("Грустный");
    private final String word;

    Mood(String word) {
        this.word = word;
    }
    public String getword() {
        return this.word;
    }
}
