package interview;

import java.util.ArrayList;
import java.util.List;

public class Four {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hellow Java");
        String s2 = s1.toString();
        List<String> lst = new ArrayList<String>();
        lst.add(s2);
        System.out.println(s1.getClass());
        System.out.println(s2.getClass());
        System.out.println(lst.getClass());
    }
}
