public class Employee {
    private String name;
    private Department dep;

    public Employee(String name, Department dep) {
        this.name = name;
        this.dep = dep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
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
