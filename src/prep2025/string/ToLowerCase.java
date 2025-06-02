package prep2025.string;


//https://leetcode.com/problems/to-lower-case/description/?difficulty=EASY&page=1&topicSlugs=string
public class ToLowerCase {
    public static void main(String[] args) {
        String s = "HelloW";
        System.out.println(toLowerCase(s));
    }

    public static String toLowerCase(String s) {
        String s1 = "";
        for(char c:s.toCharArray()){
            if(c>= 65 && c <= 90){
                c = (char) (c+32);
            }
            s1 = s1+c;
        }
        return s1;
    }

}
