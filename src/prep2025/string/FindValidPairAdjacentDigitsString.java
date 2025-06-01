package prep2025.string;


import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/find-valid-pair-of-adjacent-digits-in-string/
public class FindValidPairAdjacentDigitsString {
    public static void main(String[] args) {
        String s = "2233354444";
        System.out.println(findValidPair(s));
    }



    public static String findValidPair(String s) {
        Map<Integer,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            int n=Integer.parseInt(c+"");
            if(map.containsKey(n)) map.put(n,map.get(n)+1);
            else {
                map.put(n,1);
            }
        }
        StringBuilder stringBuilser = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int n=Integer.parseInt(s.charAt(i)+"");
            if(map.get(n)==n){
                stringBuilser.append(map.get(n));
            }else{
                stringBuilser.delete(0,stringBuilser.length());
            }
            if(stringBuilser.length()==2){
                if(stringBuilser.toString().equals(stringBuilser.reverse().toString())){
                    stringBuilser.delete(0,1);
                }
                else return stringBuilser.reverse().toString();
            }
        }
        return "";
    }
}
