public class P1 {
    public static void main(String[] args) {
        int start = 1, end = 5;
        int result = pro(start, end);
        System.out.println(result);
    }

    public static int pro(int start, int end) {
        if (start == end) {
            return end;
        } else {
            return start * pro(++start, end);
        }
    }
}
