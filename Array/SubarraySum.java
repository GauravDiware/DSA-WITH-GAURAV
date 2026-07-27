//560. Subarray Sum Equals K

//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

//A subarray is a contiguous non-empty sequence of elements within an array.

import java.util.*;
public class SubarraySum{
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        for(int i = 0;i< n;i++){
            int sum = 0;
            for(int j = i;j<n;j++){
               sum+= nums[j];

               if(sum == k){
                count++;
               }

            }
        }
        return count;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of an array");
    int n = sc.nextInt();
    int nums[] = new int[n];
     System.out.println("Enter the element in an array ");
    for(int i = 0;i< n;i++){
        nums[i] = sc.nextInt();
    }

     System.out.println("Enter the no to find");
    int k = sc.nextInt();

    System.out.println(subarraySum(nums,k));
}
}    
