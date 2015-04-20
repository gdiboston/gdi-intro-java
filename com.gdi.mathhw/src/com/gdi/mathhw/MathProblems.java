package com.gdi.mathhw;

public class MathProblems {

	public static void main(String[] args) {
		
		// We are going to build a little program that will 
		// take values for x and y and tell you all sorts of facts about them.
		
		
		// First you will have to initialize a value for x.
		// You can change this number up to test your program.
		int x = 2;
		int y = 3;
		System.out.println( "x : " + x );
		System.out.println( "y : " + y );
		
		
		// ARE X AND Y EVEN NUMBERS?
		boolean xIsEven;
		xIsEven = x % 2 == 0; 
		System.out.println( "Is x an even number? : " + xIsEven );
		// Reminder: x % 2 is read "x mod 2" and is the same as saying
		// the remainder after you divide x by 2.
		// if the remainder after you divide x by 2 is 0, then it is an even number
		// if the remainder after you divide x by 2 is 1, it is an odd number.
		boolean yIsEven;
		// TODO: do the math
		// System.out.println( "Is y an even number? : ");
		
		
		// ARE THEY DIVISIBLE BY 3?
		// TODO: do the math
		// System.out.println( "Is x divisible by 3? : " );
		// System.out.println( "Is y divisible by 3? : " );
		
		
		// WHAT IS X^3? (x cubed)
		// TODO: do the math
		// System.out.println( "x^3 : " );
		
		
		// ARE X AND Y POSITIVE NUMBERS?
		// Decide the best thing to do if x or y is 0
		// TODO: do the math
		// System.out.println( "Is x a positive number? : " );
		// System.out.println( "Is y a positive number? : " );
		
		
		// IF X AND Y WERE THE LENGTHS OF THE SHORT SIDES OF A RIGHT TRIANGLE,
		// WHAT WOULD BE THE VALUE OF THE HYPTOENUSE OF THAT RIGHT TRIANGLE?
		// (hint: Math.sqrt(value); will take the square root of a value.)
		// (another hint: google or ask about the Pythagorean theorem 
		// if you don't know how to solve for the hypotenuse)
		// TODO: do the math
		// System.out.println( "The hypotenuse of x and y's triangle is : " );
		
		
		// IF YOU BOUGHT X NUBMER OF ORANGES FOR $.65 EACH
		// AND Y NUMBER OF APPLES FOR $.55 EACH
		// WHAT IS YOUR TOTAL BILL?
		// TODO: do the math
		// System.out.println( "My apples and oranges bill is : " );
		
		
		// WHICH NUMBER, X OR Y, IS LARGER?
		// Decide the best thing to do if x = y
		// System.out.println( " is the larger number" );
		
		
		// WHICH NUMBER, X/Y or Y/X, IS LARGER?
		// System.out.println( " is the larger number" );
		
	}
}
