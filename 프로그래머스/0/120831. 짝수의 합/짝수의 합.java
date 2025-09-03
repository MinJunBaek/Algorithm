class Solution {
    public int solution(int n) {
        int answer = 0;
        int number = n % 2 == 0 ? n : n-1;
        for (int i = number; i >= 2; i-=2) {
            answer += i;
        }
        return answer;
    }
}