package prep2025.string;

//521
public class LongestUncommonSubsequence {
    public static void main(String[] args) {
        String a  = "aba";String b="qwd";
        System.out.println(lcs(a,b));
    }

    private static int lcs(String a, String b) {
        if(a.equals(b)) return -1;
        return Math.max(a.length(),b.length());

    }
}
