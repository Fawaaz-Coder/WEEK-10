import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        int userInput;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number: ");
        userInput = sc.nextInt();

        while(userInput < 100){
            System.out.println("Enter a number smaller than 100!");
            System.out.println("To exit enter a number bigger than 100!!");
            userInput = sc.nextInt();
        }
        System.out.println("Congrats you entered the right number!");
    }
}
