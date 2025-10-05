import java.util.Scanner;

public class EjercicioEdad_033 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("*** Bienvenido! ***");
        System.out.println();
        System.out.println("Proporciona tu edad:");
        int edad = Integer.parseInt(sc.nextLine());

        if (edad >= 0 && edad <= 12){
            System.out.println("Eres un nino");
        }
        else{
            if (edad >= 13 && edad <= 18){
                System.out.println("Eres un adolescente");
            }
            else {
                if (edad >= 19 && edad <= 40){
                    System.out.println("Eres un adulto");
                }
                else {
                    if (edad >= 41 && edad <= 60) {
                        System.out.println("Eres un adulto mayor");
                    }
                    else {
                        System.out.println("Eres de la tercera edad");
                    }
                }
            }
        }

    }
}
