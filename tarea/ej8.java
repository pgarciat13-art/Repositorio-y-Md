// ej8

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            long factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + n + " es: " + factorial);
        }

        sc.close();
    }
}