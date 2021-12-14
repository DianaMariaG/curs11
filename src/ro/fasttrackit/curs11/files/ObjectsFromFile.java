package ro.fasttrackit.curs11.files;

import ro.fasttrackit.curs11.homework.Person;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ObjectsFromFile {
    public static void main(String[] args) throws Exception {
        List<Person> persons = readPersons("dir1/dir2/file.txt"); //path relativ la proiectul curs11
        //path-ul absolut incepe de la root /Users/dianagheorghe/Documents/curs11
        System.out.println(persons);
        writeReport(persons);
    }
    private static void writeReport(List<Person> persons) throws Exception {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("report.data"))) {
            for (Person person : persons) {
                writer.write(persontoLine(person));
                writer.newLine();
            }
        }
    }

    private static String persontoLine(Person person) {
        return person.getName() + " " + person.getAge() + " " + person.getPosition();
    }
    private static List<Person> readPersons (String filePath) throws Exception { //filePath e locatia fisierului (un String)
        List<Person> result = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line=reader.readLine()) != null) {
                //Ana|33|contabil
                result.add(readPersonFrontLine(line));
            }
        }
        return result;
    }
    private static Person readPersonFrontLine(String line) {
        String[] tokens = line.split(Pattern.quote("|")); //token = a despartit linia dupa separatorul |
        return new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
    }
}
