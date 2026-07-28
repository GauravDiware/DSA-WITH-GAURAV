import java.util.*;

public class LongestSubString {

    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            HashSet<Character> set = new HashSet<>();

            for (int j = i; j < s.length(); j++) {

                if (set.contains(s.charAt(j))) {
                    break;
                }

                set.add(s.charAt(j));

                maxLength = Math.max(maxLength, j - i + 1);
            }
        }

        return maxLength;
    }

    public static void main(String args[]) {

        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
    }
}