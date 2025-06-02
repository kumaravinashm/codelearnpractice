package prep2025.string;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/uncommon-words-from-two-sentences/description/?difficulty=EASY&page=1&topicSlugs=string
public class UncommonWordsfromTwoSentences {
    public static void main(String[] args) {
        String s1 = "this apple is sweet", s2 = "this apple is sour";
        System.out.println(uncommonFromSentences(s1,s2));

    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : s1.split("\\s+")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : s2.split("\\s+")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> m:map.entrySet()){
            if(m.getValue()==1) list.add(m.getKey());
        }
        return list.toArray(new String[list.size()]);
    }

}
