
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) {
        String fileName = "";
        String fileContent = "";
        Scanner scanName = new Scanner(System.in);
        boolean fileFound = false;

        System.out.print("Enter the file name: ");

        while (!fileFound) {
            fileName = scanName.next();
            try {
                Scanner scanFile = new Scanner(new File(fileName));
                fileFound = true;
                while (scanFile.hasNext()) {
                    fileContent = fileContent + scanFile.nextLine() + "\n";
                }
                PrintWriter pw = new PrintWriter("copy_file.txt");
                pw.print(fileContent);
                pw.close();
            } catch (FileNotFoundException e) {
                System.out.println("File " + fileName + " not found.");
                System.out.print("Enter the file name againg: ");
            }
        }
        System.out.println(fileName + " content:");
        System.out.print(fileContent);
    }
}
