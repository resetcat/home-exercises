package io.codelex.loops.practice;

public class AsciiFigure {
    static int SIZE = 7;
    static int INCREMENT = 8;

    public static void main(String[] args) {

        int maxLineWidth = INCREMENT * (SIZE - 1);
        for (int line = 0; line < SIZE; line++) {
            int stars = INCREMENT * line;
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

