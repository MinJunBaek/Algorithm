class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        
        int len = my_string.length();
        
        char[][] charArrays = new char[len/m][m];
        
        for (int i = 0; i < len; i+=m) {
            for (int j = 0; j < m; j++) {
                charArrays[i/m][j] = my_string.charAt(i + j);
            }
        }
        
        for (int i = 0; i < charArrays.length; i++) {
            sb.append(charArrays[i][c-1]);
        }
        
        String answer = sb.toString();
        return answer;
    }
}