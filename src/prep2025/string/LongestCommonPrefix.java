package prep2025.string;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] arr = {"flower", "flower", "flght"};
        System.out.println(longestCommonPrefix(arr));
    }


    static String getPrefix1(String[] arr) {
       int minLength = arr[0].length();
        for (String s : arr) {
            if (s.length() < minLength) minLength = s.length();
        }
       char temp;
       String res="";
       for(int i=0;i<minLength;i++){
           temp = arr[0].charAt(i);
           for(int j=1;j<arr.length;j++){
               if(arr[j].charAt(i)!=temp){
                   if(res.length()>0){
                       return res;
                   }else return "-1";
               }
           }res=res+temp;
       }return res;
    }

    static int findMinimumLengthOfString1(String arr[], int n) {
        int min = arr[0].length();
        for (String s : arr) {
            if (s.length() < min) min = s.length();
        }
        return min;
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        if (strs.length == 1)
            return strs[0];
        String result = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(result) != 0){
                result = result.substring(0, result.length()-1);
                if(result.isEmpty()){
                    return "";
                }
            }
        }
        return result;



    }


}
