package prep2025.string;


//https://leetcode.com/problems/long-pressed-name/description/
public class LongPressedName {
    public static void main(String[] args) {
        String name = "pyplrz", typed = "ppyypllr";
        System.out.println(isLongPressedName(name, typed));
    }

    public static boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        if(name.length()>typed.length()) return false;
        while ( j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                j++;
                i++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i==name.length();

    }

}
