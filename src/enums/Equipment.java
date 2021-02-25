package enums;


public enum Equipment {
    IcePeak(" Ледоруб "),
    Alpenstocks(" Альпенштоки "),
    GeologicalHammers(" Геологические молотки ");
    private final String thing;
    Equipment(String thing) {
        this.thing = thing;
    }
    public String getthing() {
        return this.thing;
    }
}
