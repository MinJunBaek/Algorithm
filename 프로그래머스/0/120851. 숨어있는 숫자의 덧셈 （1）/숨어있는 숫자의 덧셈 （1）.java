import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String my_string) {
        
        List<Integer> numbers = new ArrayList<>();
        
        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers.add(ch - '0');
            }
        }
        
        int answer = numbers.stream().mapToInt(Integer::valueOf).sum();
        return answer;
    }
}