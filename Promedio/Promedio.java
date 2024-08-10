import java.util.Scanner;

/**
 * La clase Promedio calcula el promedio de cuatro notas escolares introducidas por el usuario.
 */

public class Promedio {

/**
     * El método principal que ejecuta el programa.
     * @param args Los argumentos de la línea de comandos.
     */

    public static void main(String[] args) {

	// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);


        // Solicitar y leer las calificaciones de los exámenes
        System.out.println("Introduce la nota 1:");
        double Nota1 = scanner.nextDouble();

        System.out.println("Introduce la nota 2:");
        double Nota2 = scanner.nextDouble();

        System.out.println("Introduce la nota 3:");
        double Nota3 = scanner.nextDouble();

        System.out.println("Introduce la nota 4:");
        double Nota4 = scanner.nextDouble();

        System.out,println("Introduce la nota 5");
        double Nota5 = scanner.nextDouble();

        // Calcular el promedio de las calificaciones
        double promedio = (Nota1 + Nota2 + Nota3 + Nota4 + Nota5) / 5;


        // Mostrar el promedio al usuario
        System.out.println("El promedio de las 5 calificaciones es: " + promedio);

        // Cerrar Scanner
        scanner.close();
    }
}




