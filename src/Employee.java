public class Employee {
    private String name;
    private Department dep;

    private Employee(String name, Department dep) {
        this.name = name;
        this.dep = dep;
    }


    public static Employee setEmployee(String name, Department dep){
        return new Employee(name,dep);
    }

    @Override
    public String toString() {
        if (dep.getBoss() == this) {
            return "Начальник " + name + " руководит отделом " + dep.getDepName();
        } else
            return "Сотрудник" +
                    "Имя: '" + name + '\'' +
                    ", Работает в отделе " + dep.getDepName() + " Начальник отдела: " +
                    dep.getBoss().name;
    }
}
