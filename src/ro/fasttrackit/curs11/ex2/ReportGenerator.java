package ro.fasttrackit.curs11.ex2;

import ro.fasttrackit.curs11.ex1.Classroom;
import ro.fasttrackit.curs11.ex1.StudentGrade;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ReportGenerator {
    private final Classroom classroom;
    private final String filePath;


    public ReportGenerator(List<StudentGrade> studList, String filePath) {
        classroom = new Classroom(studList);
        this.filePath = filePath;
    }

    public void generateReport() throws Exception {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            StudentGrade studNotaMax = classroom.getMaxGrade();
            StudentGrade studNotaMin = classroom.getWorstGrade();
            writer.write("Student " + studNotaMax.getName() + " has the biggest grade: " + studNotaMax.getGrade());
            writer.newLine();
            writer.write(String.valueOf("The average grade is: " + classroom.getAverageGrade()));
            writer.newLine();
            writer.write("Student " + studNotaMin.getName() + " has the smallest grade: " + studNotaMin.getGrade());
        }
    }
}
