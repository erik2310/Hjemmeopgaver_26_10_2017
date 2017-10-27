import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Opgave_12_15 {

    public static void main(String[] args) throws IOException {

        // Laver et file objekt af klassen File til Exercise12_15.txt
        File file = new File("other/Exercise12_15.txt");

        // Hvis filen eksisterer, udskriver den at den eksisterer og lukker for programmet
        if (file.exists()) {
            System.out.println("File already exists.");
            System.exit(1);
        }

        // Laver filen Exercise12_15.txt
        PrintWriter writeToFile = new PrintWriter(file);

        // Laver et random objekt af klassen Random
        Random random = new Random();

        // Udskriver 120 integers ind i filen med mellemrum
        for (int i = 0; i < 120; i++) {
            writeToFile.print(random.nextInt(2147483647) + " ");
        }

        // Lukker filen så ændringerne bliver gemt
        writeToFile.close();

        // Laver et scanfile objekt af klassen Scanner til filen
        Scanner scanFile = new Scanner(file);

        // Laver et arrayList objekt af klassen ArrayList som kan indeholde Integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Læser filens int værdier og gemmer dem i arrayet
        for (int i = 0; scanFile.hasNextInt(); i++) {

            arrayList.add(i, scanFile.nextInt());

        }

        // Sorter værdierne fra laveste til højeste
        Collections.sort(arrayList);

        // Udskriver alle værdierne
        for (int i = 0; i < arrayList.size(); i++) {

            System.out.println(arrayList.get(i));

        }


    }

}
