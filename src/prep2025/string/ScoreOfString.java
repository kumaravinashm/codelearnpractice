package prep2025.string;


import java.util.Map;

//https://leetcode.com/problems/score-of-a-string/description/?difficulty=EASY&page=1&topicSlugs=string
public class ScoreOfString {
    public static void main(String[] args) {
        String s= "zaz";
        System.out.println(scoreOfString(s));
    }

    public static int scoreOfString(String s) {
        int[] arr = new int[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i] = s.charAt(i);
        }
        int n = 0;
        for(int i=0;i<arr.length-1;i++){
            n = n + Math.abs(arr[i]-arr[i+1]);
        }
        return n;
    }
}
