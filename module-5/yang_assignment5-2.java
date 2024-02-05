/* Alexis Yang
*Module 5 Assignment
*4 February 2024
*/

import java.io.*;
import java.util.Random;

// This class provides methods to create, write to, and read from a file.
class FileOperations {
    private static final String FILE_NAME = "data.file";

    // Creates a new file with the given file name if it does not exist.
    public static void createFile() throws IOException {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("New file created: " + FILE_NAME);
        }
    }

    // Writes 10 randomly generated numbers to the file.
    public static void writeToFile() throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_NAME, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100);
            bufferedWriter.write(String.valueOf(randomNumber));
            bufferedWriter.write(" ");
        }

        bufferedWriter.newLine();
        bufferedWriter.close();
        System.out.println("Numbers written to file: " + FILE_NAME);
    }

    // Reads the data from the file and displays it.
    public static void readFromFile() throws IOException {
        FileReader fileReader = new FileReader(FILE_NAME);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }

    // Main method to demonstrate the usage of the FileOperations class.
    public static void main(String[] args) {
        try {
            createFile();
            writeToFile();
            readFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
