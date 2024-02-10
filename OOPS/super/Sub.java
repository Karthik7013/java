class Sub extends Super {

    String sonName;
    String daughterName;

    Sub() {
        this();
    }

    Sub(String fatherName, String motherName, String sonName, String daughterName) {
        super(fatherName, motherName);
        System.out.println("sub const");
        this.sonName = sonName;
        this.daughterName = daughterName;
    }

    public static void main(String[] args) {

    }

}
