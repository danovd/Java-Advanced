package _09_Streams_Files_Directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class _06_Sort_Lines {
    public static void main(String[] args) throws IOException {
        String nameOfFile = "D:\\SoftUni\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        Path path = Paths.get(nameOfFile);
        List<String> lines = Files.readAllLines(path);
        Collections.sort(lines);
        lines.forEach(System.out::println);

    }
}
