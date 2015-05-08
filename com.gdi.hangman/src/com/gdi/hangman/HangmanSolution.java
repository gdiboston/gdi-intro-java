package com.gdi.hangman;

import java.util.*;

public class HangmanSolution {
	
	static int maxAttempts = 3;
	static int numberAttempts = 0;
	
	public static void main(String[] args) {
		System.out.println("Enter a word in all lowercase letters");
		Scanner input = new Scanner(System.in);
		String secretWord = input.next();
		
		int wordLength = secretWord.length();
		char[] gameWord = new char[wordLength];
		boolean[] validGuess = new boolean[wordLength];
		
		putWordIntoArray(gameWord, secretWord);
		//printWord(gameWord, validGuess);
		
		System.out.println("Let's start!\n");
		while (!gameOver(validGuess, numberAttempts)) {
			char letter = getLetterFromUser();
			guessLetter(letter, gameWord, validGuess);
		};
	}
	
	public static char[] putWordIntoArray(char[] gameWord, String secretWord) {
		int i = 0;
		while (i < secretWord.length()) {
			gameWord[i] = secretWord.charAt(i);
			i++;
		}
		return gameWord;
	}
	//gameWord [m] [a] [r] [y]
	//validGuess [true] [false] [false] [true]
	public static void printWord(char[] gameWord, boolean[] validGuess) {
		int i = 0;
		while ( i < gameWord.length) {
			if (validGuess[i]) {
				System.out.print(gameWord[i] + " ");
				i++;
			}
			else {
				System.out.print("_ ");
				i++;
			}
		}
	}
	
	public static void guessLetter(char letter, char[] gameWord, boolean[] validGuess) {
		boolean flag = false;
		
		int i = 0;
		while (i < gameWord.length) {
			if (gameWord[i] == letter) {
				validGuess[i] = true;
				flag = true;
			}
			i++;
		}
		if (!flag) {
			System.out.println(letter + " is not correct");
			numberAttempts++;
			System.out.println("You have " + (maxAttempts-numberAttempts) + " remaining incorrect guesses");
		}
		printWord(gameWord, validGuess);
	}
	
	public static char getLetterFromUser() {
		System.out.println("\nEnter your guess: ");
		Scanner input = new Scanner(System.in);
		char letter = input.next().charAt(0);
		return letter;
	}
	
	public static boolean gameOver(boolean[] validGuess, int wrongAttempts) {
		if (wrongAttempts == maxAttempts) {
			System.out.println("\nYOU LOOSE! Too many bad guesses. Maybe next time!");
			return true;
		}
		else {
			for (int i = 0; i < validGuess.length; i++) {
				  if (!validGuess[i]) return false;
				}
			System.out.println("\nYOU WIN!");
			return true;
		}
	}

}
