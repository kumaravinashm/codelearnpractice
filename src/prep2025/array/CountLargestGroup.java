package prep2025.array;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/count-largest-group/description/?envType=daily-question&envId=2025-04-23&difficulty=EASY&page=1&topicSlugs=string
public class CountLargestGroup {
    public static void main(String[] args) {
        int n=1786;
        System.out.println(countLargestGroup(n));
    }



    public static int countLargestGroup(int n) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int i=1;i<n+1;i++){
            int sum=0;
            int n1=i;
            while(n1!=0) {
                int last = n1 % 10;
                sum = sum + last;
                n1 = n1 / 10;
            }
            if(count.containsKey(sum)){
                count.put(sum,count.get(sum)+1);
            }else {
                count.put(sum,1);
            }
        }
        Integer maxValue = Collections.max(count.values());
        int count1 =0;
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            if(entry.getValue().equals(maxValue)) count1=count1+1;
        }
        return count1;
    }
}
