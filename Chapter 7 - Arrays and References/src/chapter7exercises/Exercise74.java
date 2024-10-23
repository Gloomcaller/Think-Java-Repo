package chapter7exercises;

public class Exercise74 {

	public static boolean[] sieve(int n) {
		boolean[] isPrime = new boolean[n];

		for (int i = 2; i < n; i++) {
			isPrime[i] = true;
		}

		for (int i = 2; i * i < n; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j < n; j += i) {
					isPrime[j] = false;
				}
			}
		}

		return isPrime;
	}

	public static void main(String[] args) {
		int nub = 50;
		boolean[] primes = sieve(nub);

		for (int i = 2; i < primes.length; i++) {
			if (primes[i]) {
				System.out.print(i + " ");
			}
		}
	}
}
