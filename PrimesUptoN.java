import java.util.Scanner;

public class PrimesUptoN {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
			System.out.print("\nEnter N : ");
			int n = sc.nextInt();
			System.out.println("\nPrimes upto -> "+n+" are : ");
			int primesCount = 0;
			for (int i = 2; i <= n; i++) {
				if(isPrime(i)) {
					System.out.print(i+",");
					++primesCount;
				}
			}
			System.out.println("\nno.of primes : "+primesCount);
			sc.close();
		}
	public static boolean isPrime(int num) {
		if(num < 2)return false;
		
		for(int i = 2 ; i <= Math.sqrt(num);++i) {
			if(num % i == 0)return false;
		}
		return true;
	}
}
