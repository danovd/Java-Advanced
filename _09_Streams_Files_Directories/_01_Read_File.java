package _09_Streams_Files_Directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _01_Read_File {
    public static void main(String[] args) {

    String path = "D:\\SoftUni\\input.txt";
        FileInputStream in = null;
    try{
           in = new FileInputStream(path);
           int theByte = in.read();
            while(theByte >= 0){
                System.out.printf("%s ", Integer.toBinaryString(theByte));
                theByte = in.read();
            }
       }
       catch(IOException e){
           e.printStackTrace();
       };


    }
}
