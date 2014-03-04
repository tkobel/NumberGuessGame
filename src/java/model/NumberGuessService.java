package model;

import java.io.Serializable;

/**
 *
 * @author Tracy
 */
public class NumberGuessService implements Serializable {
    private int numberToGuess;
    
    public void createNewNumber() {
        numberToGuess = 1 + (int)(Math.random() * (10-1) +1);
    }
    public String checkGuess(String guessString) {
        String msg = "Your guess is ";
        int guess = Integer.valueOf(guessString);
        if (guess < numberToGuess ) {
            msg += "too low.";
        } else if (guess == numberToGuess) {
            msg += "right!";
        } else if (guess > numberToGuess) {
            msg += "too high.";
        }
        return msg;
    }
    
    public boolean isGameWon(int guess) {
        return guess == numberToGuess;
    }
    
}
