class p23 {
	public static void main(String[] args) {
		int line = 1;
		int count = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= line; j++) {
				System.out.print(count);
				count++;
			}
			line++;
			System.out.println();
		}
	}
}
