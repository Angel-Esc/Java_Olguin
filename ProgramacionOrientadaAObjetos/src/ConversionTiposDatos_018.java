import java.util.Scanner;

public class ConversionTiposDatos_018 {
    public static void main(String[] args) {

        System.out.println("Conversion de tipos de datos");

        //Conversion implicita
        int i = 18;
        double d = i;  //Conversion implicita de int a double
        System.out.println("d: " + i);
        System.out.println("d: " + d);

        //Casting o explicito
        double d2 = 9.99;
        int i2 = (int) d2;
        System.out.println("valor de d2: " + d2);
        System.out.println("valor de d2 :" + i2);

        //Utilizando scanner
        var sc = new Scanner(System.in);
        System.out.println("Ingresa un valor entero");
        int valor = sc.nextInt();
        System.out.println("valor: " + valor);

        //float
        System.out.println("Proporciana un numero decimal:");
        float valor2 = sc.nextFloat();
        System.out.println("valor: " +  valor2);

    }
}
