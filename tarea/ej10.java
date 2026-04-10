// ej10

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MENÚ DE SECCIONES");
        System.out.println("1. Sección 1");
        System.out.println("2. Sección 2");
        System.out.println("3. Sección 3");
        System.out.print("Elige una opción: ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Bienvenido a la Sección 1");
                break;
            case 2:
                System.out.println("Bienvenido a la Sección 2");
                break;
            case 3:
                System.out.println("Bienvenido a la Sección 3");
                break;
            default:
                System.out.println("Opción no válida.");
        }

        sc.close();
    }
}