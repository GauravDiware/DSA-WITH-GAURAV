//  O(n)2

import java.util.*;
public class SelectionSort{

    public static void selection_sort(int num[]){
        int n = num.length;
        for(int i = 0;i<n-1;i++){
            int minpoint = i;
            for(int j = i+1;j < n;j++){
                if(num[minpoint] > num[j]){
                    minpoint = j;
                }
            }

            int temp = num[minpoint]; 
            num[minpoint] = num[i];
            num[i] = temp;
         }
    }

      public static void printArr(int num[]){
            for(int i = 0;i<num.length;i++){
                System.out.print(num[i]+" ");
            }
            System.out.println();
      }
    
    public static void main(String args[]){
        int num[] = {4,2,6,81,10};
        selection_sort(num);
        printArr(num);
    }
}