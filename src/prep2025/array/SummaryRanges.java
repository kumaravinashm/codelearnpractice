package prep2025.array;


import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/summary-ranges/description/?difficulty=EASY&page=1&topicSlugs=string
public class SummaryRanges {

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));


    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= nums.length-1; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i]);
            int start = nums[i];
            while (i < nums.length - 1) {
                int currentElement = nums[i]+1;
                int nextElement = nums[i + 1];
                if(currentElement==nextElement) {
                    i++;
                }else{
                    break;
                }
            }
            if(start!=nums[i]) {
                sb.append("->");
                sb.append(nums[i]);
            }
            list.add(sb.toString());
        }
        return list;
    }
}
