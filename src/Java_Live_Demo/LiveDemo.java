package Java_Live_Demo;

class MyClass {
    int number;
    char symbol;

    void set(int n) {
        number = n;
    }

    void set(char s) {
        symbol = s;
    }

    void set(int n, char s) {
        set(n);
        set(s);
    }

    void set() {
        set(0, 'Z');
    }

    void show() {
        System.out.printf("Стойности на полетата %d и %s%n", number, symbol);
    }

    void show(String txt) {
        System.out.println(txt + ": стойности на полетата " + number + " и " + symbol);
    }

    void show(String txt1, String txt2) {
        System.out.printf("%s: %d%n", txt1, number);
        System.out.printf("%s: %s%n", txt1, symbol);
    }
}

public class LiveDemo {
    public static void main(String[] args) {
        MyClass objA, objB;
        objA = new MyClass();
        objB = new MyClass();
        objA.set(100);
        objA.set('А');
        System.out.println("Обект objA:");
        objA.show();

        objB.set();
        objB.show("Обект objB");
        objB.set(200, 'B');
        System.out.println("Обект objB след изменението:");
        objB.show("Число", "Символ");

    }
}
