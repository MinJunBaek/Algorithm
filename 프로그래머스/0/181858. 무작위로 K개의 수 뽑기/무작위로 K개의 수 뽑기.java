import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        List<Integer> arrList = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!arrList.contains(arr[i])) {
                arrList.add(arr[i]);
            }
            if (arrList.size() == k) {
                break;
            }
        }
        
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}