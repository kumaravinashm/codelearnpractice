package prep2025.array;


import java.util.Stack;

//https://leetcode.com/problems/baseball-game/description/?difficulty=EASY&page=1&topicSlugs=string
public class BaseballGame {
    public static void main(String[] args) {
        String[] s={"5","2","C","D","+"};
        System.out.println(calPoints(s));


    }


    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int n = 0,o;
        for(String s:operations){
            if(!s.equals("+") && !s.equals("D") && !s.equals("C")){
                stack.add(Integer.parseInt(s));
            }
            if(s.equals("C") && !stack.isEmpty()){
                stack.pop();
            }
            if(s.equals("D") && !stack.isEmpty()){
                n= stack.peek();
                n=n*2;
                stack.add(n);
            }
            if(s.equals("+") && stack.size()>1){
                n = stack.peek();
                o = stack.get(stack.size() - 2);
                stack.add(n+o);
            }
        }
        n=0;
        for(Integer b: stack){
            n=n+b;
        }
        return n;


    }
}
