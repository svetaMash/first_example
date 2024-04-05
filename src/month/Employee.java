package month;

public class Employee {
    private String name;
    private int age;
    private char sex;
    private double salaryInDay;

    public Employee(String name, int age, char sex, double salaryInDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryInDay = salaryInDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSalaryInDay() {
        return salaryInDay;
    }

    public void setSalaryInDay(double salaryInDay) {
        this.salaryInDay = salaryInDay;
    }

    public double getSalary(Month[] monthArray){
        double totalAmount = 0;
        for (int i = 0; i < monthArray.length; i++) {
            totalAmount+=getSalaryInDay()* monthArray[i].getWorkDays();
        }
        return totalAmount;
    }

}
