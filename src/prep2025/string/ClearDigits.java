package prep2025.string;


import java.util.Stack;

//https://leetcode.com/problems/clear-digits/description/?difficulty=EASY&page=1&topicSlugs=string
public class ClearDigits {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(clearDigits(s));
    }
    public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for(char c: ch){
            if(Character.isDigit(c) && !stack.empty()){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        String result = "";
        for(char c:stack){
            result = result+c;
        }
        return  result;
    }


}
