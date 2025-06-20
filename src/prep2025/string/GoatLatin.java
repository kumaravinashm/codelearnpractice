package prep2025.string;

//https://leetcode.com/problems/goat-latin/description/?difficulty=EASY&page=1&topicSlugs=string
public class GoatLatin {
    public static void main(String[] args) {
        String sentence = "I speak Goat Latin";
        System.out.println(toGoatLatin(sentence));
    }

    public static String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] s = sentence.split(" ");
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < s.length; i++) {
            String word =  s[i];
            if (vowels.indexOf(s[i].charAt(0)) != -1) {
                word+="ma";
            } else {
                word = word.substring(1) + word.charAt(0) + "ma";
            }
            word+= "a".repeat(1 + i);
            sb.append(word).append(" ");
        }
        return sb.toString().trim();

    }
}
