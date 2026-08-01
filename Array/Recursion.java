public class Recursion{


    public static void Print_No(int nums){
        if(nums == 1){
            System.out.println(1);
            return;
        }

        System.out.println(nums);
        Print_No(nums-1);
    }

public static void Print_Asc_no(int nums){
        if(nums == 1){
            System.out.println(1);
            return;
        }
        Print_Asc_no(nums-1);
        System.out.println(nums);
       
    }

    public static int fact(int nums){
        if(nums == 0){
            return 1;
        }


        int nm1 = fact(nums-1);
        int fn = nums * nm1;
        return fn;

    }
    public static int sumOfNumber(int num){
        if(num == 1){
            return 1;
        }

        int allNumber = sumOfNumber(num-1);
        int sum = num + allNumber;
        return sum;
    }

    public static int fabonacci(int num){
        if(num == 0 || num == 1){
            return num;
        }

        int fnm1 = fabonacci(num - 1);
        int fnm2 = fabonacci(num - 2);
        int fabonacci_no = (fnm1 + fnm2);
        return fabonacci_no;
    }


    public static boolean isSorted(int arr[] , int i){
        if(i == arr.length - 1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr , arr[i+1]);
    }

    public static int firstOccurance(int arr[] ,int key,int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return firstOccurance(arr, key , i+1);
    }


public static int power(int x , int pow){
    if(pow == 0){
        return 1;
    }
    return  x * power(x , pow-1);
}
    public static void main(String args[]){
        // int nums = 5;

        // Print_No(nums);

        //Print_Asc_no(nums);

       //System.out.println(fact(nums));

       // System.out.println(sumOfNumber(nums));

       // System.out.println(fabonacci(5));

    //    int arr[] = {1,2,3,4,5};
    //    int i = 0;
    //    System.out.println(isSorted(arr , i));

    // int key = 4;
    // int arr[] = {1,2,3,4,5,6,7,8,5};

    // System.out.println(firstOccurance(arr , key,0));
     System.out.println(power(2,10));
    }
}