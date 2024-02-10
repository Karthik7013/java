class doublepro {
    public static void main(String[] args) {
        int res = 1;
        for (int d = 2; d <= 200; d += 2) {
            res = res * d;
            System.out.println(res);
        }
    }
}