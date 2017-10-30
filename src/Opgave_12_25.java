import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.Scanner;

public class Opgave_12_25 {

    public static void main(String[] args) {

        double totalAssistant = 0.0;
        double totalAssociate = 0.0;
        double totalFull = 0.0;

        try {
            // Laver et url objekt af klassen URL til filen på internettet
            URL url = new URL("http://www.cs.armstrong.edu/liang/data/Salary.txt");

            // Laver en inputFromWeb objekt af klassen scanner til at læse fra filen
            Scanner inputFromWeb = new Scanner(url.openStream());

            // Løkke der kører så længe at der er noget at scanne i filen
            while (inputFromWeb.hasNext()) {

                String rank = inputFromWeb.next();

                if (Objects.equals(rank, "assistant")) {
                    String assistantValue1 = inputFromWeb.next();
                    double assistantValue2 = Double.valueOf(assistantValue1);
                    totalAssistant = totalAssistant + assistantValue2;
                }

                if (Objects.equals(rank, "associate")) {
                    String associateValue1 = inputFromWeb.next();
                    double associateValue2 = Double.valueOf(associateValue1);
                    totalAssociate = totalAssociate + associateValue2;
                }

                if (Objects.equals(rank, "full")) {
                    String fullValue1 = inputFromWeb.next();
                    double fullValue2 = Double.valueOf(fullValue1);
                    totalFull = totalFull + fullValue2;
                }
            }
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL.");
        } catch (IOException ex)    {
            System.out.println("I/O Errors: no such file.");
        }
        System.out.println("totalAssistant: " + totalAssistant);
        System.out.println("totalAssociate: " + totalAssociate);
        System.out.println("totalFull: " + totalFull);

    }

}
