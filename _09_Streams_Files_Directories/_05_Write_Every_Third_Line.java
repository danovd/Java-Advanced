package _09_Streams_Files_Directories;

import java.io.*;

public class _05_Write_Every_Third_Line {
    public static void main(String[] args) throws IOException {
        String path = "D:\\SoftUni\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        BufferedReader in = new BufferedReader(new FileReader(path));

        int counter = 1;
        String line = in.readLine();

        while (line != null) {
            if (counter % 3 == 0) {
                System.out.println(line);
            };
            counter++;
            line = in.readLine();
        }

    }
}
