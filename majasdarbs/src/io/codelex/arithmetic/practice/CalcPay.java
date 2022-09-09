package io.codelex.arithmetic.practice;

public class CalcPay {


        public static void calcPay ( double hourRate, int hoursWorked){
            if (hourRate < 7.50 || hoursWorked > 60) {
                System.out.println("Error. check input");
            } else if (hoursWorked > 40) {
                double overtime = (hoursWorked - 40) * (hourRate * 1.5);
                System.out.println("Your salary is " + ((hourRate * 40) + overtime));
            } else System.out.println("Your salary is " + hourRate * hoursWorked);

        }

    public static void main(String[] args) {
        CalcPay.calcPay(7.5,35);
        CalcPay.calcPay(5.2,47);
        CalcPay.calcPay(10,73);
        CalcPay.calcPay(8,50);
    }


}