class Solution {
    public int solution(int n, int t) {
        int answer = (int) Math.scalb((double) n, t);
        return answer;
    }
}