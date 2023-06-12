package _09_Streams_Files_Directories;

import java.io.File;

public class _08_Nested_Folgers {

    public static void main(String[] args) {
        String nameOfFile = "D:\\SoftUni\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources";
        File file = new File(nameOfFile);
        int count = 0;
        if (file.exists()) {
            count += countFile(file);
        }
        System.out.println(count + " folders");
    }
    public static int countFile(File file){
        int c = 0;
        if(file.exists()){
            if(file.isDirectory()){
                File[] files = file.listFiles();
                for (File f : files) {
                    if (f.isDirectory()) {
                        System.out.printf("%s\n",
                            f.getName());
                        c++;
                    }
                }
                for(File f : files) {
                    c += countFile(f);
                }
            }

        }
        return c;
    }
}
