import java.util.Scanner;
import java.util.Arrays; // Necesario para usar el método de ordenación

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Pedir el tamaño al usuario
        System.out.print("¿Cuántos números quieres introducir? ");
        int cantidad = sc.nextInt();

        // 2. Crear el array dinámico
        int[] numeros = new int[cantidad];

        // 3. Llenar el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // --- ORDENACIÓN ---
        // Este método ordena el array de menor a mayor automáticamente
        Arrays.sort(numeros);

        // 4. Cálculos (Suma, Mayor y Menor)
        int suma = 0;
        // Después de ordenar, el menor es siempre el primero [0]
        // y el mayor es siempre el último [length - 1]
        int menor = numeros[0];
        int mayor = numeros[numeros.length - 1];

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // 5. Resultados
        double media = (double) suma / cantidad;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Números ordenados (menor a mayor): " + Arrays.toString(numeros));
        System.out.println("Suma total: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);

        sc.close();
    }
}