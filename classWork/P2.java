public class P2 {
    public static void main(String[] args) {
        int start = 1;
        int end = 5;
        int sum = sumOf(start, end);
        System.out.println(sum);
    }

    public static int sumOf(int start, int end) {
        return (start == end) ? end : start + sumOf(++start, end);
    }
}
