import java.util.regex.Pattern;

class Solution {
    public String solution(String myString) {
        String answer = myString.replaceAll("[a-k]", "l");
        return answer;
    }
}