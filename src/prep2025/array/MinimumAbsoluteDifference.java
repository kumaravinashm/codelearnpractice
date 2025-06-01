package prep2025.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/minimum-absolute-difference/description/?difficulty=EASY&page=1&topicSlugs=string
public class MinimumAbsoluteDifference {

    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        System.out.println(minimumAbsDifference(arr));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ret = new ArrayList<>();
        int diff = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            diff = Math.min(arr[i]-arr[i-1],diff);
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==diff){
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                ret.add(pair);
            }
        }
        return ret;
    }
}
