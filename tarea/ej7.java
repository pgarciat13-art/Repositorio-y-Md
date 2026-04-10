// ej7

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una nota (0-10): ");
        int nota = sc.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida.");
        } else if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota < 7) {
            System.out.println("Aprobado");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }

        sc.close();
    }
}