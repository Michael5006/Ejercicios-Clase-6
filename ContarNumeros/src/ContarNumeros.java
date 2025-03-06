import java.util.Scanner;

public class ContarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int positivos = 0, negativos = 0, ceros = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número entero: ");
            numeros[i] = scanner.nextInt();
        }

        for (int num : numeros) {
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        scanner.close();
    }
}
