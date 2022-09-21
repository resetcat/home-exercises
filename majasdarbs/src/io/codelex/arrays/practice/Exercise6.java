package io.codelex.arrays.practice;

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
        return (int) ((Math.random() * max) + 1);
    }

}
