package prep2025.string;


import java.util.Stack;

//https://leetcode.com/problems/make-the-string-great/description/?difficulty=EASY&page=1&topicSlugs=string
public class MakeTheStringGreat {

    public static void main(String[] args) {
        String s = "Pp";
        System.out.println(makeGood(s));
    }

    public static String makeGood(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(c - stack.peek()) == 32 ) {
                stack.pop();
            } else {
                stack.push(c);
            }

        }
        for (char c : stack) {
            res.append(c);
        }
        return res.toString();
    }

}
