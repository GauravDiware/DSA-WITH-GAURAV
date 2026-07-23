import java.util.*;
public class BubbleSort{

    public static void bubbleSort(int num[]){
        int n = num.length;

        for(int turn = 0;turn < n-1;turn++){
            for(int j = 0;j < n-1-turn;j++){
                if(num[j] > num[j+1]){
                    int temp = num[j+1];
                    num[j+1] = num[j];
                    num[j] = temp;
                }
            }
        }
    }
        public static void printArr(int num[]){
            for(int i = 0;i<num.length;i++){
                System.out.print(num[i]+" ");
            }
            System.out.println();
      }
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an array :");
        int size = sc.nextInt();

        System.out.println("Enter the element in an array  :");
        int num[] = new int[size];
        for(int i = 0;i<size;i++){
            num[i] = sc.nextInt();
        }
   
        bubbleSort(num);
        printArr(num);
    }
}