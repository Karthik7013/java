import java.lang.reflect.Array;
import java.util.ArrayList;

public class Seven {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(1);
        list.add(1001);
        list.add(1002);
        System.out.println(list.get(list.size()));
    }
}
