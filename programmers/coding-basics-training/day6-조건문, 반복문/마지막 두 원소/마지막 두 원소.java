import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
  public int[] solution(int[] num_list) {
    int[] check = {num_list[num_list.length-1] > num_list[num_list.length-2] ?
        num_list[num_list.length-1] - num_list[num_list.length-2] :
        num_list[num_list.length-1] * 2};
    int[] answer = IntStream.concat(Arrays.stream(num_list), Arrays.stream(check)).toArray();
    return answer;
  }
}