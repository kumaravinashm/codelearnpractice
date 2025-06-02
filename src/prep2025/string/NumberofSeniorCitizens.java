package prep2025.string;


//https://leetcode.com/problems/number-of-senior-citizens/description/?difficulty=EASY&page=1&topicSlugs=string
public class NumberofSeniorCitizens {

    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F6411","9273338290F4010"};
        System.out.println(countSeniors(details));

    }

    public static int countSeniors(String[] details) {
        int count = 0;
        for(String s:details){
            if(( s.charAt(11))>'6' || (s.charAt(11)=='6' && s.charAt(12)>'0'))  count=count+1 ;
        }
        return count;

    }
}
