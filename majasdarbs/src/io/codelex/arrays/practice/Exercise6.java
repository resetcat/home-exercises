package io.codelex.arrays.practice;

import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random(100);
        }
        int[] arrCopy = arr.clone();
        arr[arr.length - 1] = -7;

        System.out.print("Array 1:");
        for (int num : arr) {
            System.out.print(" " + num);
        }
        System.out.println();
        System.out.print("Array 2:");
        for (int num : arrCopy) {
            System.out.print(" " + num);
        }

    }

    public static int random(int max) {
        Random random = new Random();
        return random.nextInt(max) + 1;
    }

}
