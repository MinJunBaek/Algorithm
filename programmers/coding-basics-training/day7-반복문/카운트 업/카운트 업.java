import java.util.ArrayList;
import java.util.List;

class Solution {
  public int[] solution(int start_num, int end_num) {
    List<Integer> arrayList = new ArrayList();

    for (int i = start_num; i < end_num + 1; i++) {
      arrayList.add(i);
    }
    return arrayList.stream().mapToInt(Integer::intValue).toArray();
  }
}