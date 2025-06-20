package prep2025.string;

//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/?difficulty=EASY&page=1&topicSlugs=string
public class MaximumNumberWordsFoundSentences {
    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }


    public static int mostWordsFound(String[] sentences) {
        int n= 0;
        for(String s:sentences){
            n = Math.max(n,s.split(" ").length);
        }
        return n;

    }
}
