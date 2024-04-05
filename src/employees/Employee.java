package employees;

public abstract class Employee {
   private String name;
   private double salary;
   private double baseSalary;

    public Employee(String name, double salary, double baseSalary) {
        this.name = name;
        this.salary = salary;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public abstract double getSalary();

    public final double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
