/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managed.beans;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import model.NumberGuessService;

/**
 *
 * @author Tracy
 */
@Named
@SessionScoped
public class NumberGuessBean implements Serializable {
    private String guessValue;
    private String highestGuess;
    private String lowestGuess;
    private String guessNumber;
    private String direction;
    private String message;
    
    private boolean startButton;
    private boolean guessButton;
    private boolean gameWon;
    
    @Inject
    private NumberGuessService guessService;
    
    @PostConstruct
    public void init() {
        startButton = true;
        gameWon = false;
        guessButton = false;
                
    }
    
    public String startNewGame() {
        guessService.createNewNumber();
        startButton = false;
        guessButton = true;

        return null;
    }
    
    public String makeGuess() {
        message = guessService.checkGuess(guessValue);
        
        return null;
    }

    public String getGuessValue() {
        return guessValue;
    }

    public void setGuessValue(String guessValue) {
        this.guessValue = guessValue;
    }

    public String getHighestGuess() {
        return highestGuess;
    }

    public void setHighestGuess(String highestGuess) {
        this.highestGuess = highestGuess;
    }

    public String getLowestGuess() {
        return lowestGuess;
    }

    public void setLowestGuess(String lowestGuess) {
        this.lowestGuess = lowestGuess;
    }

    public String getGuessNumber() {
        return guessNumber;
    }

    public void setGuessNumber(String guessNumber) {
        this.guessNumber = guessNumber;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStartButton() {
        return startButton;
    }

    public void setStartButton(boolean startButton) {
        this.startButton = startButton;
    }

    public boolean isGuessButton() {
        return guessButton;
    }

    public void setGuessButton(boolean guessButton) {
        this.guessButton = guessButton;
    }

    public boolean isGameWon() {
        return gameWon;
    }

    public void setGameWon(boolean gameWon) {
        this.gameWon = gameWon;
    }

    public NumberGuessService getGuessService() {
        return guessService;
    }

    public void setGuessService(NumberGuessService guessService) {
        this.guessService = guessService;
    }
    
    
}
