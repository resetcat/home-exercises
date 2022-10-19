package io.codelex.advancedJavaTest.exercise4;

import java.io.*;

public class ReverseWrite {
    private static String PATH_TO_FILE = "src/main/java/io/codelex/advancedJavaTest/exercise4/";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(PATH_TO_FILE + "sample1.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter((PATH_TO_FILE + "sample2.txt")));

        String line;
        while ((line = in.readLine()) != null) {
            StringBuilder forReverse = new StringBuilder(line);
            out.write(forReverse.reverse() + "\n");

        }

        in.close();
        out.close();
    }
}