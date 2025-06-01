package prep2025.array;


//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?difficulty=EASY&page=1&topicSlugs=string
public class EvenNumberDigits {


    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));

    }


    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int i : nums) {
            int count = 0;
            while (i > 0) {
                i = i / 10;
                count = count + 1;
            }
            if (count % 2 == 0) {
                result = result + 1;
            }
        }
        return result;

    }
}
