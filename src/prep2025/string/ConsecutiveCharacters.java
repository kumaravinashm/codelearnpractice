package prep2025.string;

//https://leetcode.com/problems/consecutive-characters/description/?difficulty=EASY&page=1&topicSlugs=string
public class ConsecutiveCharacters {


    public static void main(String[] args) {
        String s = "abbcccddddeeeeedcba";
        System.out.println(maxPower(s));
    }

    public static int maxPower(String s) {
        int max = 1, temp = 1;
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            if (c[i] == c[i + 1]) {
                temp++;
            }else{
                temp = 1;
            }
            max = Math.max(max,temp);
        }
        return max;

    }
}
