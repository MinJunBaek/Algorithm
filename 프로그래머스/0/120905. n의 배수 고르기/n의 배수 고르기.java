import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> addList = new ArrayList<>();
        for (int num : numlist) {
            if (num % n == 0) {
                addList.add(num);
            }
        }
        int[] answer = addList.stream().mapToInt(Integer::valueOf).toArray();
        return answer;
    }
}