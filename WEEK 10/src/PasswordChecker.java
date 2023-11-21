import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        String password = "password";

        String userInput;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password: ");
        userInput =sc.nextLine();
        int counter = 0;

        while(!userInput.equals(password) && (counter<=3)){
            System.out.println("This is the wrong password.");
            System.out.println("Try again!");
            userInput = sc.nextLine();
            counter++;
        }
        System.out.println("The password is correct!");

    }
}
