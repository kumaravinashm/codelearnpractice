package prep2025.array;

public class FlippingAnImage {

    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(flipAndInvertImage(image));


    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0;i<image[0].length;i++){
            reverseArray(image[i]);
        }

        for(int i = 0;i<image[0].length;i++){
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }else{
                    image[i][j]=0;
                }
            }
        }
        return image;

    }






    public static void reverseArray(int[] arr) {
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }


}
