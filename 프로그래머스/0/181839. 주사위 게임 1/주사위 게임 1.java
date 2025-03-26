class Solution {
  public int solution(int a, int b) {
    boolean resultA = a % 2 == 1;
    boolean resultB = b % 2 == 1;

    if (resultA && resultB) {
      return (a * a) + (b * b);
    } else if (resultA || resultB) {
      return 2 * (a + b);
    } else {
      return Math.abs(a - b);
    }
  }
}