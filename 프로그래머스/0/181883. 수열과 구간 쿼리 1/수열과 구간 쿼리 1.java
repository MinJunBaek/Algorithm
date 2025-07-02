import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        
        for(int[] query : queries) {
            for (int start = query[0], end = query[1] + 1; start < end; start++) {
                answer[start] += 1;
            }
        }
        return answer;
    }
}