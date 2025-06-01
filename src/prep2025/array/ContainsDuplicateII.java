package prep2025.array;


//https://leetcode.com/problems/contains-duplicate-ii/description/?difficulty=EASY&page=1&topicSlugs=string
public class ContainsDuplicateII {

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1;  j <= i + k && j < nums.length; j++) {
                if (nums[i] == nums[j] ) {
                    return true;

                }
            }
        }
        return false;
    }
}
