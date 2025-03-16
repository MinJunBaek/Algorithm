import java.util.Arrays;

class Solution {
  public int[] solution(int[] arr, int[][] queries) {
    int[] answer = new int[queries.length];
    int idx = 0;

    for (int[] query : queries) {
      int[] copyArray = Arrays.copyOfRange(arr, query[0], query[1] + 1);
      int k = query[2];

      answer[idx++] = Arrays.stream(copyArray)
          .filter(value -> k < value)
          .min()
          .orElse(-1);
    }
    return answer;
  }
}