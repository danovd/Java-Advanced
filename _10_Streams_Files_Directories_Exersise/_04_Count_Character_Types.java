package _10_Streams_Files_Directories_Exersise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _04_Count_Character_Types {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Dimitar Danovski\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2)\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt";
        File file = new File(path);
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = reader.readLine();
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;
        List<Character> vowelList = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        List<Character> punctuationList = new ArrayList<>(Arrays.asList('.', ',', '!', '?'));

        while(line != null){

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);

                if(Character.isLetter(c)){
                    if(vowelList.contains(c)){
                        vowels++;
                    }else {
                        consonants++;
                    }
                }else if(punctuationList.contains(c)){
                    punctuation++;
                }
            }
            line = reader.readLine();
        }
       // Vowels: 41
       // Consonants: 72
       // Punctuation: 6

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Punctuation: " + punctuation);
    }
}
