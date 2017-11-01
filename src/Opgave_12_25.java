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
        int howManyAssistant = 0;
        int howManyAssociate = 0;
        int howManyFull = 0;

        try {
            // Laver et url objekt af klassen URL til filen på internettet
            URL url = new URL("http://www.cs.armstrong.edu/liang/data/Salary.txt");

            // Laver en inputFromWeb objekt af klassen scanner til at læse fra filen
            Scanner inputFromWeb = new Scanner(url.openStream());

            // Løkke der kører så længe at der er noget at scanne i filen
            // Indlæser det næste i rank, hvis rank er assistant, associate eller full bliver tallet taget og pludset med en af ranks total variablerne og formateret så der kun er 2 tal efter punktum
            // I hver if bliver der talt hvor mange gange den if kører
            while (inputFromWeb.hasNext()) {

                String rank = inputFromWeb.next();

                if (Objects.equals(rank, "assistant")) {
                    String assistantValue1 = inputFromWeb.next();
                    double assistantValue2 = Double.valueOf(assistantValue1);
                    totalAssistant = totalAssistant + assistantValue2;
                    totalAssistant = round(totalAssistant);
                    howManyAssistant++;
                }

                if (Objects.equals(rank, "associate")) {
                    String associateValue1 = inputFromWeb.next();
                    double associateValue2 = Double.valueOf(associateValue1);
                    totalAssociate = totalAssociate + associateValue2;
                    totalAssociate = round(totalAssociate);
                    howManyAssociate++;
                }

                if (Objects.equals(rank, "full")) {
                    String fullValue1 = inputFromWeb.next();
                    double fullValue2 = Double.valueOf(fullValue1);
                    totalFull = totalFull + fullValue2;
                    totalFull = round(totalFull);
                    howManyFull++;
                }
            }
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL.");
        } catch (IOException ex)    {
            System.out.println("I/O Errors: no such file.");
        }

        // Udskriver total for dem
        System.out.println("Assistants total salary: " + totalAssistant);
        System.out.println("Associates total salary: " + totalAssociate);
        System.out.println("Fulls total salary: " + totalFull);

        // Gemmer total for alle facilities i totalAllFacilities
        double totalAllFacilities = totalAssistant + totalAssociate + totalFull;

        // Udskriver facilities total
        System.out.println("All facilities total salary: " + round(totalAllFacilities));

        // Gemmer gemmensnit for dem alle
        double averageForAssistant = totalAssistant / howManyAssistant;
        double averageForAssociate = totalAssociate / howManyAssociate;
        double averageForFull = totalFull / howManyFull;
        double averageForAll = totalAllFacilities / (howManyAssistant + howManyAssociate + howManyFull);

        // Udskriver gemmensnit af dem alle
        System.out.println("\nAverage salary for assistant: " + round(averageForAssistant));
        System.out.println("Average salary for associate: " + round(averageForAssociate));
        System.out.println("Average salary for full: " + round(averageForFull));
        System.out.println("Average salary for all facilities: " + round(averageForAll));

    }

    // Metode til at formatere double tal så de kommer ud med 2 decimaler efter punktum
     private static double round(double numberToRound) {
        String round = String.format("%.2f", numberToRound);
        round = round.replace(",", ".");
        return Double.valueOf(round);
    }

}
