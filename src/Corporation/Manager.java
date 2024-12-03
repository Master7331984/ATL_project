package Corporation;

public class Manager extends Employee {
    public String departmentManage;
    public static final int managementPay = 5000;

    public Manager(int no, String name, String department) {
        super(no, name, department);
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public int calculateSalary(int year) {
        return super.calculateSalary(year)+ managementPay;
    }
}



