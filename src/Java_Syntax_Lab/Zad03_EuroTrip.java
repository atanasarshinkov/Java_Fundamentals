package Java_Syntax_Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class Zad03_EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quant = scanner.nextDouble();
        BigDecimal exchangeRt = new BigDecimal("4210500000000");
        BigDecimal priceBGN = new BigDecimal(quant * 1.20);
        BigDecimal priceDM = exchangeRt.multiply(priceBGN);

        System.out.printf("%.2f marks", priceDM);

    }
}
