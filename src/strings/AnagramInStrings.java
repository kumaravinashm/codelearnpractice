package strings;

import java.util.ArrayList;
import java.util.List;

import static strings.AnagramStrings.*;

public class AnagramInStrings {

    public static void main(String[] args) {
        String s = "cbaebabacb", p = "abc";
        System.out.println(findAnagrams(s,p));
    }


    public static List<Integer> findAnagrams(String s, String p) {
        String temp = "";
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length()-p.length()+1;i++){
            temp = s.substring(i,i+p.length());
            if(AnagramStrings.checkAnagram(temp,temp.length(),p,p.length())){
                list.add(i);
            };
        }
        return list;
    }

}
