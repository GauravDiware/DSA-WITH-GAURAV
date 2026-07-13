import java.util.*;

public class Print_Sub_Array {

    public static void printSubArrays(int[] numbers) {
        int totalSubArrays = 0;

        for (int start = 0; start < numbers.length; start++) {

            for (int end = start; end < numbers.length; end++) {

                int sum = 0;

           
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }

                System.out.println(" --> Sum = " + sum);
                totalSubArrays++;
            }

            System.out.println();
        }

        System.out.println("Total Subarrays = " + totalSubArrays);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        printSubArrays(numbers);

        sc.close();
    }
}