import java.util.Scanner;
public class task3 {

Finding the GCD
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a%b);
    }
    
Rapid modulo exponentiation
    
Fermat Simplicity Test Algorithm
    public static boolean ferma(int n) {
        if (n == 2)
            return true;
        for (int i = 0; i < 100; i++) {
            int a = ( (int)(Math.random() * 1000) % (n - 2)) + 2;
        }
        if (gcd(a, x) != 1)
            return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
Input validation
        int num;
        do {
System.out.println("Enter n > 1");
            num = in.nextInt();
        } while (num <= 1);
        
        in.close();
    }
}
