package Java_Multidimensional_Arrays_Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Zad01_ReadSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());

        String[] names = new String[lenght];
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }

        Arrays.sort(names);
//        Arrays.sort(names, Collections.reverseOrder());
//        за обратно сортиране
//        + import java.util.Collections;

        for (String name : names) {
            System.out.println(name);
        }
    }
}
