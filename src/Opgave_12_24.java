import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Opgave_12_24 {

    // Lavet af Erik Ruhmanis

    public static void main(String[] args) throws IOException {

        // Laver et file objekt af klassen File til Salary.txt
        File file = new File("other/Salary.txt");

        // Hvis filen eksisterer, udskriver den at den eksisterer og lukker for programmet
        if (file.exists()) {
            System.out.println("File already exists.");
            System.exit(1);
        }

        // Laver filen Salary.txt
        PrintWriter writeToFile = new PrintWriter(file);

        // Laver et random objekt af klassen Random
        Random random = new Random();

        // Udskriver 1000 FirstNames og LastNames ind i filen med mellemrum og 2 digits efter punktum
        for (int i = 1; i <= 1000; i++) {
            writeToFile.print("FirstName" + i + " " + "LastName" + i + " ");

            // Laver et tal mellem 0 og 2
            int rankGenerator = random.nextInt(3);

            // Tjekker hvad rankGenerator har fået af tal og udskriver en af de 3
            if (rankGenerator == 0) {
                int salaryNumber = 50000 + random.nextInt(30000 + 1);
                int randomDigits = random.nextInt(99 + 1);
                writeToFile.print("assistant " + salaryNumber + ".");

                if (randomDigits < 10) {
                    writeToFile.print("0" + randomDigits);
                } else {
                    writeToFile.print(randomDigits);
                }
            }

            if (rankGenerator == 1) {
                int salaryNumber = 60000 + random.nextInt(50000 + 1);
                int randomDigits = random.nextInt(99 + 1);
                writeToFile.print("associate " + salaryNumber + ".");

                if (randomDigits < 10) {
                    writeToFile.print("0" + randomDigits);
                } else {
                    writeToFile.print(randomDigits);
                }
            }

            if (rankGenerator == 2) {
                int salaryNumber = 75000 + random.nextInt(55000 + 1);
                int randomDigits = random.nextInt(99 + 1);
                writeToFile.print("full " + salaryNumber + ".");

                if (randomDigits < 10) {
                    writeToFile.print("0" + randomDigits);
                } else {
                    writeToFile.print(randomDigits);
                }
            }

            // Laver en ny linje
            writeToFile.println();
        }

        // Lukker filen så ændringerne bliver gemt
        writeToFile.close();

    }

}
