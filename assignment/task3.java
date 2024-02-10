public class task3 {
    public static void main(String[] args) {
        char upperCh = 'A';
        char lowerCh = 'a';
        int count = 1;
        while (upperCh <= 'Z') {
            System.out.println(upperCh++ + "" + lowerCh++ + "" + count++);
            // lowerCh++;
            // upperCh++;
            // count++;
        }
    }
}
