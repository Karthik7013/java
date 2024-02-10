// package allMix;

public class index {
    // non static memebers ================================//

    {// Instance Initialiser Block
        System.out.println("i am IIB");
    }
    int x = 1; // non static primitive Variable
    String s = "non-static-non-primitive-variable"; // non static non primitive Variable

    public void nonStatic() {// non static method
        System.out.println("i am nonStatic Method");
    }

    // non static memebers =================================//

    // static members ======================================//

    static { // static initialiser block
        System.out.println("i am SIB");
    }
    static int q = 100; // static primitive variable
    static String s1 = "static non-primitive-variable"; // static non primitive variable

    public static void statiC() { // static method
        System.out.println("i am static Method");
    }

    // static members ======================================//

    // has a relation or composition

    Depend dx = new Depend();

    public static void main(String[] args) {
        System.out.println(q); // directly we can access static primitive variables with name or
        System.out.println(index.s1); // we can access static non primitive variables with className
        statiC(); // directly we can access static primitive variable with name or
        index.statiC(); // we can access static members with className

        index obj = new index();
        // object creation:
        // 1. new operator create memory block with address or reference.
        // 2. load all non static members with default values.
        // 3. executes non static initialisation.
        // 4. call the constructor
        // 5. return reference or address
        System.out.println(obj.s); // access non static non primitive variable with obj ref variable
        System.out.println(obj.x); // access non static primitive variable with obj ref variable
        obj.nonStatic(); // access non static method with obj ref variable
        System.out.println(obj.dx.s); // accessing non static non primitive variable of another class;

    }
}
