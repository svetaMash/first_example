package employees;

public final class Manager extends Employee{
    final private int INDEX = 3;
    private int quantityOfSubordinates;

    public Manager(String name, double salary, double baseSalary, int quantityOfSubordinates) {
        super(name, salary, baseSalary);
        this.quantityOfSubordinates = quantityOfSubordinates;
    }

    public int getQuantityOfSubordinates() {
        return quantityOfSubordinates;
    }

    public void setQuantityOfSubordinates(int quantityOfSubordinates) {
        this.quantityOfSubordinates = quantityOfSubordinates;
    }
    @Override
    public double getSalary() {
        double salary = 0;
        if (this.quantityOfSubordinates > 0) {
            salary = getBaseSalary() * (this.quantityOfSubordinates/100*INDEX);
        } else

            salary = getBaseSalary();
        return salary;
    }
}
