package employees;

public class Main {
    public static void main(String[] args) {
        Employee array1 [] = new Employee[7];
        array1[0] = new Worker("Sukjov",100,50);
        array1[1] = new Worker("Petrov",100,50);
        array1[2] = new Worker("Sidorov",10,50);
        array1[3] = new Worker("Mashenkou",100,50);
        array1[4] = new Director("Dumm",100,50,1000);
        array1[5]= new Manager("Syrov",3434,22,34);
        array1[6]= new Manager("Pibds",500,222,2234);

        Manager array2 [] = new Manager[2];
        array2[0]= new Manager("Syrov",3434,22,34);
        array2[1]= new Manager("Pibds",500,222,234);


        Employee dum = Utilities.employeeSearchPartially(array1,"ov");
        double finalBudget = Utilities.budgetSalary(array1);
        System.out.println(finalBudget);
        System.out.println(dum.getName() + " "+ dum.getSalary());
        System.out.println(Utilities.minSalary(array1));

        System.out.println(Utilities.maxSalary(array1));

        System.out.println(Utilities.minSubordinates(array2));

        Utilities emplUtil  = new Utilities();


    }


}
