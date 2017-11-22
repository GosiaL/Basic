import java.util.Random;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Basic basic = new Basic();
//        basic.sum();
//        basic.sumWithRandom();
//        basic.changeWithoutAuxilaryVar();
//        basic.priority();


    }

    public void sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int a = scanner.nextInt();
        System.out.print("Podaj kolejną liczbę całkowitą: ");
        int b = scanner.nextInt();

        System.out.println("Suma Twoich liczb to: " + (a+b));
    }

    public void sumWithRandom() {
        Random random = new Random();
        int a = random.nextInt(101);
        System.out.println("Pierwsza liczba to: " + a);
        int b = random.nextInt(101);
        System.out.println("Druga liczba to: " + b);

        System.out.println("Suma liczb to: " + (a + b));

    }

    public void changeWithoutAuxilaryVar() {
        int a = 7;
        int b = -2;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.print(b);
    }

    public void priority(){
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą max trzycyfrową liczbę całkowitą: ");
        a = scanner.nextInt();
        System.out.print("Podaj drugą max trzycyfrową liczbę całkowitą: ");
        b = scanner.nextInt();
        System.out.print("Podaj trzecią max trzycyfrową liczbę całkowitą: ");
        c = scanner.nextInt();
        scanner.close();

        System.out.println("=======================");
        System.out.printf("%6s\t%6s\t%6s\n","a", "b", "c");
        System.out.println("-----------------------");
        a = b = c *1 + 2;
        System.out.printf("%6d\t%6d\t%6d\n", a, b, c);
        a = b = c *(1 + 2);
        System.out.printf("%6d\t%6d\t%6d\n", a, b, c);
        a = b++;
        System.out.printf("%6d\t%6d\t%6d\n", a, b, c);
        c = --b;
        System.out.printf("%6d\t%6d\t%6d\n", a, b, c);
        a++; b++; c++;
        System.out.printf("%6d\t%6d\t%6d\n", a, b, c);
        a = b++ * ++c;
        System.out.printf("%6d\t%6d\t%6d%n", a, b, c);
        System.out.println("=======================");

    }

}
