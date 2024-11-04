import java.io.File;
import java.io.IOException;

public class FileCheck {
    private String file_name;

    public FileCheck(String file_name) {
        this.file_name = file_name;
    }

    public void check() {
        if (!file_name.endsWith(".txt")) { //check the format of file
            System.out.println("Please write a .txt format");
            return;
        }
        File file = new File(file_name);
        if (file.exists()) {
            System.out.println("File already exists"); //check the existence of file
        } else {
            try {
                if (file.createNewFile()) { //creation of file if it hasn't created yet
                    System.out.println("File created with name " + file_name);
                } else {
                    System.out.println("File is not created");
                }
            } catch (IOException ex) {
                System.out.println("Some mistake :( " + ex.getMessage());
            }
        }
    }
}