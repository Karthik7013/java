public class p27 {

	public static void main(String[] args) {
		int space = 3;
		int k = 1;
		for (int i = 1; i <= 4; i++) {
			int num = 1;
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= k; j++) {
				if (j <= i / 2 + 1) {
					System.out.print(num++);
				} else {
					System.out.print(num--);
				}
			}
			k += 2;
			space--;
			System.out.println();
		}
	}
}
