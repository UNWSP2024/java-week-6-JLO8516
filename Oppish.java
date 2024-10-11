package week6;

import java.util.Scanner;

public class Oppish {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {

		String phrase;
		int count;

		System.out.println("Enter a Sentence --> ");
		phrase = userinput.nextLine();

		StringBuilder sb = new StringBuilder(phrase);

		char c, c2;
		String sentence;

		for (count = 0; count < (sb.length()); count++) {
			c = sb.charAt(count);
			c2 = sb.charAt(count + 1);
			//System.out.println(c + "\n" + c2);
			if (c != 'a' || c != 'e' || c != 'i' || c != 'o' || c != 'u' || c != 'y' 
					|| c != 'A' || c != 'E' || c != 'I' || c != 'O' || c != 'U' || c != 'Y' || c != ' ') {
				if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u' || c2 == 'y' 
						|| c2 == 'A' || c2 == 'E' || c2 == 'I' || c2 == 'O' || c2 == 'U' || c2 == 'Y' || c2 != ' ') {
				
		            sb.insert(count +1, "opp");
		            count=count+3;
		            System.out.println(sb);
				}
			}
		} System.out.println(sb.toString());
	}
}
