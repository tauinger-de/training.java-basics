package de.auinger.training.java_basics.scratch;

public class EnumLab {

    public static void main(String[] args) {
        Season currentSeason = Season.valueOf(args[0]);

        switch (currentSeason) {
            case SPRING: {
                System.out.println("Endlich Frühling!");
                break;
            }
            case SUMMER: {
                System.out.println("Ab ins Freibad");
                break;
            }
            default: {
                System.out.println("Es ist jetzt " + currentSeason.name());
            }
        }

        for (Season season : Season.values()) {
            System.out.println(season.name() + " -- " + season.getAvgTemperatur() + "°C");
        }
    }
}

