package Exampleprograms;

import java.util.Scanner;

public class reverseANumber {

	public static void main(String[] args) {
		
		int givenNumber;
		System.out.println("Enter the given number:");
		Scanner scanner = new Scanner(System.in);
		givenNumber=scanner.nextInt();
		int reverse=0;
		while(givenNumber>0)
		{
			reverse=reverse*10;
			reverse=reverse+givenNumber%10;
			givenNumber=givenNumber/10;
		}
		System.out.println("Reverse number is: " +reverse);

	}

}
