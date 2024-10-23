package chapter7exercises;

public class Exercise76 {

	public static boolean[] sieve(int n) {
		boolean[] isPrime = new boolean[n + 1];
		for (int i = 2; i <= n; i++)
			isPrime[i] = true;
		for (int i = 2; i * i <= n; i++)
			if (isPrime[i])
				for (int j = i * i; j <= n; j += i)
					isPrime[j] = false;
		return isPrime;
	}

	public static boolean arePrimeFactors(int num, int[] arr) {
		boolean[] isPrime = sieve(num);
		int product = 1;

		for (int factor : arr) {
			if (!isPrime[factor])
				return false;
			product *= factor;
		}

		return product == num;
	}

	public static void main(String[] args) {
		int n = 30;
		int[] factors = { 2, 3, 5 };

		if (arePrimeFactors(n, factors))
			System.out.println("Numbers in the array are prime factors of our number.");
		else
			System.out.println("Numbers in the array are not prime factors of our number.");
	}
}
