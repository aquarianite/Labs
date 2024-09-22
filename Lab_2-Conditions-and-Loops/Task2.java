import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
Organizing the entry and entering of numbers
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        in.close();
Checking the range from 0 to 1
        if ((x*x + y*y) <= 1) {
            System.out.println("true");
        }
        else {
            System.out.println("false");;
        }
    }
}
