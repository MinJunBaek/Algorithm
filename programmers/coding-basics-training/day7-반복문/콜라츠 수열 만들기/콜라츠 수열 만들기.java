import java.util.ArrayList;
import java.util.List;

class Solution {
  public int[] solution(int n) {
    List<Integer> answer = new ArrayList<>();
    int number = n;

    while (number != 1) {
      answer.add(number);
      if (number % 2 == 0) {
        number /= 2;
      } else {
        number = 3 * number + 1;
      }
    }
    answer.add(1);
    return answer.stream().mapToInt(i -> i).toArray();
  }
}