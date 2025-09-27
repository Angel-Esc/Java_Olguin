public class TiposVariables_004 { //Inicio de la clase

    public static void main(String[] args) { //Inicio del Main

        //Bloque de Variables
        byte tipobyte = 127; // Soporta 3 digitos
        System.out.println("tipobyte: " + tipobyte);
        short tiposhort = 32765; // Soporta 5 digitos
        System.out.println("tiposhort: " + tiposhort);
        int tipoint = 384513151; // Soporta 9 digitos
        System.out.println("tipoint: " + tipoint);
        long tipoLong = 8434125354L;
        System.out.println("tipolong: " + tipoLong);
        float tipofloat = 3.14f; //Se usa normalmente para 2 digitos despues del punto
        System.out.println("tipofloat: " + tipofloat);

        double tipoDouble = 3.1415D; //Se usa con varios digitos despues del punto
        System.out.println("tipodouble: " + tipoDouble);

        char tipoChar = '1'; // Se usa para poner un solo caracter
        System.out.printf("tipochar: " + tipoChar);

        boolean tipoboolean = false; // Se usa para 2 valores: True or false
        System.out.println("tipoboolean: " + tipoboolean);

        // Tipo object
        String tipostring = "Hello World"; // Se usa para una cadena de texto
        System.out.println("tipostring: " + tipostring);

        int num; //Se puede declarar sin expresar ningun valor
        String nombre = null; //Se necesita poner null para expresarla unicamente
        System.out.println("nombre: " + nombre);
        nombre = "Angel Jesús";
        System.out.println("Mi nombre es: " + nombre);

    } // Fin del main
} //Fin de la clase
