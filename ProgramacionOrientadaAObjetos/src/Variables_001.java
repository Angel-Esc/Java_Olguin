public class Variables_001 { //Inicio de la clase en Java

    public static void main(String[] args) { //Inicio del Main

    //Bloque de variables
    int edad = 31; //Variables de tipo entero
    double precio = 300.4; //Variables de tipo decimal
    boolean disponible = true; //Variables de tipo Booleano true or false
    char genero; //Variables de tipo char un solo caracter
    genero = 'M';

    //Acceder a los valores de las variables
        System.out.println("Valor inicial de la variable: " + edad + " años de edad");

    //Modificar el valor de las variables
        edad = 15;
        System.out.println("Ahora la edad es de: " + edad + " años de edad");

    //Impresion de todas las variables
    System.out.println("El precio de las papas es de: " + precio);
    System.out.println("Maria es de genero :" + genero);
    System.out.println("Disponible de la variable :" + disponible);

    } //Fin del Main
} //Fin de la clase en Java
