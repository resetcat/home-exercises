package io.codelex.oop.parcels;

public class Parcel implements Validatable {

    private int xLenght;
    private int yLenght;
    private int zLenght;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLenght, int yLenght, int zLenght, float weight) {
        this.xLenght = xLenght;
        this.yLenght = yLenght;
        this.zLenght = zLenght;
        this.weight = weight;
        this.isExpress = false;
    }

    @Override
    public boolean validate() {
        int errorCount = 0;
        if (xLenght + yLenght + zLenght >= 300) {
            errorCount++;
            System.out.println("Your parcel is too large!");
        } else if (xLenght < 30 || yLenght < 30 || zLenght < 30) {
            errorCount++;
            System.out.println("Parcel is too small! Size should be at least 30x30x30");
        }
        if (weight > 30) {
            errorCount++;
            System.out.println("Your parcel is too heavy! Maximum weight is 30kg!");
        }
        if (errorCount == 0) {
            isExpress = true;
            System.out.println("Your parcel can be sent by express mail!");
        }

        return isExpress;
    }
}
