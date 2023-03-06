package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

<<<<<<< HEAD
import java.io.ByteArrayInputStream;
import java.io.InputStream;
=======
import java.io.*;
>>>>>>> 4a6cd6e93d1c6be9adb8358ec77f166bb91d11eb
import java.util.Scanner;

public class TestUtil {
    public static Scanner genScanner(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());

        return new Scanner(in);
    }

    public static ByteArrayOutputStream setOutToByteArray() {
        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        return output;
    }

    public static void clearSetOutToByteArray(ByteArrayOutputStream output) {
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        try {
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
