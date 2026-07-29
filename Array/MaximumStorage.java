import java.util.*;
class MaximumStorage {
    public static int maxArea(int[] height) {
       int lp = 0;
       int rp = height.length-1;

       int maxWater = 0;
       while(lp < rp){

        int width = rp - lp;

        int area = Math.min(height[lp], height[rp]) * width;

        maxWater = Math.max(maxWater , area); 

        if(height[lp] < height[rp]){
            lp++;
        }else{
            rp--;
        }
       }

       return maxWater;
    }
        
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no of element in the container");
            int n = sc.nextInt();

            int height[] = new int[n];

            for(int i = 0;i<n;i++){
                height[i] = sc.nextInt();
            }

            System.out.println(maxArea(height));
        }
    
}