package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public class SPSMain {
    public static void main(String[] args) {
        SPSgame game = new SPSgame(0, 0, 0);

        while (true) {
            System.out.println("Enter s for scissor, p for paper, t for stone, q to quit");
            Scanner scan = new Scanner(System.in);
            String input = (scan.nextLine().toLowerCase());
            if (input.equals("q")) {
                break;
            }
            input = game.checkInput(input);
            ScissorPaperStone userChoice = ScissorPaperStone.getChoiceFromShortcut(input);
            System.out.println(userChoice);

            Random random = new Random();
            ScissorPaperStone pcChoice = ScissorPaperStone.getSPSbyInt(random.nextInt(3));
            System.out.println("PC turn: " + pcChoice);


            if (pcChoice == ScissorPaperStone.PAPER && userChoice == ScissorPaperStone.STONE) {
                System.out.println("Paper wraps stone, pc won");
                game.addPcScore();
            } else if (pcChoice == ScissorPaperStone.STONE && userChoice == ScissorPaperStone.SCISSOR) {
                System.out.println("Stone breaks scissors, pc won");
                game.addPcScore();
                ;
            } else if (pcChoice == ScissorPaperStone.SCISSOR && userChoice == ScissorPaperStone.PAPER) {
                System.out.println("Scissor cits paper, pc won");
                game.addPcScore();
                ;
            } else if (pcChoice == userChoice) {
                System.out.println("Tie!");
            } else {
                System.out.println("You win!");
                game.addUserScore();
            }
            game.addMatch();
        }
        System.out.println("Number of trials: " + game.getMatchCount());
        if (game.getMatchCount() != 0) {
            float pcWinPercent = ((float) game.getPcScore() / game.getMatchCount()) * 100;
            float userWinPercent = ((float) game.getUserScore() / game.getMatchCount()) * 100;
            System.out.print("You won " + game.getUserScore() + "(" + String.format("%.2f", userWinPercent) + "%). ");
            System.out.print("PC won " + game.getPcScore() + "(" + String.format("%.2f", pcWinPercent) + "%). \n");

        }
        System.out.println("Bye!");


    }


}
