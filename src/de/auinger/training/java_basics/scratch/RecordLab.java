package de.auinger.training.java_basics.scratch;

import java.util.List;

public class RecordLab {

    static Product<String> xbox360 = new Product<>(
            "111-222",
            "XBOX 360 black",
            200.0,
            List.of("video", "hdmi")
    );

    public static void main(String[] args) {
        System.out.println(xbox360);
    }
}
