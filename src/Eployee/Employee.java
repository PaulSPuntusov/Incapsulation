package Eployee;

 class Employee {
     protected String name;
     protected Department dep;

    public Employee(String name, Department dep) {
        this.name = name;
        this.dep = dep;
    }

    public Employee(String name) {
        this(name, null);
    }

    @Override
    public String toString() {
        if (dep.boss == this) {
            return "Начальник " + name + " руководит отделом " + dep.depName;
        } else
            return "Сотрудник " +
                    "Имя: '" + name + '\'' +
                    ", Работает в отделе " + dep.depName + " Начальник отдела: " +
                    dep.boss.name;
    }
}
