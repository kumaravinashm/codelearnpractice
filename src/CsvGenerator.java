import java.io.FileWriter;
import java.io.IOException;

public class CsvGenerator {
    public static void main(String[] args) {
        String fileName = "bids.csv";

        try (FileWriter writer = new FileWriter(fileName)) {
            // Write the header
            writer.append("Bid\n");

            // Write the bid values
            for (int i = 1; i <= 10000; i++) {
                for (int j = 0; j < 10; j++) {
                    writer.append("Bid").append(String.valueOf(i)).append("\n");
                }
            }

            System.out.println("CSV file '" + fileName + "' created successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
