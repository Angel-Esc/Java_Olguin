import java.util.Scanner;

public class ManejoConsola_016 {
    public static void main(String[] args) {

        //Manejo de consola con Java
        Scanner sc = new Scanner(System.in); //Variable tipo scanner

        System.out.println("Ingresa tu nombre");
        var nombre = sc.nextLine(); //Captura informacion de tipo string
        System.out.println("Nombre: " + nombre);


    }
}
