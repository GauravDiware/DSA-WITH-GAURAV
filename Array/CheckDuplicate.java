import java.util.*;
public class CheckDuplicate{
    public static Boolean CheckDuplicatePresence(int num[]){
        int n = num.length;

        for(int i = 0;i<n;i++){
            for(int j = i + 1;j<n;j++){
                if(num[i] == num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int num[] = { 2,4,6,8,0};
        System.out.println(CheckDuplicatePresence(num));

    }
}