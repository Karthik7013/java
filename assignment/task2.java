public class task2 {
    public static void main(String[] args) {
        char upperCh = 'A';
        char lowerCh = 'a';
        while (upperCh <= 'Z') {
            System.out.println(upperCh++ + "" + lowerCh++);
        }
    }
}
