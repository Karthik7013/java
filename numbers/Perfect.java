public class Perfect {
    public static void main(String[] $) {
        int num = 29;
        System.out.println(perfect(num));
    }

    public static String perfect(int num) {
        int temp = num;
        int i = 1, sum = 0;
        while (i <= temp / 2) {
            if (temp % i == 0) {
                sum += i;
            }
            i++;
        }
        return (num == sum ? num + " is a Perfect Number" : num + " not a Perfect Number");
    }
}
