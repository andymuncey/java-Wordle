package com.tinyappco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        WordleGame game = new WordleGame("TOPIC");
        Scanner scanner = new Scanner(System.in);
        while (!game.isFinished()) {
           System.out.println("Enter guess");
           String guess = scanner.nextLine();
           if (guess.length() == 5) {
               LetterResult[] results = game.addGuess(guess);
               printResults(results);
           } else {
               System.out.println("Guess must be 5 letters");
           }
       }
        if (!game.isWon()){
            System.out.println("Sorry, you lose");
        }

    }

    static void printResults(LetterResult[] results){
        for (LetterResult result:results) {
            if (result.isLetterInCorrectPlace()){
                printGreen(result.getLetter()+"");
            } else if(result.isLetterInWord()){
                printYELLOW(result.getLetter()+"");
            } else {
                System.out.print(result.getLetter());
            }
        }
        System.out.println();
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

    static void printYELLOW(String text){
        System.out.print(ANSI_YELLOW_BACKGROUND + text + ANSI_RESET );
    }

    static void printGreen(String text){
        System.out.print(ANSI_GREEN_BACKGROUND + text + ANSI_RESET);
    }

}
