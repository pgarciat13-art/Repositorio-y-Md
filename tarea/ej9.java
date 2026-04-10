// ej9

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int positivos = 0;
        int negativos = 0;

        do {
            System.out.print("Introduce un número (0 para terminar): ");
            numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }

        } while (numero != 0);

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);

        sc.close();
    }
}