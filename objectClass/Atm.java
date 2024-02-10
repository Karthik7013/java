public class Atm {
    static String nameAtm = "HDFC";
    String userName;
    int pinCode;
    double balance;
    {
        System.out.println("welcome to " + Atm.nameAtm + " Bank Atm");
    }

    Atm(String userName, int pinCode, double balance) {
        this.userName = userName;
        this.pinCode = pinCode;
        this.balance = balance;
    }

    public void logIn() {
        System.out.println("Login successfull " + this.userName + " pincode xxxx");
    }

    public void balaceCheck() {
        System.out.println("Your balance is " + this.balance);
    }

    public void withdrawl(double amount) {
        this.balance -= amount;
        System.out.println("widthdraw successfull");
        balaceCheck();
    }

    public void logOut() {
        System.out.println("Logout successfull " + this.userName + " pincode xxxx");
    }
}
