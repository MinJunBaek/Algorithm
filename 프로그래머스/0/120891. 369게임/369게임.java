class Solution {
    public int solution(int order) {
        String str = String.valueOf(order);
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            int number = str.charAt(i) - '0';
            if (number != 0 && number % 3 == 0) {
                answer++;
            }
        }
        return answer;
    }
}