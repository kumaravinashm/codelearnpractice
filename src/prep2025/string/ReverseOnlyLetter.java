package prep2025.string;


//https://leetcode.com/problems/reverse-only-letters/description/?difficulty=EASY&page=1&topicSlugs=string
public class ReverseOnlyLetter {

    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));

    }

    public static String reverseOnlyLetters(String s) {
        char[] c= new char[s.length()];
        int i=0,j= s.length()-1;

        while(i<=j){
            if(Character.isAlphabetic(s.charAt(i)) && Character.isAlphabetic(s.charAt(j))){
                c[i] = s.charAt(j);
                c[j] = s.charAt(i);
                i++;
                j--;
            }
            else if (!Character.isAlphabetic(s.charAt(j))){
                c[j] = s.charAt(j);
                j--;
            }
            else if (!Character.isAlphabetic(s.charAt(i))){
                c[i] = s.charAt(i);
                i++;
            }
        }
        return new String(c);
    }
}
