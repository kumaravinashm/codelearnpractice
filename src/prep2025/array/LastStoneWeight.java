package prep2025.array;

import java.util.Arrays;



//https://leetcode.com/problems/last-stone-weight/description/
public class LastStoneWeight {

    public static void main(String[] args) {
        int[] stones = {1};
        System.out.println(lastStoneWeight(stones));


    }

    public static int lastStoneWeight(int[] stones) {
        while (stones.length>1){
            Arrays.sort(stones);
            if(stones[stones.length-1]==stones[stones.length-2]){
                stones = Arrays.copyOfRange(stones,0,stones.length-2);
            }else {
                stones[stones.length-2] = stones[stones.length-1]-stones[stones.length-2];
                stones = Arrays.copyOfRange(stones,0,stones.length-1);
            }
        }
        return stones.length==1 ? stones[0]:0;

    }
}
