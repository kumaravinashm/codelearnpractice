package strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        String s1="^ca",s2="^ac";
        System.out.println(checkAnagram(s1,s1.length(),s2,s2.length()));
    }

    static boolean checkAnagram(String s1,int n1,String s2,int n2){
        if(n1==n2) {
            int[] a = new int[256];
            int[] b = new int[256];
            char[] a1 = s1.toCharArray();
            char[] b1 = s2.toCharArray();
            for(int i=0;i<n1;i++){
                a[a1[i]]++;
                b[b1[i]]++;
            }
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]) {
                    return false;
                }
            }
            return true;
        }return false;
    }

}
