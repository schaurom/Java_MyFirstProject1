public class BooleanLogic {

    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        System.out.println(x);  // true
        System.out.println(!x);  // false

        System.out.println(y);  // false
        System.out.println(!y);  // true

        System.out.println(x && y); // false
        System.out.println(x & y); // false  immer && schreiben

        System.out.println(x || y); // true

    }
}
