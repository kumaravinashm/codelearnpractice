package prep2025.array;

public class CountSymmetricIntegers {
    public static void main(String[] args) {
        int a =1200,b= 1230;
        System.out.println(countSymmetricIntegers1(a,b));
    }

    private static int countSymmetricIntegers(int a, int b) {
        String val = "";
        int count = 0;
        for(int i=a;i<=b;i++){
            val = String.valueOf(i);
            if(val.length()%2==0){
                if(sumFromString(val.substring(0,val.length()/2))==sumFromString(val.substring((val.length()/2),val.length()))){
                    count++;
                }
            }
        }
        return count;
    }


    static int sumFromString(String s){
        int sum = 0;
        for(int i = 0; i < s.length() ; i++){
            if( Character.isDigit(s.charAt(i)) ){
                sum = sum + Character.getNumericValue(s.charAt(i));
            }
        }
        return sum;
    }

    public static int countSymmetricIntegers1(int low, int high) {
        int ans = 0;

        for (int num = low; num <= high; ++num)
            if (checksymmetry(num))
                ++ans;

        return ans;
    }

    public static boolean checksymmetry(int num) {
        if (num >= 10 && num <= 99)
            return num / 10 == num % 10;
        if (num >= 1000 && num <= 9999) {
            final int first = num / 100;
            final int last = num % 100;
            return first / 10 + first % 10 == last / 10 + last % 10;
        }
        return false;
    }
}
