package io.codelex.classesandobjects.practice.exercise9;

public class Points {
    private int x;
    private int y;

    private Points(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private void setX(int x) {
        this.x = x;
    }

    private void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Points p1 = new Points(5, 2);
        Points p2 = new Points(-3, 6);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
        swapPoints(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }

    private static void swapPoints(Points p1, Points p2) {
        int temp = p1.x;
        int temp1 = p1.y;
        p1.x = p2.x;
        p1.y = p2.y;
        p2.x = temp;
        p2.y = temp1;

    }


}
