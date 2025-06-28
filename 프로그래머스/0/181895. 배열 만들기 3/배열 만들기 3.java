import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> numList = new ArrayList<>();
        
        for(int[] interval : intervals) {
            int a = interval[0];
            int b = interval[1];
            
            for(int i = a; i <= b; i++) {
                numList.add(arr[i]);
            }
        }
        
        int[] answer = numList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}