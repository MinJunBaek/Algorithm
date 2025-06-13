import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int x = n;
        List<Integer> collatzSequence = new ArrayList<>();
        
        while (x != 1) {
            if (x % 2 == 0) {
                collatzSequence.add(x);
                x /= 2;
            } else {
                collatzSequence.add(x);
                x = 3 * x + 1;
            }
        }
        collatzSequence.add(x);
        int[] answer = collatzSequence.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}