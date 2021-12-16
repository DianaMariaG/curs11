package ro.fasttrackit.curs11.ex1;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private final List<StudentGrade> studGradeList;

    public Classroom (List<StudentGrade> studGradeList) {
        this.studGradeList = new ArrayList<>(studGradeList);
    }

    public List<Integer> getGradesForDiscipline (String discipline) {
        List<Integer> listOfGrades = new ArrayList<>();
        if(discipline != null) {
            for (StudentGrade element : studGradeList) {
                if (element.getDiscipline().equalsIgnoreCase(discipline)) {
                    listOfGrades.add(element.getGrade());
                }
            }
        }
        return listOfGrades;
    }
    public List<Integer> getGradesForStudents (String student) {
        List<Integer> result = new ArrayList<>();
        if (student != null) {
            for (StudentGrade element : studGradeList) {
                if (element.getName().equalsIgnoreCase(student)) {
                    result.add(element.getGrade());
                }
            }
        }
        return result;
    }
    public StudentGrade getMaxGrade (String discipline) {
        int maxGrade = 0;
        StudentGrade student = null;
        for (StudentGrade element : studGradeList) {
            if ((element.getDiscipline().equalsIgnoreCase(discipline) || discipline== null) && maxGrade < element.getGrade()) {
                maxGrade = element.getGrade();
                student = element;
            }
        }
        return student;
    }

    public StudentGrade getMaxGrade() {
        return getMaxGrade(null);
    }

    public Integer getAverageGrade (String discipline) { //overload...+ if lung
        int count = 0;
        int sum = 0;
        for (StudentGrade element : studGradeList) {
            if (element.getDiscipline().equalsIgnoreCase(discipline) || discipline == null) {
                count++;
                sum = sum + element.getGrade();
            }
        }

        return sum/count;
    }

    public Integer getAverageGrade() {
        return getAverageGrade(null);
    }

    public StudentGrade getWorstGrade (String discipline) {
        int minGrade = Integer.MAX_VALUE;
        StudentGrade student = null;
        for (StudentGrade element : studGradeList) {
            if ((element.getDiscipline().equalsIgnoreCase(discipline) || discipline == null) && minGrade > element.getGrade()) {
                minGrade = element.getGrade();
                student = element;
            }
        }
        return student;
    }
    public StudentGrade getWorstGrade() {
        return getWorstGrade(null);
    }
}
