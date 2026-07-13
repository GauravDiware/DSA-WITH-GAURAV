import java.util.*;
public class Print_pairs{
    public static void printpair(int Arr[]){
        int pair = 0;
        for(int i = 0; i<Arr.length;i++){
            int curr = Arr[i];
            for(int j = i + 1;j < Arr.length; j++){
                System.out.print("(" + curr + " + " + Arr[j] + ")");
                pair++;
            }
            System.out.println();
        }
        System.out.println("The no of pair " + pair);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of of array");
        int size = sc.nextInt();
        System.out.println("Enter the element in the Array");
        int Arr[] = new int[size];
        for(int i = 0; i<size; i++){
            Arr[i] = sc.nextInt();
        }

        printpair(Arr);
    }
}