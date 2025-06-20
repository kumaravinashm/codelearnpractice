package prep2025.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//https://leetcode.com/problems/kth-distinct-string-in-an-array/?difficulty=EASY&page=1&topicSlugs=string
public class KthDistinctStringinArray {
    public static void main(String[] args) {
        String[] arr = {"a","b","a"}; int k = 3;
        System.out.println(kthDistinct(arr,k));

    }

    public static String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> set = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.containsKey(arr[i])) {
                set.put(arr[i], set.get(arr[i]) + 1);  // get current count and add 1
            } else {
                set.put(arr[i], 1);  // first occurrence, count = 1
            }
        }
        int i=0;
        for(String s:arr){
            if(set.get(s)==1){
                i++;
                if(i==k) return s;
            }
        }
        return "";
    }

}
