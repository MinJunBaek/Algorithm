class Solution {
  public int solution(int a, int d, boolean[] included) {
    int answer = a;
    int result = 0;
    for (int i = 0; i < included.length; i++) {
      if (included[i]) {
        result += answer;
      }
      answer += d;
    }
    return result;
  }
}