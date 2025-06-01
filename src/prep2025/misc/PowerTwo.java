package prep2025.misc;

public class PowerTwo {
    public static void main(String[] args) {
        long n = 16;
        System.out.println(isPowerOfTwo(n));
    }


    public static boolean isPowerOfTwo(long n) {
        if(n==1) return true;
        double res=n;
        while(res>1){
            res = res/2;
        }
        if(res==1){
            return true;
        }
        return false;
    }
}
