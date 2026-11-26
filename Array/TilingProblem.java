import java.util.*;
public class TilingProblem{
    public static int tilingFixingProblem(int n){
        if(n == 0  || n == 1){
            return 1;
        }

        // vertical
        int tnm1 = tilingFixingProblem(n-1);
        // horizontal
        int tnm2 = tilingFixingProblem(n-2);

        int total_tile = tnm1 + tnm2;

        return total_tile;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = tilingFixingProblem(n);
        System.out.println(result);

    }
}