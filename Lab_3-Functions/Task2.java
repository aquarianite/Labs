import java.util.Scanner;
public class task2 {
    public static int factorial(int n) {
        int result;
        if (n == 1)
            return 1;
        result = factorial(n - 1) * n;
        return result;
    }
    public static void main(String[] args) {
Entering num
        Scanner in = new Scanner(System.in);
System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();
System.out.println("Natual logarithm of factorial " + num + " is equal to: " + Math.log(factorial(num)));
    }
}
