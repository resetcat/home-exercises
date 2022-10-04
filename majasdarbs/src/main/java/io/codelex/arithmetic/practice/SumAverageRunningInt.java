package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {

        int sum = 0;
        int lowerBound = 1;
        int upperBound = 100;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }
        double average = (double) sum / (Math.abs(lowerBound) > Math.abs(upperBound) ? lowerBound : upperBound);
        average = (double) Math.round(average * 100) / 100;

        System.out.println("The sum of " + lowerBound + " to " + upperBound + " is " + sum + "\n" + "The average is " + average);
    }
}
