package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private final String title;
    private boolean isTaken;
    private int rating;

    private int ratedNumber;

    private int positiveRates;

    public Video(String title, int rating) {
        this.title = title;
        this.isTaken = false;
        this.rating = rating;
        this.ratedNumber = 1;
        this.positiveRates = rating > 5 ? 1 : 0;
    }

    public String getTitle() {
        return title;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public int getRating() {
        return rating;
    }

    public void giveRating(int youRating) {
        ratedNumber++;
        rating = (rating + youRating) / ratedNumber;
        positiveRates += youRating > 5 ? 1 : 0;
    }

    public int posRatesP() {
        return (100 / ratedNumber) * positiveRates;
    }

    public void takeMovie() {
        isTaken = true;
    }

    public void returnMovie() {
        isTaken = false;
    }


    @Override
    public String toString() {
        return "Title->" + title + '\'' +
                ", availability :" + (isTaken ? "checked out" : "in store") +
                ", rating = " + rating + "\n";
    }
}
