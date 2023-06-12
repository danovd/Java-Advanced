package _10_Streams_Files_Directories_Exersise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class _06_Word_Count {
    public static void main(String[] args) throws IOException {
        Path pathToWords = Path.of("C:\\Users\\Dimitar Danovski\\Desktop\\" +
                "04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");
        LinkedHashMap <String, Integer> wordsCount = new LinkedHashMap<>();
        List<String> allLinesWords = Files.readAllLines(pathToWords);
        allLinesWords.forEach(line -> Arrays.stream(line.split("\\s+")).forEach(word -> wordsCount.put(word, 0)));

        Path pathText = Path.of("C:\\Users\\Dimitar Danovski\\Desktop\\" +
        "04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");

    List<String> textAllLines = Files.readAllLines(pathText);
    for (String line : textAllLines){
        String [] wordInLine = line.split("\\s+");
        Arrays.stream(wordInLine).forEach(word -> {
            if(wordsCount.containsKey(word)){
                int currentCount = wordsCount.get(word);
                wordsCount.put(word, currentCount + 1);
            }
        });
    }
wordsCount.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));

 //   for(Map.Entry e : wordsCount.entrySet()){
 //       System.out.println(e.getKey() + " - " + e.getValue());
 //   }

        PrintWriter writer = new PrintWriter(("countWords.txt"));
    wordsCount.entrySet().forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));
    writer.close();
    }
}
