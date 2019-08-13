package Zad2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProductTest {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Banan", "Tesco", 3.4);
        products[1] = new Product("laptop", "toshiba", 3455);
        products[2] = new Product("rower", "romet", 1500);

        try (FileWriter fw = new FileWriter("d:\\test.csv")) {
            BufferedWriter bw = new BufferedWriter(fw);
            for (Product prod: products) {
                bw.write(prod.getName()+";"+prod.getProducer()+";"+prod.getPrice()+"\n");
            }
            bw.close();
        }catch (IOException e ){
            e.printStackTrace();
        }




    }
}
