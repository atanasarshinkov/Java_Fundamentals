package Java_Syntax_Lab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Zad07_ProductOfNumbersN_M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int index = n;
        BigInteger prod = new BigInteger("1");

        do {
            prod = prod.multiply(new BigInteger(String.valueOf(index)));
            index++;
        } while(index <= m);

        System.out.printf("product[%s..%s] = %s", n, m, prod);
    }
}
