import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número mayor que 1: ");
            numero = scanner.nextInt();
            if (numero <= 1) {
                System.out.println("Error: El número debe ser mayor que 1.");
            }
        } while (numero <= 1);

        int suma = (numero * (numero + 1)) / 2;

        System.out.println("La suma de los números del 1 al " + numero + " es: " + suma);
        scanner.close();
    }
}

