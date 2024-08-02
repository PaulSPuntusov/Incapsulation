public class Department {
    private String depName;
    private String bossName;
    private Employee boss;

    private Department(String depName,String bossName) {
        this.depName = depName;
        this.bossName = bossName;
        Employee boss = Employee.setEmployee(bossName,this);
        this.boss = boss;
    }

    public String getDepName() {
        return depName;
    }
    public static Department setDep(String depName,String bossName){

        return new Department(depName,bossName);
    }



    public Employee getBoss() {
        return boss;
    }


}
