import java.util.*;
// Kadane's Algorithm help to find the maximum sum of a contiguous subarray 
public class kadanes_algorithm{
      public static void sum(int num[]){
            int curr_sum = 0;
            int ms = Integer.MIN_VALUE;
            for(int i = 0;i<num.length;i++){
                  curr_sum = curr_sum + num[i];
                  if(curr_sum < 0){
                        curr_sum = 0;
                  }
                  ms = Math.max(curr_sum ,ms);
             }
             System.out.println(" Maximum Sum is : " +ms);
            }
      public static void main(String args[]){
            int num[] = {2,3,-6,4,5};
            sum(num);
      }
}