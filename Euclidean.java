public class Main {
    public static void main(String[] args) {
        int x = 19;
        int y = 2;

        while (y != 0) {
            int sisa = x % y;
            System.out.println(x + " MOD " + y + " = " + sisa);

            x = y;
            y = sisa;

        }

        System.out.println("GCD = " + x);
    }
}
