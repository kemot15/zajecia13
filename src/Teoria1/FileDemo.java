package Teoria1;

import java.io.*;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {

//        if(!file.exists()){
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//        }
        //czytanie pliku
        File file = new File("text.txt");
        try {       //try with resources mozna dodac do automatycznego zamykania buffereader itd
            FileReader fr = new FileReader(file);
            String line = null;
            BufferedReader bufferedReader = new BufferedReader(fr);
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);

            }
        } catch (IOException e) {
            System.out.println("nie znaleziono pliku");
        }
//        try (Scanner input = new Scanner(file);){
//
//
//            System.out.println(input.nextInt());
//            if (input.hasNextLine()) {
//                System.out.println(input.nextInt());
//                System.out.println(input.nextInt());
//            }
//            System.out.println(input.nextLine());
//            System.out.println(input.nextLine());
//
//        } catch (FileNotFoundException e) {
//            System.out.println("nie odnaleziono pliku");
//        }

    }
}
