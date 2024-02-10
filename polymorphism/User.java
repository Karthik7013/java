
public class User {

    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(Child.i);
        System.out.println(Parent.i);
        obj.nonStaticMethod();
    }
}
