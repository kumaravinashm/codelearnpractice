package prep2025.array;


//https://leetcode.com/problems/valid-mountain-array/description/?difficulty=EASY&page=1&topicSlugs=string
public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(validMountainArray(arr));

    }


    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        int i = 0;
        while(i< arr.length-1 && arr[i]<arr[i+1] ){
            i++;
        }
        if(i==0||i==arr.length-1) return false;

        while(i< arr.length-1 && arr[i]>arr[i+1]){
            i++;
        }
        return i==arr.length-1;

    }


}
