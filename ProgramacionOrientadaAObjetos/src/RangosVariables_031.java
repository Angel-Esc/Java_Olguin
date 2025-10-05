import java.util.Scanner;

public class RangosVariables_031 {
    public static void main(String[] args) {

        //Bloque de variables
        var sc = new Scanner(System.in);

        System.out.println("Proporcione un dato de tipo entero: ");
        var dato = Integer.parseInt(sc.nextLine());

        // Analisis de rango de 1 a 100
        var dentroRango = dato >= 1 && dato <= 100;
        System.out.println("El dato introducido: " + dato + "Esta dentro del rango? " + dentroRango);

        //var fueraRango = !dentroRango;
        //System.out.println("El dato introducido: " + dato + "Esta fuera del rango? " + fueraRango);

    }
}
