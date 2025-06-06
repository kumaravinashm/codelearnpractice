package prep2025.string;

import java.util.HashMap;

//https://leetcode.com/problems/slowest-key/?difficulty=EASY&page=1&topicSlugs=string
public class SlowestKey {

    public static void main(String[] args) {
        int[] releaseTimes = {23,34,43,59,62,80,83,92,97};
        String keysPressed = "qgkzzihfc";
        System.out.println(slowestKey(releaseTimes, keysPressed));
    }

    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int max=0;
        char res = 0;
        for (int i = 0; i < releaseTimes.length; i++) {
            char c = keysPressed.charAt(i);
            int duration = 0;
            if (i == 0) {
                duration = releaseTimes[i];
            } else duration = releaseTimes[i] - releaseTimes[i - 1];
            if(max==duration) {
                res = (c > res) ? c : res;
            }else if (max<duration) res=c;
            max = Math.max(duration, max);
        }
        return res;
    }
}
