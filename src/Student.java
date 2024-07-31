import java.util.Arrays;

public class Student {
    String name;
    private int[] grades = null;

    private Student( int[] grades) {
        gradesCheck(grades);
        this.grades = grades;
    }

    private Student(String name) {
        this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void gradesCheck(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (6 < grades[i] || grades[i] < 1) {
                throw new IllegalArgumentException("Оценки должны быть в диапазоне 2-5");
            }
        }
    }

    public void gradeCheck(int grade) {
        if (6 < grade || grade < 1) {
            throw new IllegalArgumentException("Оценки должны быть в диапазоне 2-5");
        }
    }

    public void setGrade(int grade) {
        gradeCheck(grade);
        this.grades = Arrays.copyOf(this.grades,this.grades.length+1);
        grades[grades.length-1] = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
