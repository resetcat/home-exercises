package io.codelex.typesandvariables.practice;

public class SadFor {


    public static void main(String[] args) {
        System.out.println(test1());
    }

    public static int test1() {
//fixme
        int num = 0;
        for (int i = 0; i < 10; i++) {
            if (Math.sqrt(i) > 2.5) {
                break;
            }
            num = i + 1;
        }

        return num;
//        throw new NoCodeWrittenException();


    }
}
