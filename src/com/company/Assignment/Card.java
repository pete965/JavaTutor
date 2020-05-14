package com.company.Assignment;

/**
 * The class of card show the information of card, and provid output of cad information
 * 
 * @author  YAN LIU (29094496)
 * @version 7th / may / 2020
 */
public class Card
{
    private String suit;
    private int number;

    /**
     * Constructor for objects of class Card(default)
     */
    public Card()
    {
        suit = "";
        number = 0;
    }

    /**
     * Constructor for objects of class Card(non-default)
     */
    public Card(String suit, int number)
    {
        this.suit = suit;
        this.number = number;
    }

    /**
     * a method to get number
     * @return an integer to show the card's number
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * a method to get suit
     * @return a String to show the card's suit
     */
    public String getSuit()
    {
        return suit;
    }

    /**
     * a method to print card information
     * @return the information of card suit number
     */
    public String printCardInfo()
    {
        return "Card[" +
                "suit:'" + suit + '\'' +
                ", number:" + number +
                ']';
    }
    
    /**
     * a method to set number
     * @param an integer to show the card's  number
     */
    public void setNumber(int number)
    {
        this.number = number;
    }
    
    /**
     * a method to set suit
     * @parame a String to show card's suit
     */
    public void setSuit(String suit)
    {
        this.suit = suit;
    }
}
