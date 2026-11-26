import java.util.*;
public class MoveZero {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int temp = 0;
        if(n <= 1 || nums[0] == 0){
            return nums;
        }
        for(int i = 1;i<n;i++){
            if(nums[i] == 0  ||  nums[i] < nums[i] - 1){
                temp = nums[i];
                nums[i] = nums[i] -1;
                nums[i] - 1 = temp; 
            }

            return nums;
        }
        public static void main(String args[]){
            int nums[] = {0,1,0,3,12};

            moveZeroes(Arrays.toString(nums));
        }
    }