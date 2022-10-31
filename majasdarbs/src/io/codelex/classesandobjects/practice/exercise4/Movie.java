package io.codelex.classesandobjects.practice.exercise4;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    public static Movie[] getPG(Movie[] movie) {
        Movie[] newList = new Movie[movie.length];
        int index = 0;
        for (int i = 0; i < movie.length; i++) {
            if (movie[i].rating.equals("PG")) {
                newList[index] = movie[i];
                index++;
            }
        }
        return newList;
    }


}

