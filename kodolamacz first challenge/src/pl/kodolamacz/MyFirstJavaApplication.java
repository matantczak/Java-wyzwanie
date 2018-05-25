package pl.kodolamacz;

import java.util.Scanner;

public class MyFirstJavaApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x;
        String y;
        double z;

        do {
            System.out.println("Proszę podaj w oddzielnych linijkach jakąś liczbę, operację matematyczną +,-,*,/,%");

            x = scanner.nextDouble();
            y = scanner.next();
            z = scanner.nextDouble();

            if ("+".equals(y)) {
                System.out.println(x + z);
            }
            if ("-".equals(y)) {
                System.out.println(x - z);
            }
            if ("*".equals(y)) {
                System.out.println(x * z);
            }
            if ("/".equals(y)) {
                System.out.println(x / z);
            }
            if ("%".equals(y)) {
                System.out.println(x % z);
            }
            System.out.println("Chcesz wykonać kolejne działanie? Wpisz literę t lub n.");
            scanner.nextLine() ;

        } while ("t".equals(scanner.nextLine())) ;
    }

}
