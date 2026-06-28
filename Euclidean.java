public class Main {

    public static void main(String[] args) {

        int a = 19;
        int b = 2;

        int old_r = a, r = b;
        int old_s = 1, s = 0;
        int old_t = 0, t = 1;

        while (r != 0) {
            int q = old_r / r;

            int temp = r;
            r = old_r - q * r;
            old_r = temp;

            temp = s;
            s = old_s - q * s;
            old_s = temp;

            temp = t;
            t = old_t - q * t;
            old_t = temp;
        }

        System.out.println("GCD = " + old_r);
        System.out.println("S = " + old_s);
        System.out.println("T = " + old_t);

        System.out.println(a + "(" + old_s + ") + " + b + "(" + old_t + ") = "
                + (a * old_s + b * old_t));
    }
}
