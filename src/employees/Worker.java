package employees;

public class Worker extends Employee{
    public Worker(String name, double salary, double baseSalary) {
        super(name, salary, baseSalary);
    }

    @Override
     public double getSalary (){
        return getBaseSalary();
    }

}
