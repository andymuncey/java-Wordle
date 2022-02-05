package com.tinyappco;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class WordleGame {

    private final String word;
    private final List<String> guesses = new ArrayList<>(6);

    public WordleGame(String word){
        this.word = word.toUpperCase(Locale.ROOT);
    }

    boolean isFinished(){
        return isWon() || guesses.size() == 6;
    }

    boolean isWon(){
        if (guesses.size() == 0){
            return false;
        }
        return guesses.get(guesses.size()-1).equals(word);
    }

    Letter[] addGuess(String guess){

        guess = guess.toUpperCase(Locale.ROOT);
        guesses.add(guess);

        Letter[] results = new Letter[5];
        for (int i = 0; i < guess.length(); i++) {
            char letter = guess.charAt(i);
            Letter.Result result = Letter.Result.WRONG;
            if (word.charAt(i) == guess.charAt(i)){
                result = Letter.Result.RIGHT_PLACE;
            } else if (word.contains(letter+"")){
                result = Letter.Result.IN_WORD;
            }
            results[i] = new Letter(letter,result);
        }

        return results;
    }


}
