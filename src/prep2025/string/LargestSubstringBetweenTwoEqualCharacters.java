package prep2025.string;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/largest-substring-between-two-equal-characters/?difficulty=EASY&page=1&topicSlugs=string
public class LargestSubstringBetweenTwoEqualCharacters {

    public static void main(String[] args) {
        String s = "aa";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                max = Math.max(max, i - map.get(s.charAt(i)) - 1);
            } else {
                map.put(s.charAt(i), i);
            }
        }
        return max;
    }

}
