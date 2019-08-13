package Zad2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProductReader {
    public static void main(String[] args) {
        Product[] product = new Product[3];
        File file = new File("d:\\test.csv");
        try {       //try with resources mozna dodac do automatycznego zamykania buffereader itd
            FileReader fr = new FileReader(file);
            String line = null;
            BufferedReader bufferedReader = new BufferedReader(fr);
            int i =0;
            while ((line = bufferedReader.readLine()) != null){
                String[] readLine = line.split(";");
                //double e3 = (double)readLine[2];
                product[i] = new Product(readLine[0], readLine[1],  Double.parseDouble(readLine[2]));
                i++;
            }
        } catch (
                IOException e) {
            System.out.println("nie znaleziono pliku");
        }

        for (Product prod: product) {
            System.out.println(prod.toString());
        }

    }

}
