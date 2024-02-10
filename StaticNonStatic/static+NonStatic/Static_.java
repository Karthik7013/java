class Static_ {
    static int staticVariable = 100;
    int y = 200;
    {
        System.out.println("IIB"); // iib block will executes as many times as you create the object
    }
    static {
        System.out.println("SIB"); // Sib block will executes only onces during static initializer.
    }

    public static String staticMethod() {
        return "Static Method";
    }

    public String nonStaticMethod() {
        // access static and non static memeber in non static context
        // this keyword is used in non-static context !!!!
        // this keyword gives current object address

        // ===================== static members======================
        System.out.println(Static_.staticVariable); // static variable are accessed by class name/direclty/object
        System.out.println(Static_.staticMethod()); // static methods are accessed by class name/direclty/object

        // ===================== non static members==================
        // this keyword is used to access non static memebers or object ref variable
        System.out.println(this.y); // object ref variable is used to access non static variable
        // System.out.println(this.nonStaticMethod()); // object ref variable is used to
        // call the non static method
        return "Non Static Method";
    }

    public static void main(String[] args) {
        // access static and non static members in static context
        // this keyword is absent in static context !!!!

        // ===================== static members======================
        System.out.println(Static_.staticVariable); // static variable are accessed by class name/direclty/object
        System.out.println(Static_.staticMethod()); // static methods are accessed by class name/direclty/object

        // ===================== non static members==================
        Static_ obj1 = new Static_(); // to access non static member obj creation is mandatory!
        System.out.println(obj1.y); // object ref variable is used to access non static variable
        System.out.println(obj1.nonStaticMethod()); // object ref variable is used to call the non static method
    }

}
