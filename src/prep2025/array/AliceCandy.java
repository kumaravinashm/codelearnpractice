package prep2025.array;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/distribute-candies/description/?difficulty=EASY&page=1&topicSlugs=string
public class AliceCandy {

    public static void main(String[] args) {
        int[] arr = {6, 6, 6, 6};
        System.out.println(distributeCandies(arr));
    }

    public static int distributeCandies(int[] candyType) {
        int max = candyType.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int i : candyType) {
            set.add(i);
        }
        if (max > set.size()) return set.size();
        else {
            return max;
        }
    }
}

