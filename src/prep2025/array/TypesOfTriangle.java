package prep2025.array;

public class TypesOfTriangle {
    public static void main(String[] args) {
        int[] n = {2, 2, 3};
        System.out.println(triangleType(n));

    }

    public static String triangleType(int[] nums) {
        int a = nums[0], b = nums[1], c = nums[2];
        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && c == b) {
                return "equilateral";
            } else if (a == b || c == b || c == a) {
                return "isosceles";
            } else if (c != b && c != a) {
                return "scalene";
            }
        }
        return "none";
    }
}
