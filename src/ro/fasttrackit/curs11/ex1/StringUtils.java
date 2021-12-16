package ro.fasttrackit.curs11.ex1;

public class StringUtils {
    public static String ensureNotEmpty(String word) {
        return word == null || "".equals(word.trim()) ? "n/a" : word;
    }

    public static int validGrade(int grade) {
        return grade >=1 && grade <=10 ? grade : 1;
    }
}
