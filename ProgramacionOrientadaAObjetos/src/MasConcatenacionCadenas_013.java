public class MasConcatenacionCadenas_013 {
    public static void main(String[] args) {

        System.out.println("*** Metodos de concatenacion de cadenas ***");

        // Bloque de variables
        var nombre = "Juan";
        var apellido = "Perez";
        var apellido2 = "Sanchez";

        System.out.println("Nombre completo: " + nombre + " " + apellido + " " + apellido2);

        // Otras formas de concatenacion de cadenas
        System.out.println("Nombre completo: "
                .concat(nombre)
                .concat(" ")
                .concat(apellido)
                .concat(" ")
                .concat(apellido2));

        // Usar el placeholder
        System.out.printf("Nombre completo: %s %s %s\n" , nombre, apellido, apellido2);

        // String format
        var nombreCompleto = String.format("%s %s %s", nombre, apellido, apellido2);
        System.out.println("Nombre completo: " + nombreCompleto);

        // String joing
        System.out.println("Nombre Completo: " + String.join(" ", nombre, apellido, apellido2));

    }
}
