package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {
        for (int i = 1; i < 111; i++) {
            String cwl = (i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0) ? "CozaLozaWoza" :
                    (i % 3 == 0) && (i % 5 == 0) ? "CozaLoza" :
                            (i % 5 == 0) && (i % 7 == 0) ? "LozaWoza" :
                                    (i % 3 == 0) && (i % 7 == 0) ? "CozaWoza" :
                                            (i % 3 == 0) ? "Coza" :
                                                    (i % 5 == 0) ? "Loza" :
                                                            (i % 7 == 0) ? "Woza" :
                                                                    "" + i;
            if (i % 11 == 0) {
                System.out.println(cwl);
            }
            System.out.print(cwl + " ");
        }
    }
}
