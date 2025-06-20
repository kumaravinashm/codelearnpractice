package prep2025.string;

//https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/description/?difficulty=EASY&page=1&topicSlugs=string
public class CheckifNumbersAreAscendinginSentence {
    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green12 and 12 yellow marbles";
        System.out.println(areNumbersAscending(s));
    }

    public static boolean areNumbersAscending(String s) {
        StringBuilder sb = new StringBuilder();
        int min = Integer.MIN_VALUE;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            } else if (sb.length() > 0) {
                num = Integer.parseInt(sb.toString());
                if (num > min) {
                    min = num;
                    sb.setLength(0);
                } else {
                    return false;
                }
            }
        }
        if (!sb.isEmpty()) {
            return Integer.parseInt(sb.toString()) > min;
        }
        return true;
    }

}

