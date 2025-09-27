public class Cadenas_009 {
    public static void main(String[] args) {

        System.out.println("Manejo de caracteres");
        var cadena1 = "Hola";
        System.out.println("cadena 1: " + cadena1);
        var cadena2 = "Mundo";
        System.out.println("Cadena 2: " + cadena2);
        var cadena3 = cadena1+ " " + cadena2;
        System.out.println("Cadena 3: " + cadena3);

        //cadena con multiples lineas
        var cadena4 = """
                esta es una cadena
                con multiples linias de
                texto
                """;
        System.out.println("Cadena 4: " + cadena4);

    }
}