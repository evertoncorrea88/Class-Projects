
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Everton
 */
public class FileProcessing {

    public static void main(String[] args) {
        try {
            String content = readFile();
            System.out.println(content);
            writeFile(content);
        } catch (IOException e) {
            System.out.println("Intput file is not found");
        }
    }

    public static String readFile() throws IOException {
        String fileName = "source.txt";
        String fileContent = "";
        Scanner scanFile = new Scanner(new FileReader(fileName));
        while (scanFile.hasNext()) {
            fileContent = fileContent + scanFile.nextLine() + "\n";
        }
        return fileContent;
    }

    public static void writeFile(String content) throws IOException {
        PrintWriter pw = new PrintWriter("copy_file.txt");
        pw.print(content);
        pw.close();
    }
}
