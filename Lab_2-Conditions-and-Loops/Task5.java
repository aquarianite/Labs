public class task5 {
    public static void main(String[] args) {
        int f = 0, g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
        /*
is Fibonacci numbers - a numerical sequence,
in which each successive number is equal to the sum of
two previous numbers
        */
    }
}
