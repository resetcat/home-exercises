package io.codelex.loops.practice;

public class AsciiFigure {
    public static void main(String[] args) {

        int size = 7;
        int increment = 8;

        int maxLineWidth = increment * (size - 1);
        for (int line = 0; line < size; line++) {
            int stars = increment * line;
            int numSlashes = (maxLineWidth - stars) / 2;
            for (int i = 0; i < numSlashes; i++) {
                System.out.print("/");
            }
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            for (int i = 0; i < numSlashes; i++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}

