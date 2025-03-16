//3. Implement a simple file I/O operation to read data from a text file
import java.io.*;

class FileRead {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("sample.txt");
            BufferedReader reader = new BufferedReader(file);
            String line;

            System.out.println("File Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file.");
        }
    }
}

