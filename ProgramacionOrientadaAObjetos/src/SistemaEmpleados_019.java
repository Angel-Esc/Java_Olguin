import java.util.Scanner;
public class SistemaEmpleados_019 {
    public static void main(String[]args) {

        var sc = new Scanner(System.in); //Scanner para entrada de datos

        System.out.println("Ingresa el nombre del empleado: ");
        var nombre = sc.next();

        System.out.println("Ingresa el sueldo del empleado: ");
        var sueldo = sc.nextDouble();

        System.out.println("Genero del usuario (H/M): ");
        var genero = sc.next().charAt(0);

        System.out.println("Es casado el empleado? (True/False): ");
        var casado = sc.nextBoolean();

        //Imprimir los datos del empleado
        System.out.println("Los datos del empleado son los siguientes:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Genero: " + genero);
        System.out.println("Casado: " + casado);

    }
}