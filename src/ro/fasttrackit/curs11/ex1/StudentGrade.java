package ro.fasttrackit.curs11.ex1;

import java.util.Objects;

public class StudentGrade {
    private final String name;
    private final String discipline;
    private final int grade;

    public StudentGrade(String name, String discipline, int grade) {
        this.name = StringUtils.ensureNotEmpty(name);
        this.discipline = StringUtils.ensureNotEmpty(discipline);
        this.grade = StringUtils.validGrade(grade);
    }

    public String getName() {
        return this.name;
    }
    public String getDiscipline() {
        return this.discipline;
    }
    public int getGrade() {
        return this.grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGrade that = (StudentGrade) o;
        return grade == that.grade && Objects.equals(name, that.name) && Objects.equals(discipline, that.discipline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, discipline, grade);
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "name='" + name + '\'' +
                ", discipline='" + discipline + '\'' +
                ", grade=" + grade +
                '}';
    }
}
