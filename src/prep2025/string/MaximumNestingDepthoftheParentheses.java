package prep2025.string;

import java.util.Stack;

//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/?difficulty=EASY&page=1&topicSlugs=string
public class MaximumNestingDepthoftheParentheses {

    public static void main(String[] args) {
        String s = "73428681((-7-2/((76+575/0767-+(/1((-1(/0/2257))(6461-)()049((()+9(6)/6047))7872*9807)()4)9)0-+)()*))";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int max = 0;
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c =='('){
                stack.push(c);
                max = Math.max(stack.size(),max);
            }else if(c==')'){
                if(!stack.empty() &&stack.peek() == '('){
                    stack.pop();
                }
            }
        }
        return max;
    }
}
