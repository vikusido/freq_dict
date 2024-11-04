import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    private String file_name;

    public WriteFile(String file_name) {
        this.file_name = file_name;
    }
    public void writing(String content) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file_name))){
            writer.write(content);
            System.out.println("Written successfully in " + file_name);
        }
        catch(IOException ex){
            System.out.println("Error while writing the file " + ex.getMessage());
        }
    }
}