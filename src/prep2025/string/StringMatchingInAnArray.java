package prep2025.string;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/string-matching-in-an-array/description/?difficulty=EASY&page=1&topicSlugs=string
public class StringMatchingInAnArray {

    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        System.out.println(stringMatching1(words));
    }

    public static List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int c = 0;
            for(int j=0;j<words.length;j++){
                if(words[j].contains(words[i])) c++;
            }
            if (c>1) list.add(words[i]);
        }
        return list;
    }


    public static List<String> stringMatching1(String[] words) {
        List<String> list = new ArrayList<>();
        String str = String.join(" ", words);
        for(int i = 0; i < words.length; i++){
            if(str.indexOf(words[i]) != str.lastIndexOf(words[i])){
                list.add(words[i]);
            }
        }
        return list;
    }
}
