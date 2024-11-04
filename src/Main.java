import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a name of input file in input.txt format");
        Scanner sc = new Scanner(System.in);
        String input_file = sc.nextLine();
        FileCheck checking_input = new FileCheck(input_file);
        checking_input.check();
        System.out.println("Enter a name of output file in output.txt format");
        String output_file = sc.nextLine();
        FileCheck checking_output = new FileCheck(output_file);
        checking_output.check();
        ReadFile read_file = new ReadFile(input_file);
        String content = read_file.reading();
        CountFrequence count = new CountFrequence();
        String frequency = count.counting(content);
        WriteFile write_file = new WriteFile(output_file);
        write_file.writing(frequency);
    }
}