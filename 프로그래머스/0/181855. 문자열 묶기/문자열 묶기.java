import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> strMap = new HashMap<>();
        int size = 0;
        int answer = 0;
        
        for (String str : strArr) {
            size = str.length();
            strMap.put(size, strMap.getOrDefault(size, 0) + 1);
        }
        
        for (int number : strMap.values()) {
            if (answer < number) {
                answer = number;
            }
        }
        return answer;
    }
}