public class ComparisonOperator {

    public static void main(String[] args) {

        int x = 1;
        int y = 2;

        System.out.println(x == y);  // --> false
        System.out.println(x != y);  // --> true

        System.out.println(x < y);  // --> true
        System.out.println(x > y);  // --> false

        System.out.println(x >= y);  // --> false
        System.out.println(x <= y);  // --> true

        // bei Fließkommazahlen kann es zu unerwarteten Effekten kommen
    }
}
