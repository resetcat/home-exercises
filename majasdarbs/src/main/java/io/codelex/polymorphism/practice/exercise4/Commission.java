package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {
    private double totalSales = 0;
    private double comissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,
            double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.comissionRate = commissionRate;
    }

    public void addSales(double sale) {
        totalSales += sale;
    }

    public double pay() {
        double payment = super.pay() + totalSales * comissionRate;
        totalSales = 0;
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + totalSales;
        return result;
    }
}
