import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> numList = new ArrayList<>();
        for (String intStr : intStrs) {
            Integer intNumber = Integer.valueOf(intStr.substring(s, s+l));
            if(intNumber > k) {
                numList.add(intNumber);
            }
        }
        
        int[] answer = numList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}