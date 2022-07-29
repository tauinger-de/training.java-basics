package de.auinger.training.java_basics.scratch;

public class Season2 {

    public static final Season2 WINTER = new Season2(2);
    public static final Season2 SPRING = new Season2(12);
    public static final Season2 SUMMER = new Season2(49);
    public static final Season2 AUTUMN = new Season2(17);

    private int avgTemperature;

    public Season2(int avgTemperature) {
        this.avgTemperature = avgTemperature;
    }

    public int getAvgTemperature() {
        return avgTemperature;
    }

}
