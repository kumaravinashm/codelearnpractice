package prep2025.string;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/?difficulty=EASY&page=1&topicSlugs=string
public class CheckiftheSentenceIsPangram {

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsovertheldzydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        if(sentence.length()>=25) {
            for (int i = 0; i < sentence.length(); i++) {
                arr[sentence.charAt(i) - 'a']++;
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) return false;
            }
            return true;
        } else return false;
    }
}
