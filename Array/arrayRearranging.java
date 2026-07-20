//Problem Statement: Rearrange a given array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order

import java.util.*;
public class arrayRearranging{

    public static int[] halfRearrange(int num[]){
        int n = num.length;

        Arrays.sort(num);
        int i = n/2;
         int j = n-1;
        
        while(i<j){
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i++;
            j--;
        }
        return num;
    }
    public static void main(String args[]){
        int num[] = {2,4 ,3 , 5 , 9  , 5  , 6  ,2};

      int result[]= halfRearrange(num);
      System.out.println(Arrays.toString(result));
     
    }
}