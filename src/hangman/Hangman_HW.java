package hangman;

import java.util.*;

public class Hangman_HW {
	
	static int maxAttempts = 3;
	static int numberAttempts = 0;
	
	public static void main(String[] args) {
		System.out.println("Enter a word in all lowercase letters");
		Scanner input = new Scanner(System.in);
		String secretWord = input.next();
		
		// create variable wordLength which is the length of the word the user input to gues
		// create a char array with the same length as wordLength
		// create a boolean array with the same length as wordLengh
		
		// call the method putWordIntoArray to make the string into an array
		
		// build a loop to ensure that the players can keep playing until the player either
		// guesses the word or runs out of attempts
		
	}
	
	/**
	 * This method takes a string from the user and creates an arrays with the letters.
	 * For example, if the user input the word "hello" this method creates the following
	 * array: [h][e][l][l][o] 
	 * Hint: use a while loop in this method
	 * @param gameWord - the array matching the String the user input, and what the player should guess
	 * @param secretWord - the String input from the user
	 * @return gameWord - the array that the user needs to guess
	 */
	public static char[] putWordIntoArray(char[] gameWord, String secretWord) {

	}
	
	public static void testPutWordIntoArray(char[] gameWord, String secretWord) {
		System.out.println("The game word")
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
	 * If the letter is not in the word, this method prints to the screen that the guess is not correct,
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
	 * @param wrongAttempts
	 * @return - True/False value based on whether the game is over
	 */
	public static boolean gameOver(boolean[] validGuess, int wrongAttempts) {

	}

}
