import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
Number of Array Elements
System.out.println("Enter the number of elements in the array: ");
        int array_length = in.nextInt();
        int[] num_array = new int[array_length]; allocating memory for an array
        
Array Filling
System.out.println("Enter numbers in array: ");
        for (int i = 0; i < array_length; i++) {
            num_array[i] = in.nextInt();
        }
Integer
System.out.println("Enter an integer: ");
        int num = in.nextInt();
        in.close();
Finding the number of occurrences in the "num" array
        int k = 0; count of the number of "num" in the array
        for (int i = 0; i < array_length; i++) {
            if (num_array[i] == num) k++;
        }
Creating a new array that is missing a "num"
        int new_array_lenght = array_length - k;
        int[] new_num_array = new int[new_array_lenght];
        int j = 0; New Array Indexes
        for (int i = 0; i < array_length; i++) {
            if (num_array[i] != num) new_num_array[j++] = num_array[i];
        }
Output of a new array
        System.out.print("[ ");
        for (int i = 0; i < (new_array_lenght); i++) {
            System.out.print(new_num_array[i] + " ");
        }
        System.out.print("]");
    }
}
