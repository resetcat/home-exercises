package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    static char player = 'X';
    static int turnCount = 0;
    static boolean winner = false;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        initBoard();
        displayBoard();


        while (!winner) {
            System.out.println("'" + TicTacToe.player + "'" + ", choose your location (row,column):");
            String input = keyboard.nextLine();
            int r = getRows(input);
            int c = getColumns(input);
            while (board[r][c] == 'X' || board[r][c] == 'O') {
                System.out.println("This position is already taken \n Enter another position");
                input = keyboard.nextLine();
                r = getRows(input);
                c = getColumns(input);

            }
            turn(input);
        }


    }

    private static void win() {
        winner = true;
        System.out.println("The winner is player " + player);
    }

    private static void checkWinner(char player) {


        if (board[0][0] == player && board[0][1] == player && board[0][2] == player) {
            win();
        } else if (board[0][0] == player && board[1][0] == player && board[2][0] == player) {
            win();
        } else if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            win();
        } else if (board[1][0] == player && board[1][1] == player && board[1][2] == player) {
            win();
        } else if (board[2][0] == player && board[2][1] == player && board[2][2] == player) {
            win();
        } else if (board[2][0] == player && board[1][1] == player && board[0][2] == player) {
            win();
        } else if (board[0][1] == player && board[1][1] == player && board[2][1] == player) {
            win();
        } else if (board[0][2] == player && board[1][2] == player && board[2][2] == player) {
            win();
        } else if (TicTacToe.turnCount >= 9 && !winner) {
            System.out.println("The game is a tie.");
            winner = true;
        }
    }

    private static int getRows(String input) {
        return input.charAt(0) - '0';
    }

    private static int getColumns(String input) {
        return input.charAt(2) - '0';
    }

    private static void turn(String input) {
        int r = getRows(input);
        int c = getColumns(input);
        board[r][c] = player;
        displayBoard();
        TicTacToe.turnCount++;
        checkWinner(player);
        if (player == 'X') {
            player = 'O';
        } else {
            player = 'X';
        }
    }

    private static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = ' ';
            }
        }
    }

    private static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}