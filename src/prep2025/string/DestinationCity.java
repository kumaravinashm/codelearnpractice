package prep2025.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/destination-city/description/?difficulty=EASY&page=1&topicSlugs=string
public class DestinationCity {

    public static void main(String[] args) {
        List<List<String>> paths = Arrays.asList(
                Arrays.asList("pYyNGfBYbm", "wxAscRuzOl"),
                Arrays.asList("kzwEQHfwce", "pYyNGfBYbm")
        );

        System.out.println(destCity(paths));
    }

    public static String destCity(List<List<String>> paths) {
//        String dest = "";
//        for(int i=0;i<paths.size();i++){
//            for(int j=0;j<paths.size();j++){
//                if(j!=i){
//                    if(paths.get(i).get(1) == paths.get(j).get(0)){
//                        break;
//                    }
//                }
//                dest = paths.get(i).get(1);
//            }
//        }

        List<String> start = new ArrayList<>();
        for (List<String> path : paths) {
            start.add(path.get(0));
        }
        for (List<String> path : paths) {
            if (!start.contains(path.get(1))) return path.get(1);
        }


        return null;
    }

}
