package review;

import java.util.Random;
import java.util.Scanner;

public class Review {
	public static void main(String args[]) {
		Random z = new Random();
		Scanner s = new Scanner(System.in);
		int x = -1;
		while (x != 0) {
			System.out.println("Input a number:");
			x = s.nextInt();
			System.out.println(x);
			if (x % 2 != 0) {
				System.out.println("Odd");
			} else {
				System.out.println("Even");
			}

		}
		// int x = z.nextInt(10) + 1;

		char l = s.nextLine().charAt(0);
		switch (l) {
		case ('a'):
		case ('e'):
		case ('i'):
		case ('o'):
		case ('u'):
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Not a vowel");
			break;
		}
		int n;
		n = s.nextInt();
		int ans = 0;
		for (int i = n; i < 0; i--) {
			ans = n * (i - 1);
		}
		System.out.println(ans);
	}

//factoral for 5: 5*4*3*2*1
}