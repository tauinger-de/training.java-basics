package de.auinger.training.java_basics.scratch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionsLab {

    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");
        try {
            new FileOutputStream(file).write(123);
        }
        finally {
            file.delete();
        }

    }
}
