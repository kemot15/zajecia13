package Zad3;

import Zad2.Product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Book {
    public static void main(String[] args) {
        Product[] product = new Product[3];
       // File file = new File("d:\\pantadeusz.txt");
        File file = new File("d:\\ksiega.txt");
        int[] alfabet = new int [26];
        int[] dlugoscSlow = new int[30];
        int max = 0;
        try {       //try with resources mozna dodac do automatycznego zamykania buffereader itd
            FileReader fr = new FileReader(file);
            String line = null;
            BufferedReader bufferedReader = new BufferedReader(fr);
            int licznik;
            while ((line = bufferedReader.readLine()) != null){
                line.replace(",", "");
                line.replace(".", "");
                line.replace("!", "");
                line.replace("?", "");

                String[] word = line.split(" ");
                for (int i = 0; i < word.length; i++){
                    dlugoscSlow[word[i].length()]++;
                }
                for (int i = 0; i < alfabet.length; i++) {
                    String ch = String.valueOf((char)(i+97));
                    alfabet[i] += line.length() - line.toLowerCase().replace(ch, "").length();
                    if (alfabet[i]>max)
                        max = alfabet[i];
                }
            }
        } catch (
                IOException e) {
            System.out.println("nie znaleziono pliku");
        }
        int i = 0;
        for (int el: alfabet) {
            System.out.print((char)(i+97) + " " + el);
            int star = el*50/max;
            for (int j =0; j < star; j++){
                System.out.print("*");
            }
            i++;
            System.out.println();
        }
        i =0;

        for (int el: dlugoscSlow) {
            System.out.println(i + " "+ el);
            i++;
        }
        //System.out.println(max);
    }
}



