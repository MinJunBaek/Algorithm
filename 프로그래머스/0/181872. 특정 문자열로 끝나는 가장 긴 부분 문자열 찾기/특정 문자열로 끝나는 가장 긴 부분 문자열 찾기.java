class Solution {
    public String solution(String myString, String pat) {
        int index = myString.lastIndexOf(pat) + pat.length();
        String answer = myString.substring(0, index);
        return answer;
    }
}