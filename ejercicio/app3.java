import java.util.Arrays;

public class app3 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int suma = 0;

        // 1. Generar los números y sumarlos
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
            suma += numeros[i];
        }

        // 2. Calcular la media precisa
        double media = (double) suma / numeros.length;

        // 3. Ordenar (opcional para que la lista de mayores se vea mejor)
        Arrays.sort(numeros);

        // 4. Mostrar solo los pares (de mayor a menor)
        System.out.println("Números pares del array (de mayor a menor):");
        for (int i = numeros.length - 1; i >= 0; i--) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        // 5. MOSTRAR NÚMEROS POR ENCIMA DE LA MEDIA
        System.out.println("\n\n--- Análisis respecto a la media (" + media + ") ---");
        System.out.print("Números mayores que la media: ");
        int contadorMayores = 0;

        for (int n : numeros) {
            if (n > media) {
                System.out.print(n + " ");
                contadorMayores++;
            }
        }

        // 6. Resultados finales
        System.out.println("\n\n--- Estadísticas ---");
        System.out.println("Suma total: " + suma);
        System.out.println("La media es: " + media);
        System.out.println("Total de números por encima de la media: " + contadorMayores);
    }
}