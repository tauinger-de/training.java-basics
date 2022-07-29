package de.auinger.training.java_basics.scratch;

import java.util.List;

public record Product<TAG>(
        String productId,
        String name,
        double price,
        List<TAG> tag
) {
}



//@Data
//public class LombokProduct<TAG> {
//
//    String productId;
//    String name;
//    double price;
//    List<TAG> tag;
//
//}