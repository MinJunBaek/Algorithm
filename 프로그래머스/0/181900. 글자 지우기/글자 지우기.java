import java.util.Set;
import java.util.HashSet;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Set<Integer> removeIndex = new HashSet<>();
        for (int index : indices) {
            removeIndex.add(index);
        }
        
        for (int i = 0; i < my_string.length(); i++) {
            if (!removeIndex.contains(i)) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}