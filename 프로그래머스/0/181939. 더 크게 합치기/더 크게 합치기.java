class Solution {
    public int solution(int a, int b) {
        int diffA = Integer.parseInt(Integer.toString(a).concat(Integer.toString(b)));
        int diffB = Integer.parseInt(Integer.toString(b).concat(Integer.toString(a)));
        int answer = Integer.max(diffA, diffB);
        return answer;
    }
}