package prep2025.array;

//https://leetcode.com/problems/number-of-good-pairs/description/?difficulty=EASY&page=1&topicSlugs=string
public class NumberGoodPairs {
    public static void main(String[] args) {
        int[] n= {1,2,3};
        System.out.println(numIdenticalPairs(n));

    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) count=count+1;
            }
        }

        return count;

    }
}
