public class OperadoresLogicos_028 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        /*
        System.out.println("a && b: " + (a && b)); //AND logico
        System.out.println("a || b:" + (a || b)); // OR logico
        System.out.println("!a: " + (!a)); // NOT logico
        System.out.println("a ^ b: " + (a ^ b)); //XOR logico
        */

        // And (&&)
        System.out.println("AND");
        System.out.println("Resultado de a && b: " + (a && b)); // false
        System.out.println("Resultado de a && a: " + (a && a)); // true
        System.out.println("Resultado de b && b: " + (b && b)); // true

        //or (||)
        System.out.println();
        System.out.println("Or");
        System.out.println("Resultado de a || b: " + (a || b));
        System.out.println("Resultado de a || a: " + (a || b));
        System.out.println("Resultado de b || b: " + (a || b));

        // not (!)
        System.out.println();
        System.out.println("Not");
        System.out.println("Resultado de !a: " + (!a)); //false
        System.out.println("Resultado de !b: " + (!b)); //true

    }
}
