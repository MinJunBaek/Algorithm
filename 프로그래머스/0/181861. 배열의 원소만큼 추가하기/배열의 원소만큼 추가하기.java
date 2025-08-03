import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> arrList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            int x = arr[i];
            for (int j = 0; j < x; j++) {
                arrList.add(x);
            }
        }
        int[] answer = arrList.stream().mapToInt(Integer::valueOf).toArray();
        return answer;
    }
}