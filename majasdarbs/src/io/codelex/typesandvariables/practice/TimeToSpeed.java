package io.codelex.typesandvariables.practice;

public class TimeToSpeed {
    public static void main(String[] args) {
        int distanceMetres = 2500;
        int hours = 5;
        int minutes = 56;
        int seconds = 23;

        double totalHours = hours+ (double)minutes/60 + (double)seconds/3600;
        int totalSeconds = hours*3600 + minutes*60 + seconds;
        double distanceMiles =(double) distanceMetres/1609;
        double distanceKm = (double)distanceMetres/1000;
        System.out.println("Your speed in meters/second is "+ (float)distanceMetres/totalSeconds);
        System.out.println("Your speed in km/h is "+ (float)distanceKm/totalHours);
        System.out.println("Your speed in miles/h is "+ (float)distanceMiles/totalHours);
    }
}
