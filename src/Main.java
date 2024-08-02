import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Department it = Department.setDep("IT", "Vasya");
        Employee e1 = Employee.setEmployee("Petya",it);
        System.out.println(e1.toString());
        System.out.println(it.getBoss().toString());

    }
}