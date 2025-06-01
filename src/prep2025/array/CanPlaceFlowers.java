package prep2025.array;


//https://leetcode.com/problems/can-place-flowers/description/?difficulty=EASY&page=1&topicSlugs=string
public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {0};
        int n = 1;
        System.out.println(canPlaceFlowers1(flowerbed, n));
    }


    public static boolean canPlaceFlowers1(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeftPlot = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRightPlot = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                if (emptyLeftPlot && emptyRightPlot) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }
}
