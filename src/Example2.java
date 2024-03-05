import java.util.Scanner;

class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            double z = scan.nextDouble();
            System.out.printf("%.2f %.2f\n", average(a, b), average(a, b, c));
            System.out.printf("%.2f %.2f\n", average(x, y),average(x, y, z));
        }


    static double average(double a, double b) {
        double result = (a + b) / 2;
        return result;
    }

    static double average(double x, double y, double z) {
        double result = (x + y + z) / 3;
        return result;
    }


}


/*    static void printTriangle(int width, char sim){
        int widthNew = (int) Math.ceil(width / 2.0);
        if (width %2 != 0){
            for (int i = 1; i <= widthNew; i++) {
                for (int j = 1; j < widthNew+i; j++) {
                    if (j <= widthNew-i) {
                        System.out.print(" ");
                    }else {
                        System.out.print(sim);
                    }
                }
                System.out.println();
            }
        } else
        {
            for (int i = 1; i <= widthNew; i++) {
                for (int j = 1; j <= widthNew+i; j++) {
                    if (j <= widthNew-i) {
                        System.out.print(" ");
                    }else {
                        System.out.print(sim);
                    }
                }
                System.out.println();
            }
        }

    }

}
/*
    static int maxNumberDivider (int a, int b) {
        int kolDiv = 0;
        int max = 0;
        int maxNum = 0;
        for (int i = a; i <=b ; i++) {
            kolDiv = colDivider(i);
            if (kolDiv > max) {
                max = kolDiv;
                maxNum = i;
            }
        }
        return maxNum;
    }

    static int colDivider(int number){
        int kol =0;
        for (int i = 1; i <= number ; i++) {
            if(number % i == 0) {
                kol ++;
            }
        }
        return kol;
    }

 }


*/