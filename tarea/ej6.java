// ej6

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad < 0) {
            System.out.println("Edad no válida.");
        } else if (edad <= 12) {
            System.out.println("Eres un niño.");
        } else if (edad <= 17) {
            System.out.println("Eres un adolescente.");
        } else if (edad <= 64) {
            System.out.println("Eres un adulto.");
        } else {
            System.out.println("Eres un anciano.");
        }

        sc.close();
    }
}