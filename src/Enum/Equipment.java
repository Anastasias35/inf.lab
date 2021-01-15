package Enum;
public enum Equipment {
    IcePeak("Ледоруб"),
    Rope("Веревка");
    private final String thing;
    Equipment(String thing) {
        this.thing = thing;
    }
    public String getthing() {
        return this.thing;
    }
}
