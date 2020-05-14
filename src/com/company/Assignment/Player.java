package com.company.Assignment;

/**
 * The class show the information of player, at the same time providing the necessary parame of player
 * 
 * @author  YAN LIU (29094496)
 * @version 7th / may / 2020
 */
public class Player
{
    private String name;
    private int score;
    private String guess;
    private int highestScore;
    private int numberOfGamesPlayed;
    private int numberOfGamesWon;

    /**
     * Constructor for objects of class Player(default)
     */
    public Player() {
        name = "";
        score = 0;
        guess = "";
        highestScore = 0;
        numberOfGamesPlayed = 0;
        numberOfGamesWon = 0;
    }

    /**
     * Constructor for objects of class Player(non-default)
     */
    public Player(String name, int score, String guess, int highestScore, int numberOfGamesPlayed, int numberOfGamesWon)
    {
        this.name = name;
        this.score = score;
        this.guess = guess;
        this.highestScore = highestScore;
        this.numberOfGamesPlayed = numberOfGamesPlayed;
        this.numberOfGamesWon = numberOfGamesWon;
    }

    /**
     * a method to get player's guess
     * @return a single String to show player's guess
     */
    public String getGuess() 
    {
        return guess;
    }
    
    /**
     * a method to get player's highest score
     * @return an interger to show player's to show player's highest Score
     */
    public int getHighestScore() 
    {
        return highestScore;
    }
    
    /**
     * a method to get player's name
     * @return a String to show player's name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * a method to get number of games played
     * @return an interger to show player's number of games played
     */
    public int getNumberOfGamesPlayed() 
    {
        return numberOfGamesPlayed;
    }
    
    /**
     * a method to get number of games played
     * @return an interger to show number of games which player won
     */
    public int getNumberOfGamesWon()
    {
        return numberOfGamesWon;
    }

    /**
     * a method to get player's score
     * @return an interger to show player's score
     */
    public int getScore() 
    {
        return score;
    }
    
    /**
     * a method to print player's information
     * @return player's name, socre, guess, highest score, number of games played, number of games won 
     */
    public String printPlayerInfo() 
    {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", guess=" + guess +
                ", highestScore=" + highestScore +
                ", numberOfGamesPlayed=" + numberOfGamesPlayed +
                ", numberOfGamesWon=" + numberOfGamesWon +
                '}';
    }
    
    /**
     * a method to set player's guess
     * @param a single String to show player's guess
     */
    public void setGuess(String guess) 
    {
        this.guess = guess;
    }

    /**
     * a method to set player's highest Score
     * @param an interger to show player's highest Score
     */
    public void setHighestScore(int highestScore) 
    {
        this.highestScore = highestScore;
    }
    
    /**
     * a method to set player's name
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * a method to set player's highest Score
     * @param an interger to show player's  number of games played
     */
    public void setNumberOfGamesPlayed(int numberOfGamesPlayed) 
    {
        this.numberOfGamesPlayed = numberOfGamesPlayed;
    }

    /**
     * a method to set player's highest Score
     * @param an integer of number to show the games played
     */
    public void setNumberOfGamesWon(int numberOfGamesWon) 
    {
        this.numberOfGamesWon = numberOfGamesWon;
    }

    /**
     * a method to set player's score
     * @param an interger to show player's score
     */
    public void setScore(int score) 
    {
        this.score = score;
    }
}
