
package graphtraversal;

import java.util.HashMap;
import java.util.Scanner;


public class LongestSubstring 
{
     public int lengthOfLongestSubstring(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;


        for(int right = 0; right < str.length(); right++) {

            char ch = str.charAt(right);


            if(map.containsKey(ch)) {

                left = Math.max(left, map.get(ch) + 1);
            }


            map.put(ch, right);


            maxLength = Math.max(maxLength, right - left + 1);
        }


        return maxLength;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LongestSubstring ls = new LongestSubstring();


        System.out.print("Enter String: ");
        String str = sc.nextLine();


        int result = ls.lengthOfLongestSubstring(str);


        System.out.println("Longest Substring Length: " + result);


        sc.close();
    }
    }
    
}
