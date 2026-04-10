import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}