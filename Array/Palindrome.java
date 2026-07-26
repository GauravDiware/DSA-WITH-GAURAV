import java.util.*;

public class Palindrome {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int original = x;
        int rev = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            rev = (rev * 10) + lastDigit;
            x = x / 10;
        }

        return original == rev;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        Palindrome obj = new Palindrome();

        boolean result = obj.isPalindrome(x);

        System.out.println(result);

        sc.close();
    }
}