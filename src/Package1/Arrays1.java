package Package1;
import java.util.Random;
import java.util.Scanner;

    public class Arrays1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        int ind = scan.nextInt();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        mas = deleteRow(mas, ind);
        printArray(mas);
    }
    public static void initArray(int[][] mas1, long seed) {
        Random rand = new Random(seed);
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1[i].length; j++) {
                mas1[i][j] = rand.nextInt(0, 11);
            }
        }
    }

    public static void printArray(int[][] mas1) {
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1[i].length; j++) {
                System.out.print(mas1[i][j] + "\t");
            }
            System.out.println();
        }

    }

        public static int[][] deleteRow(int[][] mas7, int ind){

            if (ind <= mas7.length) {
                int[][] b = new int[mas7.length-1][mas7[0].length];
                for (int i = 0; i < b.length; i++) {
                    for (int j = 0; j < b[i].length; j++) {
                        if (i >= ind) {
                            b[i][j] = mas7[i+1][j];
                        }else {
                            b[i][j] = mas7[i][j];
                        }
                    }
                }
                return b;
            } else {
                int[][] b = new int[mas7.length][mas7[0].length];
                for (int i = 0; i < b.length; i++) {
                    for (int j = 0; j < b[i].length; j++) {
                        if (i >= ind) {
                            b[i][j] = mas7[i+1][j];
                        }else {
                            b[i][j] = mas7[i][j];
                        }
                    }
                }
                return b;
            }

        }


}