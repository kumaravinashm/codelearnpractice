package prep2025.string;


import java.util.Stack;

//https://leetcode.com/problems/backspace-string-compare/description/?difficulty=EASY&page=1&topicSlugs=string
public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        System.out.println(backspaceCompare(s,t));

    }

    public static boolean backspaceCompare(String s, String t) {
        return stackRem(s).equals(stackRem(t));
    }

    public static String stackRem(String s){
        Stack<Character> stack = new Stack<>();
        char[] c1 = s.toCharArray();
        for(char c:c1){
            if(c=='#'){
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }else {
                stack.push(c);
            }
        }
        return stack.toString();
    }
}
