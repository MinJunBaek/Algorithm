class Solution {
    public int solution(String myString, String pat) {
        String str = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        int answer = str.contains(pat) ? 1 : 0;
        return answer;
    }
}