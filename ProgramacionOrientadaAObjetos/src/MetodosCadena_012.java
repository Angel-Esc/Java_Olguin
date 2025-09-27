public class MetodosCadena_012 {
    public static void main(String[] args) {

        var cadena1 = "Hola Mundo";
        System.out.println("Cadena 1: " + cadena1);

        // Convertir en mayusculas
        System.out.println("cadena 1 en mayusculas: " + cadena1.toUpperCase());

        // Convertir en minusculas
        System.out.println("Cadena 1 en minusculas: " + cadena1.toLowerCase());

        //Elmininar espacio en blanco al inicio y al final
        System.out.println("Cadena 1 sin espacios: " + cadena1.trim());

        // Reemplazar caracteres
        System.out.println("cadena1 reemplazando caracteres: " + cadena1.replace("o", "x"));

        // Buscar subcadenas
        System.out.println("Cadena 1 buscada en subcadenas: " + cadena1.indexOf("Mundo"));

        // Verificar si existe una subcadena
        System.out.println("Cadena 1 con verificacion: " + cadena1.contains("Mundo"));

        // Verifica si la cadena inicia con una subcadena
        System.out.println("Cadena 1 verificacion subcadenas: " + cadena1.startsWith("Hola"));

        // Longitud de la cadena
        System.out.println("Cadena 1 con longitud: " + cadena1.length());



    }
}
