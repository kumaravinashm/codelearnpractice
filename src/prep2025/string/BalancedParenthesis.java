package prep2025.string;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {

    public static void main(String[] args) {
        String s = "[](()){}";
//        System.out.println(isBalanced(s));
        System.out.println(areBracketsBalanced(s));
        System.out.println(isParenthesisBalanced(s));
    }


    public static boolean areBracketsBalanced(String s)
    {
        int i = -1;
        char[] stack = new char[s.length()];
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack[++i] = ch;
            else {
                if (i >= 0 && ((stack[i] == '(' && ch == ')') || (stack[i] == '{' && ch == '}') || (stack[i] == '[' && ch == ']')))
                    i--;
                else
                    return false;
            }
        }
        return i == -1;
    }

    static boolean isBalanced(String expr) {
        Deque<Character> dq = new ArrayDeque<>();
        for(int i=0;i<expr.length();i++){
            char c= expr.charAt(i);
            if(c=='['||c=='('||c=='{'){
                dq.push(c);
            }
            if(dq.isEmpty()) return false;
            char pop;
            switch (c){
                case ']':
                    pop = dq.pop();
                    if(pop=='('||pop=='{') return false;
                    break;
                case '}':
                    pop = dq.pop();
                    if(pop=='('||pop=='[') return false;
                    break;
                case ')':
                    pop = dq.pop();
                    if(pop=='['||pop=='{') return false;
                    break;
            }
        }
        return dq.isEmpty();
    }

    static boolean isParenthesisBalanced(String exp){
        int square =0,curly =0, round =0;
        for(int i=0;i<exp.length();i++){
            char c = exp.charAt(i);
            switch (c){
                case '(':
                    round++;
                    break;
                case ')':
                    round--;
                    if(round<0) return false;
                    break;
                case '[':
                    square++;
                    break;
                case ']':
                    square--;
                    if(square<0) return false;
                    break;
                case '{':
                    curly++;
                    break;
                case '}':
                    curly--;
                    if(curly<0) return false;
                    break;
            }
        }
        return round==0 && square==0 && curly==0;
    }
}
