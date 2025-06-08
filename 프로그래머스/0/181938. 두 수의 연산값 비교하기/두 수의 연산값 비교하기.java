class Solution {
    public int solution(int a, int b) {
        int diffA = Integer.parseInt("" + a + b);
        int diffB = 2 * a * b;
        int answer = Integer.max(diffA, diffB);
        return answer;
    }
}