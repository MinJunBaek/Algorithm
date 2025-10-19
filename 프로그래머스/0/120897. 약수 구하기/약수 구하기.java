import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                numList.add(i);
            }
        }
        int[] answer = numList.stream().mapToInt(Integer::valueOf).toArray();
        return answer;
    }
}