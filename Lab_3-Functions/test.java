public class test {
    public static int addNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i ++) {
            sum += numbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = addNumbers(numbers);
System.out.println("Sum of numbers from 1 to 5: " + result);
    }
}
