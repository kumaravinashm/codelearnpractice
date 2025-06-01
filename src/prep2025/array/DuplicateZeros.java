package prep2025.array;


//https://leetcode.com/problems/duplicate-zeros/description/?difficulty=EASY&page=1&topicSlugs=string
public class DuplicateZeros {

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0};
        duplicateZeros(arr);
    }



    public static void duplicateZeros(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                for(int j=arr.length-1;j>i;j--){
                    arr[j]=arr[j-1];
                }
                arr[i+1]=0;
                i++;
            }
        }
    }
}



