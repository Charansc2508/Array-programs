package exeptionhandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("Enter a number to check for Palindrome: ");
				int num = sc.nextInt();
				System.out.println(num);
				if(isPalindrome(num)) {
					System.out.println("Yes...It is aPalindrome number");
					break;
				}
				else {
					System.out.println("Not a Palindrome number");
				}
			}catch(InputMismatchException ime) {
//				System.out.println(ime.getMessage());
				System.out.println("Invalid input!!!...");
				sc.next();
			}catch(Exception ie) {
				System.out.println(ie.getMessage());
			}
			finally {
				sc.close();
			}
		}
	}

	public static boolean isPalindrome(int num) {
		int n = num;
		int rev=0;
		int rem;
		while(num>0) {
			rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		
		return n==rev;
	}
}
