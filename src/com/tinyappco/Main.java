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
               Letter[] results = game.addGuess(guess);
               printResults(results);
           } else {
               System.out.println("Guess must be 5 letters");
           }
       }
        if (!game.isWon()){
            System.out.println("Sorry, you lose");
        }

    }

    static void printResults(Letter[] results){
        for (Letter result:results) {
            if (result.isInCorrectPlace()){
                printGreen(result.getCharacter()+"");
            } else if(result.isInWord()){
                printYellow(result.getCharacter()+"");
            } else {
                printNormal(result.getCharacter()+"");
            }
        }
        System.out.println();
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";


    //on Mac / Linux, you can swap the commented line in each of the below methods
    //to show colour in the console

    static void printYellow(String text){
        System.out.print("Y");
        //System.out.print(ANSI_YELLOW_BACKGROUND + text + ANSI_RESET );
    }

    static void printGreen(String text){
        System.out.print("G");
        //System.out.print(ANSI_GREEN_BACKGROUND + text + ANSI_RESET);
    }

    static void printNormal(String text){
        System.out.print(" ");
        //System.out.print(text);
    }

}
