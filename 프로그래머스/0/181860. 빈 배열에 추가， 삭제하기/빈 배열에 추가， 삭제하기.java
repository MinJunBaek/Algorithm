import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> arrList = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            int number = arr[i];
            if (flag[i]) {
                for (int j = 0; j < number * 2; j++) {
                    arrList.add(number);
                }
            } else {
                for (int j = 0; j < number; j++) {
                    arrList.remove(arrList.size()-1);
                }
            }
        }
        int[] answer = arrList.stream().mapToInt(Integer::valueOf).toArray();
        return answer;
    }
}