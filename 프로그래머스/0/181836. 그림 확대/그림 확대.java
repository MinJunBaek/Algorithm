import java.lang.StringBuilder;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int index = 0;

        for (int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            String str = picture[i];
            
            for (int j = 0; j < str.length(); j++) {
                sb.append(String.valueOf(str.charAt(j)).repeat(k));
            }
            
            for (int count = 0; count < k; count++) {
                answer[index++] = sb.toString();
            }
        }
        return answer;
    }
}