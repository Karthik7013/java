import java.util.*;

import java.io.IOException;

public class Swiggy {

    static Scanner sc = new Scanner(System.in);
    static boolean exit = true;

    public static void main(String[] args) {
        while (exit) {
            clearTerminal();
            home();
        }
    }

    public static void home() { // login
        banner();
        System.out.println("Choose One Option : ");
        System.out.println("1. Login =>");
        System.out.println("2. Reg =>");
        System.out.println("3. Exit");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        System.out.println("choosed is =>" + option);
        if (option.equals("1")) {
            System.out.print("Enter Your Name : ");
            String name = sc.next();
            System.out.print("Enter Your Password : ");
            String password = sc.next();
            login(name, password);
        } else if (option.equals("2")) { // reg option
            System.out.print("*Enter Your Name : "); // new user name
            String newName = sc.next();
            System.out.print("*Enter Your Password : "); // new password
            String newPassword = sc.next();
            System.out.print("*Enter Your Email : "); // new email
            String newEmail = sc.next();
            register(newName, newPassword, newEmail);
        } else {
            try {
                exit = false;
                Swiggy.clearTerminal();
                System.out.println("/ = = = = = = = Visit Again = = = = = = = /");
            } catch (Exception es) {
            }

        }
    }

    public static void banner() { // banner method
        System.out.println("/ = = = = = = = = = = = /");
        System.out.println("/     S W I G G Y !     /");
        System.out.println("/ = = = = = = = = = = = /");
    }

    public static void login(String name, String password) {
        if (name.equals("karthik") && password.equals("1234")) {
            System.out.println(" Hello " + name + " ! ");
            int a = sc.nextInt();
        } else {
            System.out.println(" X ---------- Wrong Password ------------ X");
        }
    }

    public static void register(String newName, String newPassword, String newEmail) {
        System.out.println("registered Successfully...");
    }

    public static void clearTerminal() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {

        }

        try {
            ProcessBuilder processBuilder;

            if (System.getProperty("os.name").contains("Windows")) {
                // For Windows
                processBuilder = new ProcessBuilder("cmd", "/c", "cls");
            } else {
                // For Unix-like systems (macOS, Linux, etc.)
                processBuilder = new ProcessBuilder("clear");
            }
            processBuilder.inheritIO();
            Process process = processBuilder.start();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
