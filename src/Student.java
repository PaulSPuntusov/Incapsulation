import java.util.Arrays;

public class Student {
    String name;
    private int[] grades = {0};
    public Student(String name){
        this.name = name;
    }

    public Student(String name, int... grades) {
        this.name = name;
        gradesCheck(grades);
        if(this.grades[0]==0) {
            this.grades = grades;
        } else
        {
            int oldGradesLength = this.grades.length;
            this.grades = Arrays.copyOf(this.grades, this.grades.length + grades.length);
            for(int i= oldGradesLength; i<this.grades.length;i++){
                this.grades[i] = grades[i-oldGradesLength];
            }
        }
    }




    public void gradesCheck(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (6 < grades[i] || grades[i] < 1) {
                throw new IllegalArgumentException("Оценки должны быть в диапазоне 2-5");
            }
        }
    }

    public int[] getGrades() {
        return Arrays.copyOf(grades,grades.length);
    }

    public void gradeCheck(int grade) {
        if (6 < grade || grade < 1) {
            throw new IllegalArgumentException("Оценки должны быть в диапазоне 2-5");
        }
    }

    public void setGrade(int grade) {
        gradeCheck(grade);
        if (grades[0] == 0) {
            grades[0] = grade;
        } else {
            this.grades = Arrays.copyOf(this.grades, this.grades.length + 1);
            grades[grades.length - 1] = grade;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "Имя='" + name + "'/" +
                " оценки " + Arrays.toString(grades) +
                '}';
    }
}
