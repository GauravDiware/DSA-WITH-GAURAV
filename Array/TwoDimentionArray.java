import java.util.*;
public class TwoDimentionArray{
    public static boolean findElement(int matrix[][] , int num) {
      int n = matrix.length;
      int m = matrix[0].length;

      for(int i = 0;i< n;i++){
        for(int j = 0;j<m;j++){
            if(matrix[i][j] == num){
                System.out.println("Found at cell "  + i +" ," + j );
                return true;
            }
        }
      }
      System.out.println("Element not found");
      return false;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of in an Array");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];


          int row = matrix.length;
        int col = matrix[0].length;
        System.out.println("Enter the element in an array");
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                matrix[i][j] = sc.nextInt(); 
            }
            System.out.println();
        }

        for(int i = 0;i<row;i++){
            for(int j = 0; j < col; j++){
                System.out.print(matrix[i] [j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the element to search");
        int num = sc.nextInt();

        findElement(matrix ,num);
    }
}