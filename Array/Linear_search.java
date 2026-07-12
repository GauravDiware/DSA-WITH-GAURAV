import java.util.*;
public class Linear_search{

    public static int Linearsearch(int arr[], int n){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the no to search: " );
        int n = sc.nextInt();
        int result = Linearsearch(arr, n);
        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
        

    }
}