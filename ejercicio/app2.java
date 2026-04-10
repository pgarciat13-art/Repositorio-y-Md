import java.util.Scanner;
import java.util.Arrays;

public class app2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] edades = new int[5];

        int sumaTotal = 0;

        System.out.println("Introduce 5 edades:");
        for (int i = 0; i < edades.length; i++) {
            System.out.print("Edad " + (i + 1) + ": ");
            edades[i] = teclado.nextInt();
            sumaTotal += edades[i];
        }

        // --- LÓGICA PARA ELIMINAR ---
        System.out.print("\nIntroduce la edad que deseas eliminar: ");
        int edadAEliminar = teclado.nextInt();

        // 1. Verificar si el número existe y contar cuántas veces aparece
        int coincidencias = 0;
        for (int edad : edades) {
            if (edad == edadAEliminar) {
                coincidencias++;
            }
        }

        if (coincidencias > 0) {
            // 2. Crear un nuevo array con el tamaño reducido
            int[] nuevoArray = new int[edades.length - coincidencias];
            int indiceNuevo = 0;

            // 3. Copiar solo los que NO son el número a eliminar
            for (int i = 0; i < edades.length; i++) {
                if (edades[i] != edadAEliminar) {
                    nuevoArray[indiceNuevo] = edades[i];
                    indiceNuevo++;
                }
            }

            // Actualizamos la referencia para mostrar el resultado
            System.out.println("Elemento(s) eliminado(s) con éxito.");
            System.out.println("Array resultante: " + Arrays.toString(nuevoArray));

            // Recalcular media con el nuevo tamaño si es necesario
            if (nuevoArray.length > 0) {
                int nuevaSuma = 0;
                for (int n : nuevoArray)
                    nuevaSuma += n;
                System.out.println("Nueva media: " + (double) nuevaSuma / nuevoArray.length);
            }

        } else {
            System.out.println("La edad " + edadAEliminar + " no se encuentra en el array.");
            System.out.println("Array original: " + Arrays.toString(edades));
        }

        teclado.close();
    }
}