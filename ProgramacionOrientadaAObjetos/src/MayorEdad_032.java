import java.util.Scanner;

public class MayorEdad_032 {
    public static void main(String[] args) {


        var sc = new Scanner(System.in);
        System.out.println("*** Determinar si es mayor de edad ***");


        var edad = Integer.parseInt(sc.nextLine());

        //Bloque de comparacion if-else
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }

    }
}
