import java.util.*;
public class Reverse_array{
    public static void reverse(int data[]){
        int start = 0;
        int end = data.length-1;
        int temp;
        while(start < end){
            temp = data[end];
            data[end] = data[start];
            data[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int data[] = {23,45,67,87,22,11};
        reverse(data);
        for(int i = 0;i< data.length;i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}