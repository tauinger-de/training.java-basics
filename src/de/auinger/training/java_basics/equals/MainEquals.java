package de.auinger.training.java_basics.equals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainEquals {

    public static void main(String[] args) {
        IdentifiedObject obj1 = new IdentifiedObject();
        IdentifiedObject obj2 = new IdentifiedObject(obj1.getId());

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));

        buckets();
    }


    private static void buckets() {
        int[] bucketCounts = new int[10];

        for (int i = 0; i < 10_000; i++) {
            var identifiedObject = new IdentifiedObject();
            int bucketIndex = Math.abs(identifiedObject.hashCode()) % bucketCounts.length;
            bucketCounts[bucketIndex]++;
        }
        System.out.println(Arrays.toString(bucketCounts));
    }
}
