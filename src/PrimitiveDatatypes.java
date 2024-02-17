public class PrimitiveDatatypes {

    public static void main(String[] args) {
        // statically typed

        // 32-bit signed (2^31 - 1)
        int i = 4711;

        // 8-bit signed [-128, 127]
        byte b = 127;

        // 16-bit
        short s = 128;

        // 64-bit (2^63 - 1)
        long l = 287454445;
        System.out.println(l);

        // single-precision 32-bit
        float f = 2.5f;
        System.out.println(f);

        // double-precision 64-bit
        double d = 2.5;
        System.out.println(d);

        // 1-bit, ~1-byte in storage in memory
        boolean bool = true;

        // 16-bit unicode
        char c = 's';
        System.out.println(c);
    }
}
