package employees;

public  class Utilities {


    public static Employee employeeSearch(Employee[] arrayOfEmployees, String name) {
        for (int i = 0; i < arrayOfEmployees.length; i++) {
            if (arrayOfEmployees[i].getName().equals(name)) {
                return arrayOfEmployees[i];
            }
        }
        System.out.println("Employee isn't identified");
        return null;
    }

    public static Employee employeeSearchPartially(Employee[] arrayOfEmployees, String namePart) {
        for (int i = 0; i < arrayOfEmployees.length; i++) {
            if (arrayOfEmployees[i].getName().contains(namePart)) {
                return arrayOfEmployees[i];
            }
        }
        System.out.println("Employee isn't identified");
        return null;
    }

    public static double budgetSalary (Employee[] arrayOfEmployees){
        double finalBudget = 0;
        for (int i = 0; i < arrayOfEmployees.length; i++) {
            finalBudget+= arrayOfEmployees[i].getSalary();
        }
        return finalBudget;
    }

    public static double minSalary (Employee[] arrayOfEmployees){
        double min = arrayOfEmployees[0].getSalary();
        for (int i = 1; i < arrayOfEmployees.length; i++) {
            if (min > arrayOfEmployees[i].getSalary()) {
                min = arrayOfEmployees[i].getSalary();
            }
        }
        return min;
    }
    public static double maxSalary (Employee[] arrayOfEmployees){
        double max = arrayOfEmployees[0].getSalary();
        for (int i = 1; i < arrayOfEmployees.length; i++) {
            if (max < arrayOfEmployees[i].getSalary()) {
                max = arrayOfEmployees[i].getSalary();
            }
        }
        return max;
    }

    public static int minSubordinates (Manager[] arrayOfEmployees){
        int min =arrayOfEmployees[0].getQuantityOfSubordinates();
        for (int i = 1; i < arrayOfEmployees.length; i++) {
            if (arrayOfEmployees[i].getQuantityOfSubordinates() < min) {
                min = arrayOfEmployees[i].getQuantityOfSubordinates();
            }
        }
        return min;
    }
}