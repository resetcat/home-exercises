package io.codelex.exceptions;

public class Exercise2 {
    public void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void methodC() throws ArithmeticException {
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        Exercise2 ex = new Exercise2();
        ex.methodA();
    }
}
