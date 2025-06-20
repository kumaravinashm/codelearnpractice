package prep2025.string;

import java.util.ArrayList;
import java.util.List;

public class CheckifaStringIsanAcronymofWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("alice");
        words.add("bob");
        words.add("charlie");
        String s ="abc";
        System.out.println(isAcronym(words,s));

    }

    public static boolean isAcronym(List<String> words, String s) {
        if(words.size()==s.length()){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=words.get(i).charAt(0)) return false;
            }
        }else {
            return false;
        }
        return true;
    }
}
