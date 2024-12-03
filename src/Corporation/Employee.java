package Corporation;

public class Employee {
    public int no;
    public String name;
    public static int year=12;
    public String department;
    public static final int baseSalary =500;

    public Employee(int no, String name, String department) {
        this.no = no;
        this.name = name;
        this.department = department;
    }

    public void work(){
       System.out.println("İşçinin adı " + name + " Departamenti" + department + " Maaş " + baseSalary);
   }
   public int calculateSalary(int year){
        return year*baseSalary;
   }
}

