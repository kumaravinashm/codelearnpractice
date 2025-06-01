package prep2025.string;

import java.util.HashSet;
import java.util.Set;

public class DetermineStringHalvesAreAlike {

    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));

    }


    public static boolean halvesAreAlike(String s) {
//        Set<Character> set = new HashSet<>();
//        set.add('a');
//        set.add('e');
//        set.add('i');
//        set.add('o');
//        set.add('u');
//        set.add('A');
//        set.add('E');
//        set.add('I');
//        set.add('O');
//        set.add('U');
        String set = "aeiouAEIOU";
        int a = 0, b = 0;
        for (int j = 0, k = (s.length() / 2); (j < s.length() / 2 && k < s.length()); j++, k++) {
            if (set.contains(String.valueOf(s.charAt(j)))) a++;
            if (set.contains(String.valueOf(s.charAt(k)))) b++;
        }
        if (a == b) return true;

        return false;

    }
}
