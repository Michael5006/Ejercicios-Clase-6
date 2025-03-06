import java.util.Scanner;

public class ArregloNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nÍndice - Valor");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + " - " + numeros[i]);
        }

        scanner.close();
    }
}
