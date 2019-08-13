package Teoria2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("d:\\test.txt")) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("slowo");
            bw.write(24);
            bw.newLine();
            bw.write('a');
            bw.close();
        }catch (IOException e ){
            e.printStackTrace();
        }

    }
}
