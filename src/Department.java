public class Department {
    private String depName;
    private Employee boss;

    public Department(String depName, Employee boss) {
        this.depName = depName;
        this.boss = boss;
    }

    public Department(String depName) {
        this(depName, null);
    }

    public Employee getBoss() {
        return boss;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public void bossDepCheck(Employee boss) {
        if (boss.getDep() != this) {
            boss.setDep(this);
        }
    }

    public void setBoss(Employee boss) {
        bossDepCheck(boss);
        this.boss = boss;
    }
}
