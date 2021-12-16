package ro.fasttrackit.curs11.ex1;

import ro.fasttrackit.curs11.ex2.ReportGenerator;

import java.util.List;

public class MainEx1 {
    public static void main(String[] args) throws Exception {
        StudentFileReader reader = new StudentFileReader("dir1/dir2/grades.txt");
        List<StudentGrade> studentGrades = reader.getStudentList();
        Classroom classroom = new Classroom(studentGrades);

        System.out.println(classroom.getMaxGrade("Computer science"));
        System.out.println(classroom.getMaxGrade());

        System.out.println(classroom.getAverageGrade("Physics"));
        System.out.println(classroom.getAverageGrade());

        System.out.println(classroom.getGradesForDiscipline("mathematics"));
        System.out.println(classroom.getGradesForStudents("Asim Jeltje"));

        System.out.println(classroom.getWorstGrade("Mathematics"));
        System.out.println(classroom.getWorstGrade());

        ReportGenerator report = new ReportGenerator(studentGrades);
        report.generateReport(studentGrades);
    }
}
