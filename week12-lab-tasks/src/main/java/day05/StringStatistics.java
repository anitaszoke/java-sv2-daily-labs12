package day05;

import java.util.HashMap;
import java.util.Map;

public class StringStatistics {

    public Map<String,Integer> getCharacter(String s) {
        Map<String,Integer> result = new HashMap<>();
        String sC = "";
        for (Character c : s.toCharArray()){
            if(!result.containsKey(c.toString())) {
                sC = c.toString();
                result.put(sC, 0);
            }

            result.put(c.toString(), result.get(sC) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        StringStatistics stringStatistics = new StringStatistics();
        System.out.println(stringStatistics.getCharacter("alma"));
    }
}
