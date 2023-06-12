package _10_Streams_Files_Directories_Exersise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _05_Input_Line_Numbers {
    public static void main(String[] args)throws IOException {
        String path = "C:\\Users\\Dimitar Danovski\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputLineNumbers.txt";
        File file = new File(path);

        BufferedReader read = new BufferedReader(new FileReader(path));
        String line = read.readLine();
        int count = 1;
        while (line != null){
            StringBuilder sb = new StringBuilder();
            sb.append(count++);
            sb.append(". ");
            sb.append(line);
            System.out.println(sb.toString());
            line = read.readLine();
        }

    }
}
