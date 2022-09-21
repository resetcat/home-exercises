package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    static VideoStore store = new VideoStore(COUNT_OF_MOVIES);

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to see all videos (as user)");
            System.out.println("Choose 3 to rent video (as user)");
            System.out.println("Choose 4 to return video (as user)");
            System.out.println("Choose 5 to rate a video (as user)");
            System.out.println("Choose 6 to see rating of a video (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0 -> System.exit(0);
                case 1 -> fillVideoStore(keyboard);
                case 2 -> store.allMovies();
                case 3 -> rentVideo(keyboard);
                case 4 -> returnVideo(keyboard);
                case 5 -> giveRating(keyboard);
                case 6 -> seeRating(keyboard);
                default -> {
                }
            }

        }
    }

    private static void seeRating(Scanner scanner) {
        System.out.println("Which movie rating would you like to see ?");
        scanner.nextLine();
        store.getRating(scanner.nextLine());
    }

    private static void giveRating(Scanner scanner) {
        System.out.println("Which movie would you like to rate ?");
        scanner.nextLine();
        store.rateVideo(scanner.nextLine());
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            scanner.nextLine();
            String movieName = scanner.nextLine();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            store.addMovie(i, movieName, rating);
        }
    }

    private static void rentVideo(Scanner scanner) {
        store.availableMovies();
        scanner.nextLine();
        System.out.println("Enter the title of the video you want to rent:");
        store.takeAMovie(scanner.nextLine());
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter the title of the video you want to return:");
        store.takenMovies();
        scanner.nextLine();
        store.returnMovie(scanner.nextLine());
    }
}
