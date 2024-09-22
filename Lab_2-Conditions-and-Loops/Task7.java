import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        if (n > 0) {
            for (int i = 1; i <= n; i) {
                if (math.pow(2, i))
                System.out.println();
            }
        }
        else {
            System.out.println("There are no any positive powers of 2,\n which are lower then " + n);
        }
    }
}
