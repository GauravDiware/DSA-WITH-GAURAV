import java.util.*;
public class ShortestPath{

    public static float findShortestPath(String str){
        int  x = 0;
        int y = 0;
        int n = str.length();
        for(int i = 0;i< n;i++){
            if(str.charAt(i) == 'E'){
                x++;
            }else if(str.charAt(i) == 'W'){
                x--;
            }else if(str.charAt(i) == 'N'){
                y++;
            }else if(str.charAt(i) == 'S'){
                y--;
            }else{
                continue;
            }

            }
          int X = x*x;
          int Y = y*y;

          float result = (float)Math.sqrt(X +Y);
          return result;
    }
        
        
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to find shortest path");
        String str = sc.nextLine();
        System.out.println(findShortestPath(str));

    }

}