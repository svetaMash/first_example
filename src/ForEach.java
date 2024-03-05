import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class ForEach { //work with String
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();
        System.out.println();

        String [] mas1 = new String []{str1, str2, str3};

        Arrays.sort(mas1);

        for (int i = 0; i < mas1.length ; i++) {
            System.out.println(mas1[i]);
        }

    }

}

