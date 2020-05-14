package com.company.Assignment;

import java.util.Scanner;
/**
 * The class of game is the main part of the whole game. It determine the processes to run the game and provide options to players.
 * 
 * 
 * @author  YAN LIU (29094496)
 * @version 7th / may / 2020
 */

// This is a class of game
public class Game 
{
    private Player cardGamePlayer;
    /**
     * Constructor for objects of class Game(default)
     */
    public Game()
    {
        cardGamePlayer = new Player();
    }
    
    /**
     * Constructor for objects of class Game(non-default)
     */
    public Game(Player cardGamePlayer)
    {
        this.cardGamePlayer = cardGamePlayer;
    }
    
    /**
     * a method to judge whether player wants to play one more time or not.
     * return ture or false (boolean) to show player's choice.
     */
    public boolean askPlayerToContinue()
    {
        boolean isValidInput = true;
        do 
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to continue(Y/N)?");
            String userInput = scanner.nextLine();
            isValidInput = String.valueOf(userInput.charAt(0)).equalsIgnoreCase("Y")
                    || String.valueOf(userInput.charAt(0)).equalsIgnoreCase("N");
            if (isValidInput && String.valueOf(userInput.charAt(0)).equalsIgnoreCase("Y"))
                return true;
            else if (isValidInput && String.valueOf(userInput.charAt(0)).equalsIgnoreCase("N"))
                return false;
        } 
        while (!isValidInput);
        return true;
    }
    
    /**
     * A method to compare guess number with hidden number.
     * @param card the card number.
     * @return true or false(boolean) to show whether the two number(guess number and hidden number)  is equal or not.
     */
    public boolean compareGuessNumberWithHiddenNumber(Card card)
    {
        // String -> int then compare
        if (card.getNumber() == Integer.parseInt(cardGamePlayer.getGuess()))
            return true;
        else
            return false;
    }

    /**
     * A method to compare guess suit with hidden suit
     * @param the card suit String.
     * @return : false or true(boolean) to show whether the two Strings(guess String and hidden String) is equal or not.
     */
    public boolean compareGuessSuitWithHiddenSuit(Card card)
    {
        if (card.getSuit() == cardGamePlayer.getGuess())
            return true;
        else
            return false;
    }

    /**
     * a method of display the guess number is correct or not.
     * param an interger which means the times of player guessed.
     * param a boolean which shows the guess number is correct or not.
     */
    public void displayGuessNumberResult(int i, boolean guessNumberIsRight)
    {
        if (guessNumberIsRight)
            System.out.println("Brilliant! The number you guess is right!");
        else
        {
            System.out.println("Oops! The number you guess is wrong!");
            System.out.println("You lost " + i * (i + 1) + " points...");
            int scoreAfterDeduction = cardGamePlayer.getScore() - i * (i + 1);
            cardGamePlayer.setScore(scoreAfterDeduction);
        }
        System.out.println("Your current score is: " + cardGamePlayer.getScore());
    }
    
    /**
     * A method to display guess suit result.
     * @param an interger which is the user's input suit String.
     * @param an bollean whether the guess card suit is correct or not.
     * @return false or true(boolean) to validate the player's input is correct or not.
     */
    public void displayGuessSuitResult(int i, boolean guessSuitIsRight)
    {
        if (guessSuitIsRight)
            System.out.println("Brilliant! The suit you guess is right!");
        else
        {
            System.out.println("Oops! The suit you guess is wrong!");
            System.out.println("You lost " + i * 5 + " points...");
            int scoreAfterDeduction = cardGamePlayer.getScore() - i * 5;
            cardGamePlayer.setScore(scoreAfterDeduction);
        }
        System.out.println("Your current score is: " + cardGamePlayer.getScore());
    }
   
    /**
     * a method to display the player's overall result.
     */
    public void displayOverallResult()
    {
        System.out.println("===========Overall Result============");
        System.out.println("The number of games you played: " + cardGamePlayer.getNumberOfGamesPlayed());
        System.out.println("The number of games you won: " + cardGamePlayer.getNumberOfGamesWon());
        System.out.println("The highest score you get: " + cardGamePlayer.getHighestScore());
    }
    
    /**
     * A method to display welcome message
     */
    public void displayWelcomeMessage()
    {
        System.out.println("Welcome to guess card game!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please press enter to start the game!");
        scanner.nextLine();
    }
    
    /**
     * A method to generate random card.
     * @param card to generate random card number.
     */
    private void generateRandomCard(Card card)
    {
        // step 1:generate suit
        // 1-Heats 2-Diamonds 3-Clubs 4-Spades
        RandomNumber randomGenerator = new RandomNumber(4);
        int randomSuitNumber = randomGenerator.getRandomNumber();
        switch (randomSuitNumber)
        {
            case 1:
                card.setSuit("♥");
                break;
            case 2:
                card.setSuit("♦");
                break;
            case 3:
                card.setSuit("♣");
                break;
            case 4:
                card.setSuit("♠");
                break;
            default:
                card.setSuit("");
                break;
        }
        // step 2:generate number
        // 1~13
        int randomCardNumber = new RandomNumber(13).getRandomNumber();
        card.setNumber(randomCardNumber);
    }

    /**
     * A method to show initia list score
     */
    public void initialiseScore()
    {
        cardGamePlayer.setScore(40);
    }

    /**
     * A method to invite player input their name.
     */
    public void invitePlayerInputPlayerName()
    {
        boolean isValidName = true;
        do
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input your name(only alphabetic letter is acceptable):");
            String userInput = scanner.nextLine();
            // validate name is all letters
            isValidName = validateName(userInput);
            // when user input name is correct, set object name
            if (isValidName)
                cardGamePlayer.setName(userInput);
        }
        while (!isValidName);

        //First time to execute this part of the code

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your name(only alphabetic letter is acceptable):");
        String userInput = scanner.nextLine();
        // validate name is all letters
        isValidName = validateName(userInput);
        // when user input name is correct, set object name
        if (isValidName)
            cardGamePlayer.setName(userInput);

        //Second and more times of execution of this part of the code
        while(!isValidName){
            //Use the variables directly
            scanner = new Scanner(System.in);
            System.out.println("Please input your name(only alphabetic letter is acceptable):");
            userInput = scanner.nextLine();
            // validate name is all letters
            isValidName = validateName(userInput);
            // when user input name is correct, set object name
            if (isValidName)
                cardGamePlayer.setName(userInput);
        }


        //step 1: Read the code. Know the steps taken in this part of the code
        //step 2: Write the loop using for-loop
        //step 3: Decide when to jump out this loop
        for (int i=0;i<1;i=i){
             scanner = new Scanner(System.in);
            System.out.println("Please input your name(only alphabetic letter is acceptable):");
             userInput = scanner.nextLine();
            // validate name is all letters
            isValidName = validateName(userInput);
            // when user input name is correct, set object name
            if (isValidName)
                cardGamePlayer.setName(userInput);

            if (!isValidName){
                break;
            }
        }

        System.out.println("Hi " + cardGamePlayer.getName() + "! Are you ready? Game is about to begin!");
        scanner = new Scanner(System.in);
        System.out.println("Please press enter to continue!");
        scanner.nextLine();
    }
    
    /**
     * a method of the processes of player guess number.
     * @param card the guess card number.
     */
    public void playerGuessNumber(Card card)
    {
        for (int i = 1; i <= 4; i++)
        {
            // request player enter a number and set player guess
            requestPlayerEnterNumber();
            // compare guess suit with hidden suit
            boolean guessNumberIsRight = compareGuessNumberWithHiddenNumber(card);
            // display guess suit result
            displayGuessNumberResult(i, guessNumberIsRight);
            // if correct then break for loop
            if (guessNumberIsRight)
                break;
            else if (cardGamePlayer.getScore() <= 0)
            {
                System.out.println("You have no score to continue the game!");
                break;
            }
            else if (i == 3 && cardGamePlayer.getScore() > 0)
            {
                if (Integer.parseInt(cardGamePlayer.getGuess()) > card.getNumber())
                    System.out.println("HINT: Your last guess is HIGHER than the correct answer");
                else
                    System.out.println("HINT: Your last guess is LOWER than the correct answer");
            }
            else if (i == 4)
                System.out.println("The correct answer is: " + card.getNumber());
        }
    }
    
    /**
     * A method of the processes of player guess suit
     * @param card the guess card suit.
     */
    public void playerGuessSuit(Card card)
    {
        for (int i = 1; i <= 3; i++)
        {
            // request player enter a suit and set player guess
            requestPlayerEnterSuit();
            // compare guess suit with hidden suit
            boolean guessSuitIsRight = compareGuessSuitWithHiddenSuit(card);
            // display guess suit result
            displayGuessSuitResult(i, guessSuitIsRight);
            // if correct then break for loop
            if (guessSuitIsRight)
                break;
            else if (i == 3)
                System.out.println("The correct answer is: " + card.getSuit());
        }
    }
        
    /**
     * A method to ask player to enter the number
     */
    public void requestPlayerEnterNumber()
    {
        boolean isValidGuessNumber = true;


        do 
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please guess a number(1~13):");
            int userInputNumber = scanner.nextInt();
            // validate userInputNumber >=1 && <=13
            isValidGuessNumber = validateUserInputNumber(userInputNumber);
            if (isValidGuessNumber)
            {
                // int -> String then set
                cardGamePlayer.setGuess(String.valueOf(userInputNumber));
            }
        } 
        while (!isValidGuessNumber);



    }
    
    /**
     * A method to request the player to enter suit.
     */
    public void requestPlayerEnterSuit()
    {
        boolean isValidSuit = true;
        do 
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please guess a suit(H-Hearts, D-Diamonds, C-Clubs, S-Spades):");
            String userInput = scanner.nextLine();
            isValidSuit = validateSuit(userInput);
            if (isValidSuit) {
                char guessSuitChar = userInput.toUpperCase().charAt(0);




                switch (guessSuitChar)
                {
                    case 'H':
                        cardGamePlayer.setGuess("♥");
                        break;
                    case 'D':
                        cardGamePlayer.setGuess("♦");
                        break;
                    case 'C':
                        cardGamePlayer.setGuess("♣");
                        break;
                    case 'S':
                        cardGamePlayer.setGuess("♠");
                        break;
                }

                //change it to if-judgement
                if (guessSuitChar=='H'){
                    cardGamePlayer.setGuess("♥");
                }else if (guessSuitChar=='D'){
                    cardGamePlayer.setGuess("♦");
                }else if (guessSuitChar=='C'){
                    cardGamePlayer.setGuess("♣");
                }else {
                    cardGamePlayer.setGuess("♠");
                }

            }
        } 
        while(!isValidSuit);

    }
    
    /**
     * a method to arrange the order of processes in the guess game.
     */
    //To start the game
    public void start()
    {
        // display welcome message
        displayWelcomeMessage();
        // invite player input his/her name
        invitePlayerInputPlayerName();

        boolean isContinue = true;
        do 
        {
            // initialise player score
            initialiseScore();
            Card card = new Card();
            // computer generate a random card
            generateRandomCard(card);
            // show random card
            //System.out.println(card.printCardInfo());
            // player guess suit
            playerGuessSuit(card);
            // player guess number
            playerGuessNumber(card);
            // summarise one round
            summariseOneRound();
            // ask player want to continue or not
            isContinue = askPlayerToContinue();
        } 
        while (isContinue);
        // display overall result
        displayOverallResult();
    }

    /**
     * a method to summarise the result of any one round.
     */
    public void summariseOneRound()
    {
        int currentScore = cardGamePlayer.getScore();
        // if score > 0 means win a round
        if (currentScore > 0)
        {
            System.out.println("Congratulations! You won this game!");
            System.out.println("Your final score is: " + currentScore);
            // update number of games won
            cardGamePlayer.setNumberOfGamesWon(cardGamePlayer.getNumberOfGamesWon() + 1);
            // update highest score
            if (currentScore > cardGamePlayer.getHighestScore())
                cardGamePlayer.setHighestScore(currentScore);
        }
        // update number of games played
        cardGamePlayer.setNumberOfGamesPlayed(cardGamePlayer.getNumberOfGamesPlayed() + 1);
    }
    

    /**
     * A method to validate the number which inputed by player.
     * @param an interger which is the user's input number.
     * @return false or true(boolean) to validate the player's answer is correct or not.
     */
    private boolean validateUserInputNumber(int userInputNumber)
    {
        if(userInputNumber < 1 || userInputNumber > 13)
            return false;
        else
            return true;
    }

    /**
     * A method to validate the player's name.
     * @param a String of user' input.
     * @return false and true(boolean) to validate the input name.
     */
    private boolean validateName(String userInput)
    {
//        for (int i = 0; i < userInput.length(); i++)
//        {
//            // check each char in each index
//            if (!Character.isDigit(userInput.charAt(i)))
//            {
//                return false;
//            }
//
//        }

        //Change the restriction to numbers only
        if (userInput.length()>5){
            //If you need some instruction for the real user, just print something
            return false;
        }else {
            return true;
        }


//        int i=0;
//        while(true){
//            //Judge if we should do this specific part of the loop this time
//            if (i>=userInput.length()){
//                break;
//            }
//            //The code which really completed this things that we want to do
//            if (!Character.isLetter(userInput.charAt(i)))
//            {
//                return false;
//            }
//            //We change the value of the count machine
//            i++;
//        }

//        return true;
    }
    
    /**
     * A method to validate suit's scope
     * @param a String of user's input
     * @return false and true(boolean) to validate the input.
     */
    private boolean validateSuit(String userInput)
    {
        // check the first char
        String firstLetter = String.valueOf(userInput.charAt(0));
        // not in H D C S
        if (!firstLetter.equalsIgnoreCase("H") && !firstLetter.equalsIgnoreCase("D")
                && !firstLetter.equalsIgnoreCase("C") && !firstLetter.equalsIgnoreCase("S"))
            return false;
        else
            return true;
    }
}
