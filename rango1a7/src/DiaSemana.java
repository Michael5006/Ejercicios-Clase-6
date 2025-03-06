import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("El número " +numero+ " corresponde al día Lunes");
                break;
            case 2:
                System.out.println("El número " +numero+ " corresponde al día Martes");
                break;
            case 3:
                System.out.println("El número " +numero+ " corresponde al día Miércoles");
                break;
            case 4:
                System.out.println("El número " +numero+ " corresponde al día Jueves");
                break;
            case 5:
                System.out.println("El número " +numero+ " corresponde al día Viernes");
                break;
            case 6:
                System.out.println("El número " +numero+ " corresponde al día Sábado");
                break;
            case 7:
                System.out.println("El número " +numero+ " corresponde al día Domingo");
                break;
            default:
                System.out.println("Error: El número debe estar entre 1 y 7.");
        }

        scanner.close();
    }
}
