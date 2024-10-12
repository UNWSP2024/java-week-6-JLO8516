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

		String vowels = "aeiouyAEIOUY";
//* This is my attempt to make the program print the last character of the sentence inputed, but I couldn't figure it out
//* but it does single and double consonants and vowels 
		for (count = 0; count <= (sb.length()); count++) {
			if (count == sb.length()) {
				System.out.print(sb.charAt(count));
			} else {

				if (!vowels.contains(String.valueOf(sb.charAt(count)))) {
					if (!vowels.contains(String.valueOf(sb.charAt(count + 1)))) {
						System.out.print(sb.charAt(count));

					} else {
						System.out.print(sb.charAt(count) + "opp");
					}
				} else {
					System.out.print(sb.charAt(count));

				}
			}
		}
	}
}
