class Neon {

	public static void main(String[] args) {
		for (int i = 1; i <= 10000; i++) {

			System.out.print(neon(i) == i ? i+"," : "");
		}

		// int x = 2;
		// System.out.println(neon(x) == x ? x + " is Neon Number" : x + " not a Neon
		// Number");
	}

	public static int neon(int n) {
		int sum = 0;
		int num = n * n;
		while (num > 0) {
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		return sum;
	}

}