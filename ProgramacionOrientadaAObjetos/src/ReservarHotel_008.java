public class ReservarHotel_008 { // Inicio de la clase
    public static void main(String[] args) { //Inicio del Main

        // Bloque de variables
        var NombreCliente = "Angel Escamilla";
        var DiasReserva = 7;
        var Precio = 850.5;
        var TieneVisitaMar = true;

        // Detalles de la reserva
        System.out.println("*** Detalles de la reserva del cliente ***");
        System.out.println();

        // Impresion del nombre
        System.out.println("Nombre del cliente: " + NombreCliente);
        System.out.println("Dias de reserva: " + DiasReserva);
        System.out.println("Precio por noche: " + Precio);
        System.out.println("Tiene vista al mar: " + TieneVisitaMar);
        System.out.println();

        // Modificar los valores
        DiasReserva = 10;
        Precio = 1500.50;
        TieneVisitaMar = false;

        // Impresion de nuevas variables
        System.out.println("Nombre del cliente: " + NombreCliente);
        System.out.println("Dias de reserva: " + DiasReserva);
        System.out.println("Precio por noche: " + Precio);
        System.out.println("Tiene vista al mar: " + TieneVisitaMar);




    } //Fin del Main
} //Fin de la clase
