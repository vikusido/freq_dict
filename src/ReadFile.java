import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    private String file_name;

    public ReadFile(String file_name) {
        this.file_name = file_name;
    }

    public String reading() throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file_name))) {
            String line;
            while ((line = reader.readLine()) != null) { //read until the end of the file
                content.append(line).append("\n");
            }
        } catch (IOException ex) {
            System.out.println("Error while reading the file " + ex.getMessage());
        }
        return content.toString();
    }
}