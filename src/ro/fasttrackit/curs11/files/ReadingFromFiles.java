package ro.fasttrackit.curs11.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.Scanner;

public class ReadingFromFiles {
    public static void main(String[] args) throws Exception {
        readOneLine();
        readFullFile();
        readFileBuffered();
    } //daca folosesti o met ce arunca exceptii, ori o arunci mai departe, ori o tratezi

    private static void readFileBuffered() throws Exception {
        System.out.println(("Buffered read: ")); //asta folosim mai des
        BufferedReader fileReader = new BufferedReader(new FileReader("content.txt"));

        String line; //citeste linia, verifica daca e diferita de null, daca e scrie si trece la urm linie
        while((line=fileReader.readLine()) != null) { //si atribuire si comparare 2 in 1
            System.out.println(line);
        }
    }

    private static void readFullFile() throws Exception {
        Scanner fileScanner = new Scanner(new File("content.txt"));

        while(fileScanner.hasNext()) { //scanner-ul implementeaza iterator
            System.out.println(fileScanner.next());
        }
    }

    private static void readOneLine() throws Exception {
        //citesc dintr-un fisier, nu de la consola
        Scanner fileScanner = new Scanner(new File("content.txt"));
        String line = fileScanner.nextLine();
        System.out.println(line);
    }
}
