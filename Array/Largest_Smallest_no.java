import java.util.Scanner;

public class LargestSmallestNumber {

    public static int findLargest(int[] data) {
        int largest = Integer.MIN_VALUE;

        for (int num : data) {
            if (num > largest) {
                largest = num;
            }
        }

        return largest;
    }


    public static int findSmallest(int[] data) {
        int smallest = Integer.MAX_VALUE;

        for (int num : data) {
            if (num < smallest) {
                smallest = num;
            }
        }

        return smallest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] data = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            data[i] = sc.nextInt();
        }

        int smallest = findSmallest(data);
        int largest = findLargest(data);

        System.out.println("\n===== Result =====");
        System.out.println("Largest Element  : " + largest);
        System.out.println("Smallest Element : " + smallest);

        sc.close();
    }
}