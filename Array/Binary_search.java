import java.util.*;
public class Binary_search{
    public static int binarysearch(int data[], int n){
        int start = 0; 
        int end = data.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(data[mid] == n){
                return mid;
            }
            if(data[mid] < n ){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no element : ");
        int size = sc.nextInt();
        int data[] = new int[size];
        System.out.println("Enter the " + size + " element in data");
        for(int i = 0;i<size;i++){
            data[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search : ");
        int n = sc.nextInt();
        int result = binarysearch(data,n);
        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at : " + result );
        }
    }
}