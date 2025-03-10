class Solution {
  public int solution(int a, int b) {
    int diffA = Integer.parseInt(Integer.toString(a).concat(Integer.toString(b)));
    int diffB = 2 * a * b;
    return Math.max(diffA, diffB);
  }
}