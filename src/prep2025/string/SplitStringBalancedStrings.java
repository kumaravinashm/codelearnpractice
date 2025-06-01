package prep2025.string;


import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/split-a-string-in-balanced-strings/description/?difficulty=EASY&page=1&topicSlugs=string
public class SplitStringBalancedStrings {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {
        int count = 0 ;
        int right = 0;
        int left = 0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='L') left=left+1;
            if(c=='R') right=right+1;
            if(right==left){
                count++;
                right=left=0;
            }
        }
        return count;
    }


}
