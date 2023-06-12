package _09_Streams_Files_Directories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class _04_Extract_Integers {
    public static void main(String[] args) throws IOException {
        String inputPath = "D:\\SoftUni\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt";
        String outputPath = "";

        Scanner scanner = new Scanner(new FileInputStream(inputPath));
        PrintWriter out = new PrintWriter(new FileOutputStream(outputPath));

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                out.println(scanner.nextInt());
            }
            scanner.next();
        }
            out.close();
    }
}
