package Zad1;

import java.io.*;
import java.util.Scanner;

public class FileZad {
    public static void main(String[] args) {
        File file = new File ("text.txt");
        int wordCount = 0;
        int charCount = 0;
        int blackCharCount = 0;
        try {       //try with resources mozna dodac do automatycznego zamykania buffereader itd
            FileReader fr = new FileReader(file);
            Scanner scanner = new Scanner(file);
            String line = null;
            BufferedReader bufferedReader = new BufferedReader(fr);

            while ((line = bufferedReader.readLine()) != null){
                charCount += line.length();
                String[] word = line.split(" ");
                wordCount += word.length;
                blackCharCount += line.replace(" ", "").length();
//                for (int i = 0; i<word.length; i++){
//                    blackCharCount += word[i].length();
//                }
            }
        } catch (IOException e) {
            System.out.println("nie znaleziono pliku");
        }
        System.out.println("Liczba slow: " + wordCount);
        System.out.println("Liczba znakow: " + charCount);
        System.out.println("Liczba czarnych znakow: " + blackCharCount);

    }
}
