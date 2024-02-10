public class U {
    public static void main(String[] args) {

        /*
         * Object
         *** |
         *** A
         *** |
         *** B
         * 
         */

        // upcasting
        double f = 15;
        A obj1 = new B();
        System.out.println(obj1.j);
        obj1.sub();

        // downCasting
        int j = (int) 12.0;
        B obj2 = (B) obj1;
        System.out.println(obj2);
    }
}
