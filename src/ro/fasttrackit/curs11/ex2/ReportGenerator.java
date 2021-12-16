package ro.fasttrackit.curs11.ex2;

import ro.fasttrackit.curs11.ex1.Classroom;
import ro.fasttrackit.curs11.ex1.StudentGrade;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ReportGenerator {
    private final Classroom classroom;


    public ReportGenerator(List<StudentGrade> studList) {
        classroom = new Classroom(studList);
    }

    public void generateReport(List<StudentGrade> students) throws Exception {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("dir1/dir2/grade-reports.out"))) {
            StudentGrade studNotaMax = classroom.getMaxGrade();
            StudentGrade studNotaMin = classroom.getWorstGrade();
            writer.write(studNotaMax.getName() + " " + studNotaMax.getGrade());
            writer.newLine();
            writer.write(String.valueOf(classroom.getAverageGrade()));
            writer.newLine();
            writer.write(studNotaMin.getName() + " " + studNotaMin.getGrade());
        }
    }
}
