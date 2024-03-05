package Package1;
import java.util.*;
import java.lang.Character;

public class Stringi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder strB = new StringBuilder();
        String strInteger = new String();

        //String[] words = str.split(" +"); //разделение на слова
        char[] result = str.toCharArray();
        int sum = 0;
        int sum1 = 3;


        for (int i = 0; i < result.length; i++) {
            int symbol = (Character.getNumericValue(result[i]));
            if (symbol >= 0 && symbol <= 9) {
                strInteger = Integer.toString(symbol);
                sum =sum + symbol;
                strB.append(strInteger).append("+");
            }
        }
        if (!strB.isEmpty()) {
            strB.replace(strB.length() - 1, strB.length(), "=");
            System.out.print(strB);
            System.out.println(sum);
        }else
            System.out.println("ERROR");

    }
}

