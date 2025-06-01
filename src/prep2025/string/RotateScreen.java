package prep2025.string;

public class RotateScreen {
    public static void main(String[] args) {
        String s1="abcde";
        String s2="cdeab";
        System.out.println(checkString(s1,s2));

    }

    private static boolean checkString(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        String sub=s2;
        int i=0;
        while (i<s2.length()){
            sub = sub.substring(1)+sub.charAt(0);
            i++;
            if(s1.equals(sub)) return true;
        }
        return false;
    }
}
