package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Max value ?");
        int max = scan.nextInt();
        for (int i = 1; i <= max; i++) {
            String cwl =
                    (i % 3 == 0) && (i % 5 == 0) ? "FizzBuzz" :
                            (i % 3 == 0) ? "Fizz" :
                                    (i % 5 == 0) ? "Buzz" :
                                            "" + i;
            if (i % 20 == 0) {
                System.out.println(cwl);
            } else {
                System.out.print(cwl + " ");
            }
        }
    }
}
