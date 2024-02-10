public class Sunny {
    public static void main(String[] $) {
        System.out.println(sunny(143));
    }

    public static String sunny(int num) {
        num++;
        int i = 1;
        boolean isSunny = false;
        while (num >= i * i) {
            if (num == i * i) {
                isSunny = true;
                break;
            }
            i++;
        }
        return isSunny ? --num + " is Sunny Number" : --num + " is not Sunny Number";
    }
}
