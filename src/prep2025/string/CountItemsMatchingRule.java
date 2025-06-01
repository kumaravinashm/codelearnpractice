package prep2025.string;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>() {{
            add("phone");
            add("blue");
            add("pixel");
        }};
        List<String> list2 = new ArrayList<>() {{
            add("computer");
            add("silver");
            add("lenovo");
        }};
        List<List<String>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        String a="color",b="silver";
        System.out.println(countMatches(list,a,b));
    }


    public  static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int count = 0;
        for(List l:items){
            switch (ruleKey){
                case "color":
                    if(l.get(1).equals(ruleValue)) count++;
                    break;
                case "type":
                    if(l.get(0).equals(ruleValue)) count++;
                    break;
                case "name":
                    if(l.get(2).equals(ruleValue)) count++;
                    break;
            }
        }
        return count;

    }
}
