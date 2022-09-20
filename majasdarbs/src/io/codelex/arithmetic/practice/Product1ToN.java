package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {
        int num = 1;
        int n = 6;

        for (int i = num; i <= n; i++) {
            num *= i;
        }
        System.out.println(num);
    }
}
