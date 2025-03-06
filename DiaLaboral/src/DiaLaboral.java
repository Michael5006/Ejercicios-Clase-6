import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un día de la semana: ");
        String dia = scanner.nextLine().toLowerCase();

        // Evaluar con switch
        switch (dia) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un día laboral.");
                break;
            case "sábado":
            case "sabado":
            case "domingo":
                System.out.println("No es un día laboral.");
                break;
            default:
                System.out.println("Error: Día no válido.");
        }

        scanner.close();
    }
}
