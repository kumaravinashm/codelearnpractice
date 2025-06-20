package prep2025.string;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/?difficulty=EASY&page=1&topicSlugs=string
public class FindMaximumNumberofStringPairs {
    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz",};
        System.out.println(maximumNumberOfStringPairs(words));
    }



    public static int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();
        int count = 0;
        for(String s: words){
            String srev = String.valueOf(new StringBuilder(s).reverse());
            if(set.contains(srev)){
                set.remove(s);
                count++;
            }else{
                set.add(s);
            }
        }
        return count;

    }


}
