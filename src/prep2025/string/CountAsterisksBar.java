package prep2025.string;


//https://leetcode.com/problems/count-asterisks/description/?difficulty=EASY&page=1&topicSlugs=string
public class CountAsterisksBar {
    public static void main(String[] args) {
        String s = "yo|uar|e**|b|e***au|tifu|l";
        System.out.println(countAsterisks(s));
    }

    public static int countAsterisks(String s) {
        int ascount = 0;
        int bar = 0;
        for (final char c : s.toCharArray()) {
            if (c == '|') {
                bar++;
            } else if (c == '*' && bar % 2 == 0) {
                ascount++;
            }
        }
        return ascount;
    }
}
