public class Casting {

    public static void main(String[] args) {
        // Widening Type Case
        double wideningCast = 5;    // es gehen keine Information verloren, weil der kleinere Typ in den größeren hineinpasst
        System.out.println(wideningCast);

        // Narrowing Type Cast
        int simpleCast = (int) 5.5;     // Genauigkeit und Daten sind verloren gegangen
        System.out.println(simpleCast);

        int castingResult = (int) (5.0 / 2.5);  // man muss explizit den ungenaueren Datentyp "casten" durch z.B. (int)
        System.out.println(castingResult);

        double castingOrder = 5.0 / (int) 2.5;  // --> 2.5 wird zu 2 --> daher Ergebnis: 5.0 / 2 = 2,5
        System.out.println(castingOrder);



    }
}
