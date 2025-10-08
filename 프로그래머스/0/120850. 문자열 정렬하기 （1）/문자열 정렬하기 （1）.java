import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> numList = new ArrayList<>();
        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                numList.add(ch - '0');
            }
        }
        int[] answer = numList.stream().mapToInt(Integer::valueOf).sorted().toArray();
        return answer;
    }
}