package Enum;
public enum Speed {
    Fast("Быстро"),
    Slow("Медленно");
    private final String speed;
    Speed(String speed) {
        this.speed = speed;
    }
    public String getword() {
        return this.speed;
    }
}
