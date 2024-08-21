package Eployee;

import Eployee.Department;
import Eployee.Employee;

public class Main {
    public static void main(String[] args) {
        Employee it1 = new Employee("Vasya");
        Department it = new Department("IT",it1);
        it1.dep = it;
        Employee it2 = new Employee("Kolya",it);
        Department sales = new Department("Sales");
        Employee s1 = new Employee("Sasha",sales);
        Employee s2 = new Employee("Zhenya",sales);
        sales.boss = s1;
        System.out.println(it1.toString());
        System.out.println(it2.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        it.boss = it2;
        System.out.println(it1.toString());
        System.out.println(it2.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        it.boss = s2;
        Department construction = new Department("Construction",s2);
        System.out.println(it1.toString());
        System.out.println(it2.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}