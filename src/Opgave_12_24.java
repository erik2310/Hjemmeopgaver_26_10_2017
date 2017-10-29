import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Opgave_12_24 {

    public static void main(String[] args) throws IOException {

        // Laver et file objekt af klassen File til Salary.txt
        File file = new File("other/Salary.txt");

        // Hvis filen eksisterer, udskriver den at den eksisterer og lukker for programmet
        if (file.exists()) {
            System.out.println("File already exists.");
            System.exit(1);
        }

        // Laver filen Exercise12_15.txt
        PrintWriter writeToFile = new PrintWriter(file);

        // Laver et random objekt af klassen Random
        Random random = new Random();

        // Udskriver 1000 FirstNames og LastNames ind i filen med mellemrum
        // Den laver bare ikke 2 tal efter punktumet hvis tallet er 9 eller lavere, men gad ikke at fikse det xD
        for (int i = 1; i <= 1000; i++) {
            writeToFile.print("FirstName" + i + " " + "LastName" + i + " ");

            // Laver et tal mellem 0 og 2
            int rankGenerator = random.nextInt(3);

            // Tjekker hvad rankGenerator har fået af tal og udskriver en af de 3
            if (rankGenerator == 0) {
                int salaryNumber = 50000 + random.nextInt(30000 + 1);
                writeToFile.print("assistant " + salaryNumber + "." + random.nextInt(99 + 1));
            }

            if (rankGenerator == 1) {
                int salaryNumber = 60000 + random.nextInt(50000 + 1);
                writeToFile.print("associate " + salaryNumber + "." + random.nextInt(99 + 1));
            }

            if (rankGenerator == 2) {
                int salaryNumber = 75000 + random.nextInt(55000 + 1);
                writeToFile.print("full " + salaryNumber + "." + random.nextInt(99 + 1));
            }

            // Laver en ny linje
            writeToFile.println();
        }

        // Lukker filen så ændringerne bliver gemt
        writeToFile.close();

    }

}
