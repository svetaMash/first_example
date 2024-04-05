package month;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivanov",23,'m', 1);
        Manager man1 = new Manager("Petrov",29,'w',1,10);

        System.out.println(emp1.getSalary(MonthUtil.monthes));
        System.out.println(man1.getSalary(MonthUtil.monthes));

    }
}
