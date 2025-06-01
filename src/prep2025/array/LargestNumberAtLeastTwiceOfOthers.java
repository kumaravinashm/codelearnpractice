package prep2025.array;

//https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/?difficulty=EASY&page=1&topicSlugs=string
public interface LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
        System.out.println(dominantIndex(nums));


    }

    public static int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int ind = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
                ind = i;
            }
        }
        int by = max/2;
        for(int i=0;i<n;i++){
            if(nums[i]==max)
            {
                continue;
            }
            if(nums[i]>by){
                return -1;
            }
        }
        return ind;
    }

}
