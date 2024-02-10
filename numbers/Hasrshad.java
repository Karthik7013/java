public class Hasrshad {
    public static void main(String[] args) {
        int i = 10;
        int temp = i;
        int sum = 0;
        while (i != 0) {
            int rem = i % 10;
            sum += rem;
            i /= 10;
        }
        if (temp % sum == 0)
            System.out.println(temp + " is a harsad");
        else
            System.out.println(temp + " is not a harsad");

    }
}
