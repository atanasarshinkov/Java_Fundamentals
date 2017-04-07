package Java_Syntax_Lab;

public class Zad08_Lottery {
    public static void main(String[] args) {

        long br = 0;
        for (int n1 = 1; n1 <= 49; n1++) {
            for (int n2 = 1; n2 <= 49; n2++) {
                for (int n3 = 1; n3 <= 49; n3++) {
                    for (int n4 = 1; n4 <= 49; n4++) {
                        for (int n5 = 1; n5 <= 49; n5++) {
                            for (int n6 = 1; n6 <= 49; n6++) {
                                System.out.printf("%s %s %s %s %s%n", n1, n2, n3, n4, n5, n6);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Броят на възможните комбинации е: " + br);
    }
}
