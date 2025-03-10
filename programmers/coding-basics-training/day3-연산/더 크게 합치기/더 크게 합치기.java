class Solution {
  public int solution(int a, int b) {
    int diffA = Integer.parseInt(Integer.toString(a).concat(Integer.toString(b)));
    int diffB = Integer.parseInt(Integer.toString(b).concat(Integer.toString(a)));
    return Math.max(diffA, diffB);
  }
}