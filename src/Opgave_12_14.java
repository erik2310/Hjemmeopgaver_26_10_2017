import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Opgave_12_14 {

    public static void main(String[] args) throws Exception {

        try {
            // Laver et input objekt af klassen Scanner
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the file path:");
            // Spørger om filstien til en fil
            String filePath = input.next();

            // Laver et file objekt af klassen File og indsætter den indtastede filsti ind i dens constructor
            File file = new File(filePath);

            // Laver et scanfile objekt af klassen Scanner til filen
            Scanner scanFile = new Scanner(file);


            // Laver et arrayList objekt af klassen ArrayList som kan indeholde Integers
            ArrayList<Integer> arrayList = new ArrayList<>();

            // Læser filens int værdier og gemmer dem i arrayet
            for (int i = 0; scanFile.hasNextInt(); i++) {

                arrayList.add(i, scanFile.nextInt());

            }

            // Udregner arrayets sum
            int total = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                total = total + arrayList.get(i);
            }

            // Udskriver sum
            System.out.println("Total: " + total);

            // Udregner gennemsnit
            int average = total / arrayList.size();

            // Udskriver gennemsnit
            System.out.println("Average: " + average);

            // Lukker filen
            scanFile.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Incorrect file path.");
        }


    }

}
