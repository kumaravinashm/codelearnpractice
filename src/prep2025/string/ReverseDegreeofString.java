package prep2025.string;



//https://leetcode.com/problems/reverse-degree-of-a-string/?difficulty=EASY&page=1&topicSlugs=string
public class ReverseDegreeofString {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(reverseDegree(s));
        System.out.println(withoutreverseDegree(s));
    }

    public static int reverseDegree(String s) {
        int sum =0;
        for(int i=0;i<s.length();i++){
            sum = sum + (char)('z' - s.charAt(i) +1) * (i+1);
        }
        return sum;
    }

    public static int withoutreverseDegree(String s) {
        int sum =0;
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
            sum = sum + (char)(s.charAt(i) -'a' +1) * (i+1);
        }
        return sum;
    }
}
