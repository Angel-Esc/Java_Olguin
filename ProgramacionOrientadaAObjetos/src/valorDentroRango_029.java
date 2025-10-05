public class valorDentroRango_029 {
    public static void main(String[] args) {

        System.out.println("*** Valor dentro del rango ***");
        int valor = 5;
        int min = 0;
        int max = 10;

        boolean dentroRango = valor >= min && valor <= max;

        System.out.println("El valor " + valor + " esta dentro del rango? " + dentroRango);
        System.out.println("El valor " + valor + " esta fuera del rango? " + !dentroRango);


    }
}
