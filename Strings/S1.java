package Strings;

public class S1 {

    /*
     * String is a final class which has no subclass extended to object class and
     * implements to interface like serializable,charsequence,constable.
     * 
     * String are immuatable slight modify create new object
     * 
     * String is a example for Multiple Inheritance
     * 
     */
    public static void main(String[] args) {
        String s = "karthik"; // object create in the string constant pool area
        String s1 = "Karthik"; // new object created in the string constant pool area
        String s2 = "karthik"; // no new object is created in string constant pool area
        System.out.println(s == s2); // true no new object is created same address will be shared
        /*
         * 
         * s = stores the address but address not printed because toString method in
         * object class is overrided in String class i,e sub class
         *
         * s1 = stores the new adress
         *
         * overrided equals() in string class compares the states of the objects
         * not address
         */
        System.out.println(s.equals(s1)); // false compares with the state of the
        System.out.println(s.equalsIgnoreCase(s1)); // compare state ignore casesensitive
        String x1 = new String("try"); // create a new String object in normal heap area
        String x2 = new String("try"); // creates a new String object in normal heap area

    }
}
