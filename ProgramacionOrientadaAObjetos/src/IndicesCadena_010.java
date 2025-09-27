public class IndicesCadena_010 {
    public static void main(String[] args) {

        //manejo de indice de cadena
        var cadena = "Hola Mundo";
        System.out.println("Cadena: " + cadena);

        //extraer indice de la cadena
        var caracter = cadena.charAt(0);
        System.out.println("Caracter: " + caracter);

        var ultimocaracter = cadena.charAt(cadena.length() - 1);
        System.out.println("Ultimo caracter: " + ultimocaracter);

        //extraer subcadena de texto
        var subcadena = cadena.substring(0,4);
        System.out.println("Sub cadena: " + subcadena);
        var subcadena2 = cadena.substring(4);
        System.out.println("Sub cadena: " + subcadena2);

    }
}
