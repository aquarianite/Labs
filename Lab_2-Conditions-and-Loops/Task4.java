import java.util.Scanner;
public class task4 {
    
    public static void main(String[] args) {
    double sum = 0;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(); Input n
    in.close();
    for (int i = 0; i < n; i++) {
        double random_number = Math.random();
        sum += random_number;
        System.out.println(random_number);
    }
    System.out.println(sum / n);
    }
}
