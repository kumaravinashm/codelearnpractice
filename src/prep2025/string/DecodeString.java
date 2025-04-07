package prep2025.string;

import java.util.Stack;

public class DecodeString {


    public static void main(String[] args) {
        String s = "123[a]";
        System.out.println(getString(s));
    }


    static String getString(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c != ']') {
                stack.push(c);
            }else {
                String sub="";
                while (stack.peek()!='['){
                    sub = stack.pop()+sub;
                }
                stack.pop();
                String k="";
                while (!stack.empty() && Character.isDigit(stack.peek())){
                    k = stack.pop()+k;
                }
                for (char ch : sub.repeat(Integer.parseInt(k)).toCharArray()) {
                    stack.push(ch);
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        for (Character c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}







