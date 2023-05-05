import java.util.Scanner;

public class A1113362_0421_1 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your email address: ");
        String email = sc.next();
        if (email.matches("\\w+[@]{1}[a-z]+[.]{1}[a-z]+[.]*[a-z]*[.]*[a-z]*")) {
            System.out.println("Your email address is: " + email);
        } else {
            System.out.println("Wrong format, please enter again.");
        }
    }
}
