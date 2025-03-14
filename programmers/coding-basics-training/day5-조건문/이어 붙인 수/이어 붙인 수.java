class Solution {
  public int solution(int[] num_list) {
    StringBuilder strOdd = new StringBuilder();
    StringBuilder strEven = new StringBuilder();

    for (int i = 0; i < num_list.length; i++) {
      if (num_list[i] % 2 == 0) {
        strEven.append(num_list[i]);
      } else {
        strOdd.append(num_list[i]);
      }
    }
    int answer = Integer.parseInt(strOdd.toString()) + Integer.parseInt(strEven.toString());
    return answer;
  }
}