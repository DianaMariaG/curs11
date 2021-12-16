package ro.fasttrackit.curs11.ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StudentFileReader {
    private final String filePath;

    public StudentFileReader(String filePath) {
        this.filePath = filePath;
    }

    public List<StudentGrade> getStudentList() throws Exception {

        List<StudentGrade> result = new ArrayList<>();
        try(BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                result.add(readLine(line));
            }
        }
        return result;
    }

    private static StudentGrade readLine(String line) {
        String[] tokens = line.split(Pattern.quote("|"));
        return new StudentGrade(tokens[0],tokens[1],Integer.parseInt(tokens[2]));
    }
}
