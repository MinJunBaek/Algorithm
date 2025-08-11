import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        for (int num : delete_list) {
            arrList.remove(Integer.valueOf(num));
        }
        
        int[] answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}