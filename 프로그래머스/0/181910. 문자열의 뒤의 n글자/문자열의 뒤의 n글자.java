class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder(my_string.substring(my_string.length() - n));
        return answer.toString();
    }
}