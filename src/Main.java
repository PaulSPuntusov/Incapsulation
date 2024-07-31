public class Main {
    public static void main(String[] args) {
        int[] grades = {5,5,5};
        Student st1 = new Student("Petya",grades);
        st1.setGrade(5);
        st1.setGrade(5);
        System.out.println(st1.toString());
        Student st2 = new Student("Vasya");
        System.out.println(st2.toString());

    }
}