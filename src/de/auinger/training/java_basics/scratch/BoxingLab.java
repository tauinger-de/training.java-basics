package de.auinger.training.java_basics.scratch;

import java.util.ArrayList;
import java.util.List;

public class BoxingLab {

    public static void main(String[] args) {
        // boxing ist die Konvertierung von primitivem Datentyp zu objektbasiertem Datentyp
        Long longObj = null;
        long l = longObj.longValue();

        List<Long> listOfLongs = new ArrayList<>();
        listOfLongs.add(l); // auto-boxing
        listOfLongs.add(longObj);
    }


    class ProductDataTransferObject {
        Long productId = null;
        Integer orderCount = 2;
        Boolean enabled = null;
    }
    // <product><orderCount>2</orderCount></product>
    // { }
}
