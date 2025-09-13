import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        Set<String> strSet = new HashSet<>(Arrays.asList(s1));
        for (String s : s2) {
            if (strSet.contains(s)) {
                answer++;
            }
        }
        return answer;
    }
}