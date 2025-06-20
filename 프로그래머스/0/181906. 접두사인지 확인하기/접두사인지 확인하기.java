import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        List<String> prefixList = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            prefixList.add(my_string.substring(0, i));
        }
        if (prefixList.contains(is_prefix)) {
            return answer = 1;
        }
        return answer;
    }
}