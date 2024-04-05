package employees;

public class Director extends Employee {
    final private int INDEX = 9;
    private int quantityOfSubordinates;

    public int getQuantityOfSubordinates() {
        return quantityOfSubordinates;
    }

    public Director(String name, double salary, double baseSalary, int quantityOfSubordinates) {
        super(name, salary, baseSalary);
        this.quantityOfSubordinates = quantityOfSubordinates;
    }

    @Override
    public double getSalary() {
        double salary = 0;
        if (this.getQuantityOfSubordinates() > 0) {
            salary = getBaseSalary() * (this.getQuantityOfSubordinates() / 100 * INDEX);
        } else
            salary = getSalary();
        return salary;
    }
}