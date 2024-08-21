package Eployee;

class Department {
     protected String depName;
     protected Employee boss;

    public Department(String depName, Employee boss) {
        this.depName = depName;
        if ((boss != null) && (boss.dep != this)) {
            bossDepCheck(boss);
        }
        this.boss = boss;
    }

    public Department(String depName) {
        this(depName, null);
    }


    public void bossDepCheck(Employee boss) {
        if (boss.dep != this) {
            boss.dep = this;
        }
    }
}
