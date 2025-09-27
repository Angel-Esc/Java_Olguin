public class GeneradorEmails_015 {
    public static void main(String[] args) {
        System.out.println("Generador de correos emails con Java");

        //Datos personales del usuario
        var nombreCompleto = "Angel Escamilla";
        //Impresion de nombre
        System.out.println("Nombre completo: " +  nombreCompleto);

        // Analizar el nombre completo
        // Eliminar espacios al principio y al final
        nombreCompleto = nombreCompleto.strip();

        // Reemplazar espacios multiples por uno solo
        nombreCompleto = nombreCompleto.replaceAll("\\s+", ".");
        System.out.println("nombreCompleto = " + nombreCompleto);

        // Convertir a minusculas
        nombreCompleto = nombreCompleto.toLowerCase();
        System.out.println("Nombre completo: " + nombreCompleto);

        //Datos de la empresa
        var nombreDominio = "oracle.com";
        System.out.println("Nombre Dominio: " + nombreDominio);

        //Generar email
        var email = nombreCompleto + "@" + nombreDominio;
        System.out.println("Tu email asignado es: " + email);


    }
}
