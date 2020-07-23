package core.modules;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Reader {
    public static String  readTxtFile(String fileName) {
        String s = "";

        try {
            s = Files.lines(Paths.get(fileName)).reduce("", (a,b) -> a + "\n" + b);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return s;

    }

}
