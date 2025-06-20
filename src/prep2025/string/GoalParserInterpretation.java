package prep2025.string;

import java.util.Stack;

//https://leetcode.com/problems/goal-parser-interpretation/description/?difficulty=EASY&page=1&topicSlugs=string
public interface GoalParserInterpretation {

    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : command.toCharArray()) {
            if (!stack.isEmpty() && c == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                    sb.append('o');
                } else if (stack.peek() != '(') {
                    sb.append(c);
                }
            }if (!stack.isEmpty() && c != ')'){
                stack.pop();
                sb.append(c);
            }
            else if (c == '(') {
                stack.push(c);
            } else if(c!=')'){
                sb.append(c);
            }
        }
        return sb.toString();

    }
}
