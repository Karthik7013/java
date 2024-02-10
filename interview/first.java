public class first {
    private int i;

    public first(int i) {
        this.i = i;
        if (i != 3) {
            first temp = new first(3);
            i++;
        }
        System.out.print(i);
}
public static void main(String[] args) {
    first n = new first(5);
}
    
}