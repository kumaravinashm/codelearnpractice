package prep2025.string;

//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/?difficulty=EASY&page=1&topicSlugs=string
public class FindFirstPalindromicStringintheArray {
    public static void main(String[] args) {
        String[] words = {"def","ghi"};
        System.out.println(firstPalindrome(words));

    }

    public static String firstPalindrome(String[] words) {
        for (String res:words){
            int i=0;
            int j=res.length()-1;
            boolean f = true;
            while(i<=j) {
                if(res.charAt(i) != res.charAt(j)) {
                    f= false;
                }
                i++;
                j--;
            }
            if(f)return res;
        }
        return "";
    }
}
