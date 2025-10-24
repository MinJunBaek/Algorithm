class Solution {
    public int solution(int n) {
        int count = 6;
        while (count % n != 0) {
            count += 6;
        }
        int answer = count / 6;
        return answer;
    }
}