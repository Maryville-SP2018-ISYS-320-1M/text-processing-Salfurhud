/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr8, 2018
*/

import java.util.Scanner;

public class P4_LongestInputString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in );
		System.out.print("How many words will you enter? ");
		int numOfWords = input.nextInt();
		
		String longestWord = getLongestWord(numOfWords);
		
		System.out.printf("The longest word was \"%s\".\n", longestWord );
	}

	public static String getLongestWord(int numOfWords) {
		
		Scanner input = new Scanner(System.in );
		String longestWord = "";
		
		for(int x = 0; x < numOfWords; x++) {
			
			System.out.print( "Enter word " + (x + 1) + ": ");
			
			String word = input.next();
			
			if( word.length() > longestWord.length()) {
				longestWord = word;
			}	
		}
		
		return longestWord;
	}
	
}
