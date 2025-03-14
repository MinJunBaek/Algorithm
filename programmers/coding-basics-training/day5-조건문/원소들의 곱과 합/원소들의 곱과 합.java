class Solution {
  public int solution(int[] num_list) {
    int multiplication = 1;
    int sum = 0;
    for (int num : num_list) {
      sum += num;
      multiplication *= num;
    }
    return multiplication > sum*sum ? 0 : 1;
  }
}