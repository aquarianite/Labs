import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
Announcing Numbers
        int num1, num2, num3;
Entering three numbers
        Scanner in = new Scanner(System.in);
        
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        in.close();
Comparing Numbers
        if ((num1 == num2) && (num2 == num3)) {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }
}
