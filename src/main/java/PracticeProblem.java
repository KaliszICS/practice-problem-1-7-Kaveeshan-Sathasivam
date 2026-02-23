/**
	* File: Lesson 1.7 - Booleans (and, or, not)
	* Author: Kaveeshan Sathasivam
	* Date Created: Feb 23, 2026
	* Date Last Modified: Feb 23, 2026
	*/
import java.util.Scanner;
public class PracticeProblem {
	

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1 && bool2); 
        System.out.println(bool1 || bool2); 
	}

	public static void q2() {
		//Write question 2 code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a lowercase letter: ");
        char firstLetter = scanner.next().charAt(0);

        System.out.print("Input another lowercase letter: ");
        char secondLetter = scanner.next().charAt(0);

        System.out.println(firstLetter < secondLetter);
		

	}

	public static void q3() {
		//Write question 3 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        double number = scanner.nextDouble();

        boolean isBetween = (number >=0) && (number <= 10);
		System.out.println(isBetween);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        double number = scanner.nextDouble();

        boolean torf = (number>0) && (number!=5);
		System.out.println(torf);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = scanner.nextLine();

        boolean result = !word.equals("banana");
        System.out.println(result);

	}

	public static void q6() {
		//Write question 5 code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean isEven = (number % 2 == 0);

        System.out.print("The integer " + number + " is " + isEven);
		System.out.println();

        scanner.close();
	}

}
