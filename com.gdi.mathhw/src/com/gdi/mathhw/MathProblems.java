package com.gdi.mathhw;

import java.math.BigDecimal;

public class MathProblems {

	public static void main(String[] args) {
				
		// We are going to build a little program that will 
		// take values for x and y and tell you all sorts of facts about them.
		
		
		// First you will have to initialize a value for x.
		// You can change this number up to test your program.
		int x = 3;
		int y = 4;
		System.out.println( "x : " + x );
		System.out.println( "y : " + y );
		
		
		// ARE X AND Y EVEN NUMBERS?
		boolean xIsEven;
		xIsEven = x % 2 == 0; 
		System.out.println( "Is x an even number? : " + xIsEven );
		boolean yIsEven;
		yIsEven = y % 2 == 0;
		System.out.println( "Is y an even number? : " + yIsEven);
		
		
		// ARE THEY DIVISIBLE BY 3?
		System.out.println( "Is x divisible by 3? : " + (x % 3 == 0));
		System.out.println( "Is y divisible by 3? : " + (y % 3 == 0));
		
		
		// WHAT IS X^3? (x cubed)
		System.out.println( "x^3 : " + x*x*x);
		
		
		// ARE X AND Y POSITIVE NUMBERS?
		// Decide the best thing to do if x or y is 0
		System.out.println( "Is x a positive number? : " + (x > 0));
		System.out.println( "Is y a positive number? : " + (y > 0));
		
		
		
		// IF X AND Y WERE THE LENGTHS OF THE SHORT SIDES OF A RIGHT TRIANGLE,
		// WHAT WOULD BE THE VALUE OF THE HYPTOENUSE OF THAT RIGHT TRIANGLE?
		double hypotenuse = Math.sqrt(x*x + y*y);
		System.out.println( "The hypotenuse of x and y's triangle is : " + hypotenuse);
		
		
		
		// IF YOU BOUGHT X NUBMER OF ORANGES FOR $.65 EACH
		// AND Y NUMBER OF APPLES FOR $.55 EACH
		// WHAT IS YOUR TOTAL BILL?
		double myBill = x*0.65 + y*0.55;
		System.out.println( "My apples and oranges bill is : " + myBill);
		
		
		// what if x or y was negative? That wouldn't make sense
		// for this question...
		
		
		// talk about doubles
		double example1 = 1.03 - 0.41;
		System.out.println( "example#1: " + example1);
		
		boolean example2 = 999199.1231231235 == 999199.1231231236;
		System.out.println( "example#2: " + example2); 
		
		
		
		// Can solve example 1 with rounding
		example1 = 1.03 - 0.41;
		example1 = Math.round(example1 * 100);
		example1 = example1 / 100;
		//System.out.println( "example#1: " + example1);
		
		
		// Can solve example 2 with a non-primitive type
		// that we won't cover much more in this class
		example2 = new BigDecimal(999199.1231231235) == new BigDecimal(999199.1231231236);
		//System.out.println( "example#2: " + example2); 
		
		
		// WHICH NUMBER, X OR Y, IS LARGER?
		// Decide the best thing to do if x = y
		boolean xIsLarger = (x > y);
		System.out.println( "x is a larger number: " + xIsLarger);
		
		
		
		// If I want to use the original print statement
		// As some mentioned on slack, use "if statement"
		if ( x > y ) {
			System.out.println( "x is a larger number");
		} else if ( x == y ){
			System.out.println( "x and y are equal numbers");
		} else {
			System.out.println( "y is a larger number");
		}
		
			
		// WHICH NUMBER, X/Y or Y/X, IS LARGER?
		// System.out.println( " is the larger number" );
		
		if ( x == y ) {
			System.out.println( "x/y is equal to y/x");
		} else if ( x/y > y/x ){
			System.out.println( "x/y is larger than y/x");
		} else {
			System.out.println( "y/x is larger than x/y");
		}
		
	}
}
