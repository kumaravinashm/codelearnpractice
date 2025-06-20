package arrays;

//https://leetcode.com/problems/maximum-subarray/submissions/1017505819/
public class MaxProductSubarray {

    public static void main(String[] args) {
        int arr[] = {1, -2, -3, 0, 7, -8, -2};
        System.out.println(maxSubArrayProduct(arr));
    }

    static int maxSubArrayProduct(int arr[]) {
        int maximum = arr[0];
        int currentMaximum = arr[0];
        for(int i=1;i<arr.length;i++){
            currentMaximum = Math.max(arr[i],currentMaximum+arr[i]);
            maximum = Math.max(currentMaximum,maximum);
        }
        return maximum;
    }
}
