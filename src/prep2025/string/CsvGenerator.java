package prep2025.string;

import java.io.FileWriter;
import java.io.IOException;

public class CsvGenerator {
    public static void main(String[] args) {
        String fileName = "large_named_rows.csv";

        // Define the name and row ranges exactly as provided
        String[][] ranges = {
                {"Avinash", "1", "1000"},
                {"Tanmay", "1001", "2000"},
                {"Allied", "2001", "3000"},
                {"Apple", "3001", "4000"},
                {"Lenovo", "4001", "5000"},   // invalid range, start > end
                {"Yuri", "5001", "6000"},
                {"Sarath", "6001", "7000"},
                {"Saurabh", "7001", "8000"},   // invalid range, start > end
                {"Sumit", "8001", "9000"},
                {"Samsung", "9001", "10000"},
                {"Random", "10001", "11000"},
                {"View", "11001", "12000"},
                {"Nokia", "12001", "13000"},
                {"Think", "13001", "14000"},
                {"Mac", "14001", "15000"},
                {"Impact", "15001", "16000"},
                {"Tinder", "16001", "17000"},
                {"Impact", "17001", "18000"},
                {"FCT", "18001", "19000"},
                {"Titan", "19001", "20000"}
        };

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.append("name,row_number\n");

            for (String[] range : ranges) {
                String name = range[0];
                int start = Integer.parseInt(range[1]);
                int end = Integer.parseInt(range[2]);

                if (start <= end) {
                    for (int row = start; row <= end; row++) {
                        writer.append(name).append(",").append("row ").append(String.valueOf(row)).append("\n");
                    }
                } else {
                    System.out.println("Skipping range for " + name + " because start > end (" + start + " > " + end + ")");
                }
            }

            System.out.println("CSV file '" + fileName + "' generated successfully.");
        } catch (IOException e) {
            System.err.println("Error while writing file: " + e.getMessage());
        }
    }

}
