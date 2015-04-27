package com.gdi.hangman;

import java.util.*;

public class Hangman {
	
	static int maxAttempts = 3;
	static int numberAttempts = 0;
	
	public static void main(String[] args) {
		System.out.println("Enter a word in all lowercase letters");
		Scanner input = new Scanner(System.in);
		String secretWord = input.next();
		System.out.println("Secret Word: " + secretWord);
		// create variable wordLength which is the length of the word the user input to guess
		// create variable gameWord - a char array with the same length as wordLength
		// create variable validGuess - a boolean array with the same length as wordLengh
		// create variable guessesRemaining that keeps track of the number of guesses the user has left.
		
		// call the method putWordIntoArray to initialize gameWord using secretWord
		
		// build a while loop that uses the gameOver method.
		// if the gameOver is false, then it should execute the code in the loop.
		// inside the while loop: 
		// 		call getLetterFromUser,
		// 		call guessLetter to check if the letter is in the array
		//      update playerWonTheGame and guessesRemaining when appropriate
		//      call printWord
		
		// if gameOver is true, it won't execute the code in the while loop
		// and you can tell the player that they won or lost.
		
		
	}
	
	/**
	 * This method takes a string from the user and creates an arrays with the letters.
	 * For example, if the user input the word "hello" this method creates the following
	 * array: [h][e][l][l][o] 
	 * @param gameWord - the empty array matching the String the user input, and what the player should guess
	 * @param secretWord - the String input from the user
	 * @return gameWord - the char array that contains our 
	 */
	public static char[] putWordIntoArray(char[] gameWord, String secretWord) {

	}
	
	/**
	 * This method prints the word as the guesser would see them. If the player has not guesses a letter, 
	 * it should be displayed as "_". 
	 * For example: if the user is attempting to guess the word "hello" and has guessed the letters "h" 
	 * and "l", this method should display "h _ l l _ ". 
	 * If the player has guessed no letters, the method should print "_ _ _ _ _". 
	 * If the player has guessed all letters, the method should print "h e l l o".  
	 * @param gameWord - the array the user is attempting to guess
	 * @param validGuess - the boolean array which indicates if a user has guessed a letter or not
	 */
	public static void printWord(char[] gameWord, boolean[] validGuess) {

	}
	
	/**
	 * This method checks to see if a letter is included in the array. 
	 * If the letter is in the array, then the corresponding location in the boolean array
	 * validGuess should indicate that the letter has been guessed. 
	 * Else (the letter is not in the word) this method prints to the screen that the guess is not correct,
	 * and indicates the number of incorrect guesses the user has remaining.
	 * For example, at the beginning of the game before any guesses,
	 *  if the user is trying to guess the word "hello", the gameWord array would be
	 * [h][e][l][l][o] and the validGuess array would indicate [f][f][f][f][f]. 
	 * If letter = h, the method changes the validGuess array to [t][f][f][f][f]. 
	 * If letter = x, the method prints that the guess was incorrect, and the number of remaining attempts.
	 * Finally, the method prints the word as the user has currently guessed it.
	 * @param letter - the letter that we are checking for inclusion in the array.
	 * @param gameWord - the array the user is attempting to guess
	 * @param validGuess - the array indicating if a user has/has not guessed a letter
	 */
	public static void guessLetter(char letter, char[] gameWord, boolean[] validGuess) {

	}
	
	/**
	 * This method gets a single letter input from the user. If the user inputs multiple letters,
	 * the method ignores all later letters and only returns the first one.
	 * @return letter - a single letter from the console. 
	 */
	public static char getLetterFromUser() {
		System.out.println("\nEnter your guess: ");
		Scanner input = new Scanner(System.in);
		char letter = input.next().charAt(0);
		return letter;
	}
	
	/**
	 * This method is run after each turn to determine if the game is over.
	 * A player can loose by making too many incorrect guesses.
	 * A player can win by guessing all correct letters.
	 * Hint: Use an if/else statement here
	 * @param validGuess
	 * @param guessesRemaining
	 * @return - True/False value based on whether the game is over
	 */
	public static boolean gameOver(boolean[] validGuess, int guessesRemaining) {

	}

}

