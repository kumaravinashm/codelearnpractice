package prep2025.string;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/?difficulty=EASY&page=1&topicSlugs=string
public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));


    }

    public static String reverseWords(String s) {
        StringBuilder sb1 = new StringBuilder();
        for(String s1:s.split(" ")){
            StringBuilder sb = new StringBuilder(s1);
            sb.reverse();
            sb1.append(sb).append(" ");
        }
        return sb1.toString().trim();
    }
}
