public class SOD {
    static int y = 20;
    int i = 100;
    SOD obj = new SOD();

    public static void main(String[] args) {
        SOD obj1 = new SOD();
    }
}

/*
 * The source file is sent to the compiler and compiler checks for syntax and
 * symentics
 * class file is generated
 * class file is sent to jvm
 * 
 * then jvm frame is created in the execution area or stack area
 * jvm calls the class loader
 * class loader perform 3 tasks
 * 1.create a class static area where all static members are present with the
 * class name
 * =>create the class static area with class name SOD
 * =>loads the static int y = 0;main method
 * 2.loads all the static members into the class static area with the default
 * values
 * 3.static initialization is done!
 */