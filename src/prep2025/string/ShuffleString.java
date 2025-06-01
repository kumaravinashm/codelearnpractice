package prep2025.string;


//https://leetcode.com/problems/shuffle-string/description/?difficulty=EASY&page=1&topicSlugs=string
public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet"; int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));

    }

    public static String restoreString(String s, int[] indices) {
        char[] c = new char[s.length()];
        for(int i =0;i<s.length();i++){
            c[indices[i]] = s.charAt(i);
        }
        return new String(c);
    }
}
