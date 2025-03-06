import java.util.Scanner;

public class CompraArtefactos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre del cliente
        System.out.print("Ingrese su nombre: ");
        String nombreCliente = scanner.nextLine();

        // Definir los artefactos y sus precios
        String[] artefactos = {"Plancha", "Licuadora", "Lavadora", "Cocina"};
        double[] precios = new double[4];

        // Pedir los precios por teclado
        for (int i = 0; i < artefactos.length; i++) {
            System.out.print("Ingrese el precio de " + artefactos[i] + ": ");
            precios[i] = scanner.nextDouble();
        }

        // Calcular el total de la compra
        double total = 0;
        for (double precio : precios) {
            total += precio;
        }

        // Aplicar descuento si supera 1200
        double descuento = 0;
        if (total > 1200) {
            descuento = total * 0.17; // 17% de descuento
            total -= descuento;
        }

        // Mostrar los resultados
        System.out.println("\n--- Factura de Compra ---");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Artefactos comprados:");

        for (int i = 0; i < artefactos.length; i++) {
            System.out.println(artefactos[i] + ": $" + precios[i]);
        }

        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + total);

        scanner.close();
    }
}
