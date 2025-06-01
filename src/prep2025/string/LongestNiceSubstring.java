package prep2025.string;

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring {
    public static void main(String[] args) {
        String s = "dDzeEE";
        System.out.println(longestNiceSubstring(s));
    }


    public static String longestNiceSubstring(String s) {
        Set<Character> set = new HashSet<>();
        for(char c:s.toCharArray()){
            set.add(c);
        }
        for(int i=0;i<s.length();i++){
            if(set.contains(Character.toUpperCase(s.charAt(i))) && set.contains(Character.toLowerCase(s.charAt(i)))) continue;
            String s1 = longestNiceSubstring(s.substring(0,i));
            String s2 = longestNiceSubstring(s.substring(i+1));
            if(s1.length()>=s2.length()){
                return s1;
            }else {
                return s2;
            }
        }
        return s;
    }

}
