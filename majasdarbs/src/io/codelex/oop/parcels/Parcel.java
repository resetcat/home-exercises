package io.codelex.oop.parcels;

public class Parcel implements Validatable {

    private final int xLength;
    private final int yLength;
    private final int zLength;
    private final float weight;
    private boolean isExpress = true;

    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
    }

    @Override
    public boolean validate() {
        int maxTotalSize = 300;
        int maxLength = 30;
        int maxWeight = 30;
        if (xLength + yLength + zLength >= maxTotalSize) {
            isExpress = false;
            System.out.println("Your parcel is too large!");
        } else if (xLength < maxLength || yLength < maxLength || zLength < maxLength) {
            isExpress = false;
            System.out.println("Parcel is too small! Size should be at least 30x30x30");
        }
        if (weight > maxWeight) {
            isExpress = false;
            System.out.println("Your parcel is too heavy! Maximum weight is 30kg!");
        }
        if (isExpress) {
            System.out.println("Your parcel can be sent by express mail!");
        }

        return isExpress;
    }
}
