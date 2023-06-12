package _09_Streams_Files_Directories;

import java.io.FileInputStream;
import java.io.IOException;

public class _03_Copy_Bytes {
    public static void main(String[] args) {
        String path = "D:\\SoftUni\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try(FileInputStream in = new FileInputStream(path)){

            int currentByte = in.read();
            while(currentByte >= 0) {
                if (currentByte == ' ') {
                    System.out.print(" ");
                } else if (currentByte == '\n') {
                    System.out.print("\n");
                } else {
                    System.out.print(Integer.toBinaryString(currentByte));
                }
                currentByte = in.read();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        ;

    }
}
