package prep2025.string;

import java.util.Stack;

//https://leetcode.com/problems/robot-return-to-origin/description/?difficulty=EASY&page=1&topicSlugs=string
public class RobotReturntoOrigin {
    public static void main(String[] args) {
        String moves = "RLUURDDDLU";
        System.out.println(judgeCircleStack(moves));

    }

    public static boolean judgeCircle(String moves) {
        int lr = 0;
        int ud = 0;
        int i = 0;
        while (i < moves.length()) {
            switch (moves.charAt(i)) {
                case 'L':
                    lr++;
                    break;
                case 'R':
                    lr--;
                    break;
                case 'U':
                    ud++;
                    break;
                case 'D':
                    ud--;
                    break;
            }
            i++;
        }
        return lr == 0 && ud == 0;

    }


    public static boolean judgeCircleStack(String moves) {
        int i = 0;
        Stack<Character> stack = new Stack<>();
        while (i < moves.length()) {
            char c = moves.charAt(i);
            if (stack.isEmpty()) {
                stack.push(moves.charAt(i));
            } else if (stack.peek() == 'U' && c == 'D') {
                stack.pop();
            } else if (stack.peek() == 'D' && c == 'U') {
                stack.pop();
            } else if (stack.peek() == 'L' && c == 'R') {
                stack.pop();
            } else if (stack.peek() == 'R' && c == 'L') {
                stack.pop();
            } else {
                stack.push(c);
            }

            i++;
        }
        return stack.isEmpty();

    }


}
