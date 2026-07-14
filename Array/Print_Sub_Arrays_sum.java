
//Brute force approach to print all subarrays of an array and their sum and find Maximum

// Time complexity (n^3) 


import java.util.*;


public class Print_Sub_Arrays_sum{

    public static void printSubArrays(int[] numbers) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int start = 0; start < numbers.length; start++) {

            for (int end = start; end < numbers.length; end++) {

                curr_sum = 0;
                for (int k = start; k <= end; k++) {
                    curr_sum += numbers[k];
                }

                System.out.println(" sub_Array sum " + curr_sum);
                if(max_sum < curr_sum){
                    max_sum = curr_sum;
                }

            }

        }

        System.out.println("Maximum subarray sum = " + max_sum);
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