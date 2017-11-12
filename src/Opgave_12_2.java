import java.util.InputMismatchException;
import java.util.Scanner;

public class Opgave_12_2 {

    // Lavet af Erik Ruhmanis

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do  {
            try {
                System.out.println("Enter 2 integers: ");
                int number1 = input.nextInt();
                int number2 = input.nextInt();

                // Display the result
                int result = number1 + number2;
                System.out.println("The sum of the 2 numbers is " + result + ".");

                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("Try again. (Incorrect input: integers are required)");
                input.nextLine();

            }

        } while (continueInput);

    }
}