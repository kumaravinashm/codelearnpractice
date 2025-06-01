package prep2025.string;

import java.util.Arrays;

public class ReverseStringII {
    public static void main(String[] args) {
        String s= "abcdefg";
        int k=8;
        System.out.println(reverseStr(s,k));
    }

//Do IT AGAIN
//    Do IT AGAIN
//    Do IT AGAIN
//    Do IT AGAIN

    public static String reverseStr(String s, int k) {
        char[] string = s.toCharArray();
        if(s.length()<k) {
            String sub = "";
            for(char c:string){
                sub = c +sub;
            }
            return sub;
        }
        for(int i=0;i<s.length();i=i+2*k){
            reverse1(string,i,Math.min(i+k-1,s.length()-1));

        }
        return new String(string);
    }

    public static void reverse1(char[]string, int a, int b){
        while(a<b){
            char temp = string[a];
            string[a]=string[b];
            string[b]=temp;
            a++;
            b--;
        }
    }



}
