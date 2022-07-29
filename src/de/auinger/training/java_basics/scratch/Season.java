package de.auinger.training.java_basics.scratch;

enum Season {

    // die Werte einer enum sind wie Klassenvariablen (d.h. statische)
    // nur dass diese Instanzen der Enum selbst sind
    WINTER(2),
    SPRING(12),
    SUMMER(49),
    AUTUMN(17);

    private int avgTemperatur;

    Season(int avgTemperatur) {
        this.avgTemperatur = avgTemperatur;
    }

    public int getAvgTemperatur() {
        return avgTemperatur;
    }
}
