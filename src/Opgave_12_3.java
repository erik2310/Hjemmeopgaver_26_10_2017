import java.util.Random;
import java.util.Scanner;

public class Opgave_12_3 {

    // Lavet af Erik Ruhmanis

    public static void main(String[] args) {

        // Laver et random objekt af klassen Random
        Random random = new Random();

        // Laver et input objekt af klassen Scanner
        Scanner input = new Scanner(System.in);

        // Laver et array hvor der kan være 120 integers i den
        int[] array = new int[120];

        // Fylder arrayet med tilfældige tal
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        // Prøver at spørge om et index tal og udskriver værdien der er i arrayet i den index.
        // Hvis der kommer en ArrayIndexOutOfBoundsException fejl så udskriver den Out of Bounds i steden for.
        try {
            System.out.println("Enter the index of the array:");
            int enteredIndex = input.nextInt();
            System.out.println("The value of index " + enteredIndex + " is: " + array[enteredIndex]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }

    }

}
