public class HappyNumber {
    public static void main(String[] args) {
        // System.out.println(Fascinating.isFascinating(273));
        int num = 68;
        int count = 0;
        while (HappyNumber.extract(num) > 0) {
            if (HappyNumber.extract(num) == 1) {
                System.out.println("Happy");
                break;
            } else {
                if (count >= 4) {
                    System.out.println("Not Happy");
                    break;
                }
                num = HappyNumber.extract(num);
                count++;
            }
        }
    }

    public static int extract(int i) {
        int sum = 0;
        while (i > 0) {
            int rem = i % 10;
            sum += (rem * rem);
            i /= 10;
        }
        // return sum of individual digits
        return sum;
    }
}
