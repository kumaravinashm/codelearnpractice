package prep2025.array;


//https://leetcode.com/problems/set-mismatch/description/?difficulty=EASY&page=1&topicSlugs=string
public class SetMismatch {
    public static void main(String[] args) {
        int[] n = {1,1};
        int[] b = findErrorNums(n);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }


    public static int[] findErrorNums(int[] nums) {
        boolean[] status = new boolean[nums.length];
        int duplicate = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(status[nums[i]-1]) {
                duplicate = nums[i];
            } else {
                status[nums[i]-1] = true;
            }
        }

        int missing = 0;
        for(int i = 0 ; i < status.length; i++) {
            if(!status[i])
                missing = i;
        }

        return new int[]{duplicate, missing+1};
    }

}
