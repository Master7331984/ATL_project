package Corporation;

public class Director extends Manager {
    public double bonus;

    public Director(int no, String name, String department, double bonus) {
        super(no, name, department);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public int calculateSalary(int year) {
        return super.calculateSalary(year);
    }
}
