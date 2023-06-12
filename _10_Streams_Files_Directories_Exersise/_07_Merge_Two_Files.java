package _10_Streams_Files_Directories_Exersise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

public class _07_Merge_Two_Files {
    public static void main(String[] args) throws IOException {
        Path first = Path.of("C:\\Users\\Dimitar Danovski\\Desktop\\" +
                "04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        Path second = Path.of("C:\\Users\\Dimitar Danovski\\Desktop\\" +
                "04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");

        BufferedReader bf = new BufferedReader(new FileReader(String.valueOf(first)));
        String line = bf.readLine();
        PrintWriter writer = new PrintWriter(("onePlusTwo"));

        while(line != null){
            writer.println(line);
            line = bf.readLine();
        }
        bf = new BufferedReader(new FileReader(String.valueOf(second)));
        line = bf.readLine();
        while(line != null){
            writer.println(line);
            line = bf.readLine();
        }
        writer.close();
    }

}
