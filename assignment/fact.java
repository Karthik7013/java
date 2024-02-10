class fact {
    public static void main(String[] arr) {
        int i = 1, fact = 1, num = 5;
        while (i <= num) {
            fact *= i++;
        }
        System.out.println(fact);
    }
}