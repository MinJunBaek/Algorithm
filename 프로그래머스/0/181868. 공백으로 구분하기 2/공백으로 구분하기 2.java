class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.strip().replaceAll("\\s+", " ").split(" ");;
        return answer;
    }
}