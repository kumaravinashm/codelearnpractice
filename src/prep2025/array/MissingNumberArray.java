package prep2025.array;

//https://leetcode.com/problems/missing-number/submissions/1646990399/?difficulty=EASY&page=1&topicSlugs=string
public class MissingNumberArray {
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));
    }


    public static int missingNumber(int[] nums) {
        int largest = nums.length;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
        }
        int actualSum = (largest*(largest+1))/2;
        return actualSum-sum;
    }
}
