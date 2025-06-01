package prep2025.array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.println(getRow(1));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        inner.add(1);
        result.add(inner);
        if(numRows==1) return result ;
        for(int i=1;i<numRows;i++){
            List<Integer> inner1 = new ArrayList<>();
            List<Integer> prev = result.get(i-1);
            inner1.add(1);
            for(int j=0;j<i-1;j++){
                inner1.add(prev.get(j)+prev.get(j+1));
            }
            inner1.add(1);
            result.add(inner1);
        }
        return result;
    }


    public static List<Integer> getRow(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        inner.add(1);
        result.add(inner);
        if(numRows==0) return inner ;
        for(int i=1;i<numRows+1;i++){
            List<Integer> inner1 = new ArrayList<>();
            List<Integer> prev = result.get(i-1);
            inner1.add(1);
            for(int j=0;j<i-1;j++){
                inner1.add(prev.get(j)+prev.get(j+1));
            }
            inner1.add(1);
            result.add(inner1);
        }
        return result.get(result.size()-1);
    }
}
