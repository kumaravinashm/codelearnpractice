package prep2025.array;

import java.util.HashSet;
import java.util.Set;

public class MInOperationRequiredForDistinctArray {//Easy

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,3,5,7};
//        int[] arr = {4,5,6,4,4,1,1,1,6};
        System.out.println(minimumOperations(arr));

    }

    public static int minOperationForDistinctArray(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i = arr.length-1; i>=0; i--){
            if(set.contains(arr[i])){
                return i/3+1;
            }else{
                set.add(arr[i]);
            }
        }
        return 0;
    }


    public static int minimumOperations(int[] nums) {

        int min = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums.length == 0) return min;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    min++;
                    i = min*3 - 1;
                    break;
                }

            }

        }

        return min;

    }


}
