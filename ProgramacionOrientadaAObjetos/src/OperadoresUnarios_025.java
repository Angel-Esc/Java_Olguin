public class OperadoresUnarios_025 {
    public static void main(String[] args) {

        //Operadores unarios
        System.out.println("*** Operadores Unarios en Java ***");

        //Bloque de variables
        int a = 3, b = 5;

        //Negacion
        System.out.println("Negacion: " + (-a)); //Cambiar el valor de asignacion de la variable
        System.out.println("Negacion: " + -b); //Sin parentesis

        //Incremento
        System.out.println("Incremento: " + (++a));
        System.out.println("Incremento 2: " + (++b));

        //Decremento
        System.out.println("Decremento: " + (--a));
        System.out.println("Decremento 2: " + (--b));

        //Negacion logica
        boolean c = true, d = false;
        System.out.println("Negacion logica: " + (!c));
        System.out.println("Negacion logica 2: " + (!d));


    }
}
