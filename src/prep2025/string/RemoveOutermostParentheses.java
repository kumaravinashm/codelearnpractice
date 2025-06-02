package prep2025.string;

import java.util.Stack;

//https://leetcode.com/problems/remove-outermost-parentheses/description/?difficulty=EASY&page=1&topicSlugs=string
public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));

    }

    public static String removeOuterParentheses(String s) {
        StringBuilder stringBuilderb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(stack.isEmpty() && c=='(') {
                stack.push(c);
            }
            else if (!stack.isEmpty() && c=='('){
                stack.push(c);
                stringBuilderb.append(c);
            }
            else if (stack.size()>1 && c==')'){
                stack.pop();
                stringBuilderb.append(c);
            }else if (stack.size()==1 && c==')'){
                stack.pop();
            }
        }
        return stringBuilderb.toString();



    }


}
