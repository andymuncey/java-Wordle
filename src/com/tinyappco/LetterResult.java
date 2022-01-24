package com.tinyappco;

public class LetterResult {

    public boolean isLetterInWord() {
        return letterInWord;
    }

    public boolean isLetterInCorrectPlace() {
        return letterInCorrectPlace;
    }

    private final boolean letterInWord;
    private final boolean letterInCorrectPlace;

    public char getLetter() {
        return letter;
    }

    private final char letter;

    public LetterResult(char letter, boolean letterInWord, boolean letterInCorrectPlace) {
        this.letter = letter;
        this.letterInWord = letterInWord;
        this.letterInCorrectPlace = letterInCorrectPlace;
    }
}
