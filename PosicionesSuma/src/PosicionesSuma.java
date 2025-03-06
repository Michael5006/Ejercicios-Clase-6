public class PosicionesSuma {
    public static void main(String[] args) {
        int[] numeros = new int[50]; // Arreglo de 50 posiciones
        int suma = 0;

        // Llenar el arreglo con los números del 1 al 50
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1; // Asigna valores de 1 a 50
            suma += numeros[i]; // Suma los valores
        }

        // Mostrar la suma total
        System.out.println("La suma de los números del 1 al 50 es: " + suma);
    }
}
