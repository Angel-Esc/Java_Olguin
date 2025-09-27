import java.util.Scanner;

public class LeerTiposDatos_017 {
    public static void main(String[] args) {

        //Crear la variable tipo scanner
        var sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        var nombre = sc.nextLine();

        System.out.println("Ingresa tu edad");
        //var edad = Integer.parseInt(sc.nextLine()); //Forma larga
        var edad = sc.nextInt();

        System.out.println("Proporciona tu estatura");
        //var estatura = Double.parseDouble(sc.nextLine()); //Forma larga
        var estatura = sc.nextDouble();

        System.out.println("Ingresa tu genero");
        var genero = sc.next().charAt(0);
        genero = Character.toUpperCase(genero);
        sc.close(); //Cerrar el scanner

        //Impresion de valores
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Genero: " + genero);

    }
}
