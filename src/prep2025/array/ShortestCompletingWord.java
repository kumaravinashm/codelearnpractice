package prep2025.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {
    public static void main(String[] args) {
        String a="GrC8950";
        String[] b= {"measure","other","every","base","according","level","meeting","none","marriage","rest"};
        System.out.println(shortestCompletingWord(a,b));
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character,Integer> plateMap = new HashMap<>();
        for(char c:licensePlate.toLowerCase().toCharArray()){
            if(Character.isLetter(c)){
                if(plateMap.containsKey(c)){
                    plateMap.put(c,plateMap.get(c)+1);
                }else{
                    plateMap.put(c,1);
                }
            }
        }
        int min_length=16;
        String result=null;
        for(String s:words){
           if(matchChar(plateMap,s)){
               if(s.length()<min_length){
                   result=s;
                   min_length=s.length();
               }
           }
        }
        return result;
    }

    public static boolean matchChar(Map<Character,Integer> platemap, String word){
        HashMap<Character,Integer> wordMap = new HashMap<>();
        for(char c:word.toCharArray()){
            if(platemap.containsKey(c)){
                if(wordMap.containsKey(c)){
                    wordMap.put(c,wordMap.get(c)+1);
                }else{
                    wordMap.put(c,1);
                }
            }
        }
        for(Map.Entry<Character,Integer> map: platemap.entrySet()){
            if(!(wordMap.containsKey(map.getKey()) && wordMap.get(map.getKey())>=(map.getValue()))){
                return false;
            }
        }
        return true;


    }
}
