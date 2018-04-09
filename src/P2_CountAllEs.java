import java.util.Scanner;

/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr8, 2018
*/

/* 2. Your pseudocode algorithm in here

1. Convert string to lower case
2. get length of the string
3. loop through the string
4. check for e character and count
5. output the results

*/


public class P2_CountAllEs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in );
		
		String s = input.nextLine().toLowerCase();
		
		int eCount = 0;
		
		for(int x = 0; x < s.length(); x++) {
			if(s.charAt(x) == 'e') {
				eCount++;
			}
		}
		
		System.out.print( "There were " + eCount + " e's");
		input.close();
	}

}