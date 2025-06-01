package prep2025.string;

//https://leetcode.com/problems/valid-word/description/?difficulty=EASY&page=1&topicSlugs=string
public class ValidWord {
    public static void main(String[] args) {
        String s = "aya";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String word) {
        boolean flag = false;
        int b = 0, c1 = 0;
        if (word.length() >= 3) {
            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    flag = true;
                } else if (isVowel(c)) {
                    flag = true;
                    b++;
                } else if (isConsonant(c)) {
                    flag = true;
                    c1++;
                } else {
                    return false;
                }
            }
            if (b > 0 && c1 > 0 && flag) {
                return true;
            }
        }
        return false;

    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static boolean isConsonant(char ch) {
        return Character.isLetter(ch) && !isVowel(ch);
    }
}
