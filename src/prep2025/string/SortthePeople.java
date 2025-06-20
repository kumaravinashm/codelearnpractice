package prep2025.string;

import java.util.*;

//https://leetcode.com/problems/sort-the-people/description/?difficulty=EASY&page=1&topicSlugs=string
public class SortthePeople {

    public static void main(String[] args) {
        String[] names = {"Alice","Bob","Bob"};int[] heights = {155,185,150};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
        List<String> words = new ArrayList<>();
        words.add("one.two.three");
        words.add("four.five");
        words.add("six");
        char separator = '.';
        System.out.println(splitWordsBySeparator(words,separator));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String > map = new TreeMap<>();
        for(int i=0;i<heights.length;i++){
                map.put(heights[i],names[i]);
        }
        int n=0;
        for (Map.Entry<Integer,String> i : map.descendingMap().entrySet()){
            names[n] = i.getValue();
            n++;
        }
        return names;
    }


    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(String s:words){
            for(char c:s.toCharArray()){
                if(c==separator){
                    if(!sb.isEmpty()){
                        res.add(sb.toString());
                        sb.setLength(0);
                    }
                }else {
                    sb.append(c);
                }
            } if(!sb.isEmpty()){
                res.add(sb.toString());
                sb.setLength(0);
            }
        }
        return res;

    }
}
