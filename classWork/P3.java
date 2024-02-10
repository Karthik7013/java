public class P3 {
    public static void main(String[] args) {
        int start = 1, end = 10;
        print(start, end);
    }

    public static void print(int start, int end) {
        System.out.println(start);
        if (start != end)
            print(++start, end);
    }
}
