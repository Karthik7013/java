public class Bin64 {

    int number;

    Bin64(int i) {
        this.number = i;
    }

    public String toBinary(int i) {
        String bin = "";
        while (this.number > 0) {
            int rem = this.number % 2;
            bin = rem + bin;
            this.number /= 2;
        }
        return bin;
    }

    public String toDecimal() {
        return "";
    }

    public static void main(String[] args) {
        Bin64 num = new Bin64(100);
        System.out.println(num.toBinary(100));
    }
}
