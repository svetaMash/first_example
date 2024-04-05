package month;

public class Manager extends Employee{
    private  int amountOfSubbordinates;

    public Manager(String name, int age, char sex, double salaryInDay, int amountOfSubbordinates) {
        super(name, age, sex, salaryInDay);
        this.amountOfSubbordinates = amountOfSubbordinates;
    }

    public int getAmountOfSubbordinates() {
        return amountOfSubbordinates;
    }

    public void setAmountOfSubbordinates(int amountOfSubbordinates) {
        this.amountOfSubbordinates = amountOfSubbordinates;
    }

    @Override
    public double getSalary(Month[] monthArray){
        double totalAmount = 0;
        for (int i = 0; i < monthArray.length; i++) {
            totalAmount+=(getSalaryInDay()* monthArray[i].getWorkDays()) + (getSalaryInDay()* monthArray[i].getWorkDays()*0.01* getAmountOfSubbordinates());
        }
        return totalAmount;
    }
}
