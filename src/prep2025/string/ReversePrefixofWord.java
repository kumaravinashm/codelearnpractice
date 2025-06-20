package prep2025.string;

//https://leetcode.com/problems/reverse-prefix-of-word/description/?difficulty=EASY&page=1&topicSlugs=string
public class ReversePrefixofWord {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word,ch));
    }

    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        StringBuilder sb  = new StringBuilder();
        for(int i=index;i>=0;i--){
            sb.append(word.charAt(i));
        }
        return sb.toString()+word.substring(index+1);

    }
}
