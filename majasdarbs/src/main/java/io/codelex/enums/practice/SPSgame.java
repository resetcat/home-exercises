package io.codelex.enums.practice;

import java.util.Scanner;

public class SPSgame {
    private int pcScore;
    private int userScore;
    private int matchCount;

    public SPSgame(int pcScore, int userScore, int gameCount) {
        this.pcScore = pcScore;
        this.userScore = userScore;
        this.matchCount = gameCount;

    }

    public int getPcScore() {
        return pcScore;
    }

    public void setPcScore(int pcScore) {
        this.pcScore = pcScore;
    }

    public int getUserScore() {
        return userScore;
    }

    public void setUserScore(int userScore) {
        this.userScore = userScore;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public void setMatchCount(int matchCount) {
        this.matchCount = matchCount;
    }


    public void addMatch() {
        matchCount++;
    }

    public void addPcScore() {
        pcScore++;
    }

    public void addUserScore() {
        userScore++;
    }

    public String checkInput(String nextLine) {
        if (nextLine.equals("s") || nextLine.equals("p") || nextLine.equals("t")) {
            return nextLine;
        } else {
            System.out.println("Invalid input, try again...");
            Scanner scanner = new Scanner(System.in);
            return checkInput(scanner.nextLine());
        }

    }
}
