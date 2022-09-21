package io.codelex.classesandobjects.practice.exercise4;

import static io.codelex.classesandobjects.practice.exercise4.Movie.getPG;

public class MoveMain {
    public static void main(String[] args) {
        Movie[] arr = new Movie[3];
        arr[0] = new Movie("Casino Royale", "Eon productions", "PG13");
        arr[1] = new Movie("Glass", "Buena Vista International", "PG13");
        arr[2] = new Movie("Spider-Man", "Columbia Pictures");
        
        Movie[] arr2 = getPG(arr);

    }


}
