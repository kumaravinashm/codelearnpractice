package prep2025.string;

//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/?difficulty=EASY&page=1&topicSlugs=string
public class FinalValueofVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String[] operations = {"X++", "++X", "--X", "X--"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String s : operations) {
            if (s.contains("--")) res--;else
              res++;
        }
        return res;
    }


}
