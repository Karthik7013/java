public class Atmuser {
    public static void main(String[] args) {
        Atm u1 = new Atm("karthik", 1234, 1000);
        u1.logIn();
        System.out.println("------------");
        u1.balaceCheck();
        System.out.println("------------");
        u1.withdrawl(500);
        System.out.println("------------");
        u1.balaceCheck();
        System.out.println("------------");
        u1.logOut();
    }
}
