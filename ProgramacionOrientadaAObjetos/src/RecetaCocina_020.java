import java.util.Scanner;
public class RecetaCocina_020 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("*** Bienvenido a tu creador de recetas para pasteles ***");

        System.out.println("¿Que nombre te gustaria ponerle a tu receta?");
        var nombre = sc.next();

        System.out.println("¡Excelente!, Ahora de que sabor quieres que sea");
        var sabor = sc.next();

        System.out.println("Genial, ¿Cuanto tiempo le demorara a las personas prepararlo?");
        var tiempo = sc.next();

        System.out.println("¡Ahora pasemos a los Ingredientes!");
        System.out.println(" ");

        System.out.println("¿Cuanta cantidad de harina se requeriran?");
        var harina = sc.next();

        System.out.println("¿Cuantos huevos se van a utilizar?");
        var huevos = sc.nextInt();

        System.out.println("¿Cuanta azucar se utilizará?");
        var azucar = sc.nextInt();

        System.out.println("¿Cuantos Ml de leche necesitan?");
        var leche = sc.next();

        System.out.println("Por ultimo, ¿Cuanto tiempo tardara en hornearse?");
        var horno = sc.next();

        System.out.println("¿Te gustaria agregar una nota adicional?");
        var adicional = sc.next();

        System.out.println("*** ¡Muy bien!, los datos de tu receta son los siguientes ***");
        System.out.println("Nombre de la receta: " + nombre);
        System.out.println("Sabor del pastel: " + sabor);
        System.out.println("Tiempo de preparacion: " + tiempo + " Minutos");
        System.out.println("Harina a utilizar: " + harina + " Gramos");
        System.out.println("Huevo: " + huevos + " Huevo/s");
        System.out.println("Azucar: " + azucar + " Gramos");
        System.out.println("Leche: " + leche + " Mililitros");
        System.out.println("Tiempo de horneado: " + horno + " Minutos");
        System.out.println("El chef te recomienda: "
                .concat(adicional));

    }
}