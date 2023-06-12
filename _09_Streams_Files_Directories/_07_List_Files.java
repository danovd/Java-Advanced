package _09_Streams_Files_Directories;

import java.io.File;
import java.io.IOException;

public class _07_List_Files {
    public static void main(String[] args) throws IOException {

        String nameOfFile = "D:\\SoftUni\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";
        File file = new File(nameOfFile);
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    if (!f.isDirectory()) {
                        System.out.printf("%s: [%s]%n",
                                f.getName(), f.length());
                    }
                }
            }
        }

    }
}
