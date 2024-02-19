import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Import Scanner and we want to take 3 number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter The Second Number: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter The Third Number: ");
        int thirdNumber = input.nextInt();

        // We find result. Purpose: Calculate priority
        int result = firstNumber + secondNumber * thirdNumber - secondNumber;
        System.out.println("Calculate Result: " + result);

    }
}