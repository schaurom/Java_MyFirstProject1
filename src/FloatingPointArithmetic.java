public class FloatingPointArithmetic {

    public static void main(String[] args) {

        // IEEE 754  gibt Standards vor, wie Gleitkommazahlen Eigenschaften haben

        System.out.println(5 /2);

        // float, double
        System.out.println(5.0 / 2.0);

        System.out.println(5.0 / 2);

        System.out.println(2.5 + 0.5);

        System.out.println(10.0f - 0.1f - 0.1f);   // --> Ergebnis: 9.799999
        System.out.println(10.0 - 0.1 - 0.1);   // --> Ergebnis: 9.8 --> höhere Genauigkeit

        System.out.println(10000.0f + 0.0001f); // --> Ergebnis: 10000.0
        System.out.println(10000.0 + 0.0001); // --> Ergebnis: 10000.00001




    }
}
