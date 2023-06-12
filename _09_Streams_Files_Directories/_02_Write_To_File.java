package _09_Streams_Files_Directories;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_Write_To_File {
    public static void main(String[] args) {
        String path = "D:\\SoftUni\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        List<Character> chars = new ArrayList<Character>(Arrays.asList(',', '.', '?', '!'));

        try(FileInputStream in = new FileInputStream(path)){
            int symbol = in.read();
            while(symbol >= 0){
                if(!chars.contains((char)symbol)){
                    System.out.print((char)symbol);
                }
                symbol = in.read();
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
