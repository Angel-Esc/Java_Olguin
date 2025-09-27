public class Constantes_007 { //Inicio de la clase
    public static void main(String[] args) { // Inicio del Main

        // Variables de tipo estatica o constantes
        System.out.println("*** Constantes en Java ***");
        System.out.println();

        // Bloque de variables y constantes
        final var DIAS_SEMANA = 7; //Se recomienda usar mayusculas para diferenciar constantes de variables
        System.out.println("Los dias de la semana son: " + DIAS_SEMANA);

        final var MES_ANIO = 12; //No usar caracteres especiales (ACENTOS,Ñ,DIERESIS)
        System.out.println("Los meses del año son: " + MES_ANIO);

        final var NUMERO_PI = 3.1416;
        System.out.println("Numero PI: " + NUMERO_PI);

        // clase MATH en java
        System.out.println("Clase math en java");
        System.out.println("Valor de pi: " + Math.PI); //se utiliza math para calculos matematicos

        // Redondear un numero
        System.out.println("Redondear un valor: " + Math.round(NUMERO_PI));
        System.out.println("Redondear un numero hacia arriba: " + Math.ceil(NUMERO_PI));
        System.out.println("Redondear hacia abajo un numero: " + Math.floor(NUMERO_PI));


    } //Fin del Main

} //Fin de la clase
