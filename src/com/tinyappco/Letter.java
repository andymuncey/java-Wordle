package com.tinyappco;

public class Letter {

    enum Result {
        RIGHT_PLACE, IN_WORD, WRONG
    }

    private Result result;

    public boolean isInWord() {
       // return letterInWord;
        return result == Result.IN_WORD;
    }

    public boolean isInCorrectPlace() {
        return result == Result.RIGHT_PLACE;
    }

    //private final boolean letterInWord;
    //private final boolean letterInCorrectPlace;

    public char getCharacter() {
        return character;
    }

    private final char character;

    public Letter(char character, Result result){
        this.character = character;
        this.result = result;
    }

//    public Letter(char letter, boolean letterInWord, boolean letterInCorrectPlace) {
//        this.character = letter;
//        if (letterInCorrectPlace){
//            result = Result.RIGHT_PLACE;
//        } else if (letterInWord){
//            result = Result.IN_WORD;
//        } else {
//            result = Result.WRONG;
//        }
//
//    }
}
