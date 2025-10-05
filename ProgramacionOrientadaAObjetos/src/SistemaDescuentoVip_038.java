import java.util.Scanner;

public class SistemaDescuentoVip_038 {
    public static void main(String[] args) {
        System.out.println("*** Sistema de descuento vip ***");

        final var NO_PRODUCTOS = 10;
        var sc = new Scanner(System.in);

        System.out.println("Digite la cantidad de productos a comprar: ");
        var cantidadProductos = sc.nextLine();

        System.out.println("Tienes membresia VIP (true/false): ");
        var esVip = Boolean.parseBoolean(sc.nextLine());

        var cantidadProductosInt = Integer.parseInt(cantidadProductos);
        var aplicaDescuento = cantidadProductosInt >= NO_PRODUCTOS && esVip;

        System.out.println("Aplica para descuento: " + aplicaDescuento);
        //System.out.println("No aplica para descuento: " + !aplicaDescuento);

    }
}
