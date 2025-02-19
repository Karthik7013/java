//without generics
import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList li = new ArrayList();
        li.add(5);
        li.add("String");
        li.add(5.5);
        li.add('A');
        li.add(true);

        System.out.println(li);
        System.out.println("**************");
        for (Object object : li) {
            System.out.println(object);
        }

    }
    
}
