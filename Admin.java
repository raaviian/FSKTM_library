import java.util.Scanner;

public class Admin {
    public static boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter admin username:");
        String username = scanner.next();
        System.out.println("Enter admin password:");
        String password = scanner.next();
        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Welcome, admin!");
            return true;
        } else {
            System.out.println("Incorrect username or password.");
            return false;
        }
    }
}
