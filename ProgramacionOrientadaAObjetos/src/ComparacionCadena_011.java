public class ComparacionCadena_011 {
    public static void main(String[] args) {

        var cadena1 = "java";
        var cadena2 = "java";
        var cadena3 = new String("java");

        //Comparar cadena de texto
        System.out.println("Cadena 1 es igual a cadena 2: " + (cadena1 == cadena2));

        //Comparar cadenas de new
        System.out.println("Cadena 1 es igual a cadena 3: " + (cadena1 == cadena3));

        //Comparar cadena con metodos
        System.out.println("Cadena es igual a cadena 3: " + (cadena1.equals(cadena3)));

        var cadena4 = "JAVA";
        System.out.println("Cadena 1 es igual a cadena 4: " + (cadena1.equalsIgnoreCase(cadena4))); //ignora si hay mayusculas

    }
}