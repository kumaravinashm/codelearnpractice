package prep2025.string;

//https://leetcode.com/problems/maximum-score-after-splitting-a-string/description/
public class MaximumScoreAfterSplittingString {
    public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore(s));
    }

    public static int maxScore(String s) {
        int max=Integer.MIN_VALUE;
        int temp=Integer.MIN_VALUE;
        for(int i=1;i<s.length();i++){
            temp = Math.max(sum(s.substring(0,i)),sum(s.substring(i+1,s.length())));
            max = Math.max(max,temp);
        }
        return max;


    }

    public static int sum(String n){
        int sum=0;
        for (int i = 0; i < n.length(); i++) {
            if (Character.isDigit(n.charAt(i))) {
                sum += Character.getNumericValue(n.charAt(i));
            }
        }
        return sum;
    }
}
