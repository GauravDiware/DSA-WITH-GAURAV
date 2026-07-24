
//O(n)
//Simple String program to check palindrome or not

import java.util.*;
public class Palindrome{
    public static boolean checkPalindrome(String str){
        int n = str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        System.out.println(checkPalindrome(str));
    }
}