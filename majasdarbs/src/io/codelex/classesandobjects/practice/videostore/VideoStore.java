package io.codelex.classesandobjects.practice.videostore;

import java.util.Arrays;
import java.util.Scanner;

public class VideoStore {

    private Video[] moviesList;


    public VideoStore(int howManyMovies) {
        this.moviesList = new Video[howManyMovies];
    }

    public void addMovie(int index, String movieName, int rating) {
        moviesList[index] = new Video(movieName, rating);
    }

    @Override
    public String toString() {
        return "VideoStore{" +
                "movies=" + Arrays.toString(moviesList) +
                '}';
    }

    public void takenMovies() {
        System.out.println("Taken videos are:");
        for (Video vid : moviesList) {
            if (vid.isTaken()) {
                System.out.println("\"" + vid.getTitle() + "\"");
            }
        }
    }

    public void availableMovies() {
        System.out.println("Available videos are:");
        for (Video vid : moviesList) {
            if (!vid.isTaken()) {
                System.out.println("\"" + vid.getTitle() + "\" with a rating of " + vid.getRating());
            }
        }
    }

    public void allMovies() {
        for (Video vid : moviesList) {
            System.out.println("\"" + vid.getTitle() + "\" with a rating of " + vid.getRating()
                    + " and it is " + (vid.isTaken() ? " checked out" : " in store"));
        }

    }


    public void takeAMovie(String movie) {
        boolean isValid = false;
        for (Video vid : moviesList) {
            if (vid.getTitle().equals(movie) && !vid.isTaken()) {
                vid.takeMovie();
                isValid = true;
                System.out.println("You have taken the " + vid.getTitle() + " please rewind before return!");
                break;
            } else if (vid.getTitle().equals(movie) && vid.isTaken()) {
                System.out.println("The movie is taken!");
            }
        }
        if (!isValid) {
            Scanner scan = new Scanner(System.in);
            System.out.println("please enter title of the video!");
            takeAMovie(scan.nextLine());
        }
    }

    public void returnMovie(String movie) {
        boolean isValid = false;
        for (Video vid : moviesList) {
            if (vid.getTitle().equals(movie) && vid.isTaken()) {
                vid.returnMovie();
                isValid = true;
                System.out.println("You have returned the " + vid.getTitle() + " . Thank you!");
                break;
            }
        }
        if (!isValid) {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("please enter title of the video!");
            returnMovie(scan1.nextLine());
        }
    }

    public void rateVideo(String movie) {
        boolean isValid = false;
        Scanner scan2 = new Scanner(System.in);
        for (Video vid : moviesList) {
            if (vid.getTitle().equals(movie)) {
                isValid = true;
                System.out.println("How would you rate " + vid.getTitle() + " (1-10):");
                int rate = scan2.nextInt();
                vid.giveRating(rate);
                System.out.println("You rated the movie " + vid.getTitle() + " " + rate + " the total user rating is " +
                        vid.getRating() + " it is liked by " + vid.posRatesP() + " % of users.");

            }
        }
        if (!isValid) {
            System.out.println("please enter title of the video!");
            rateVideo(scan2.nextLine());
        }
    }

    public void getRating(String movie) {
        boolean isValid = false;
        Scanner scan3 = new Scanner(System.in);
        for (Video vid : moviesList) {
            if (vid.getTitle().equals(movie)) {
                isValid = true;
                System.out.println(vid.getTitle() + " has a rating of " + vid.getRating() + " and has "
                        + vid.posRatesP() + "% positive reviews");
            }
        }
        if (!isValid) {
            System.out.println("please enter title of the video!");
            getRating(scan3.nextLine());
        }
    }
}
