package Array_java;

import java.util.Scanner;

public class change_temperature {
    public static double cToF(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double ftoC(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit, celsius;
        int choice;

        do {
            System.out.println("men u");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. exit");
            System.out.println("enter choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1 :
                    System.out.println("enter F:  ");
                    fahrenheit = sc.nextDouble();
                    System.out.println(" F to C = " + ftoC(fahrenheit));
                    break;
                case 2 :
                    System.out.println(" enter C: ");
                    celsius = sc.nextDouble();
                    System.out.println(" C to F = " + cToF(celsius));
                    break;
                case 0 :
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
