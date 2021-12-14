package ro.fasttrackit.curs11.files;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WritingFiles {
    public static void main(String[] args) throws Exception {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("content.txt"))){
            writer.write("This is my first output file");


        }

        //[This is my first output file..........] 8000 octeti
        //Nu scrie pe disc pana ce nu e totul plin
        //pe close face flush buffer (chiar daca am 2 octeti, ii scriu)
    }
}
