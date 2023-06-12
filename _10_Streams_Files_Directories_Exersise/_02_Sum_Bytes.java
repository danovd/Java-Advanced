package _10_Streams_Files_Directories_Exersise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _02_Sum_Bytes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Dimitar Danovski\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt";
        File file = new File(path);
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = reader.readLine();
        long sum = 0;
        while(line != null){

            for (int i = 0; i < line.length(); i++) {
                sum += line.charAt(i);
            }

            line = reader.readLine();
        }
        System.out.println(sum);
    }
}
