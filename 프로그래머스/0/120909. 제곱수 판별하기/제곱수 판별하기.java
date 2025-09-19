class Solution {
    public int solution(int n) {
        double number = Math.sqrt(n);
        int answer = number % 1 == 0 ? 1 : 2;
        return answer;
    }
}