class Solution {
    public String solution(String my_string) {
        String chrRemove = "[aeiou]";
        String answer = my_string.replaceAll(chrRemove, "");
        return answer;
    }
}