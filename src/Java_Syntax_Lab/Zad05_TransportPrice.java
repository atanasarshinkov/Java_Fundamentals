package Java_Syntax_Lab;

import java.util.Scanner;

public class Zad05_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        double priceToPay = 0.00;

        if (n < 20) {
            switch (timeOfDay) {
                case "day":
                    priceToPay = 0.70 + 0.79 * n;
                    break;
                case "night":
                    priceToPay = 0.70 + 0.90 * n;
                    break;
                default:
                    break;
            }
        } else if (20 <= n && n < 100) {
            priceToPay = 0.09 * n;
        } else {
            priceToPay = 0.06 * n;
        }

        System.out.printf("%.2f", priceToPay);
    }
}
