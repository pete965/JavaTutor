package com.company.Assignment;

/**
 * This class provide a random number which is an inportant part in the game. 
 * It make sure the card get different random number every time
 * 
 * @author  YAN LIU (29094496)
 * @version 7th / may / 2020
 */
public class RandomNumber
{
    private int maxValue;
    
    /**
     * Constructor for objects of class RandomNumber(default)
     */
    public RandomNumber()
    {
        maxValue = 0;
    }

    /**
     * Constructor for objects of class RandomNumber(non-default)
     */
    public RandomNumber(int maxValue)
    {
        this.maxValue = maxValue;
    }

    /**
     * a method to get max value of card number
     * @return an interger to show a random number between 1 to maximun value
     */
    public int getMaxValue()
    {
        return maxValue;
    }

    /**
     * a method to generate random number
     * @return an interger to show a random number between 1 to maximun value
     */
    public int getRandomNumber()
    {
        // generate a number between 1 - maximum value
        return (int) (Math.random() * maxValue) + 1;

        //12.5-12
        //Math.random() will return a random number range from 0 to 1,[0,1)
        //After multiplied by maxValue(13), the range is [0,13)
        //Then add 1 to it , the range becomes [1,14)
    }

    /**
     * a method to set max value of card number
     * @param an interger to show max value of card number
     */
    public void setMaxValue(int maxValue)
    {
        this.maxValue = maxValue;
    }
}