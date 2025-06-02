package prep2025.string;


//https://leetcode.com/problems/permutation-difference-between-two-strings/description/?difficulty=EASY&page=1&topicSlugs=string
public class PermutationDifferencebetweenTwoStrings {

    public static void main(String[] args) {
        String s = "abcde", t = "edbac";
        System.out.println(findPermutationDifference(s, t));

    }


    public static int findPermutationDifference(String s, String t) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result+ Math.abs(i-t.indexOf(s.charAt(i)));
        }
        return result;
    }


}
