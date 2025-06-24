import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String my_string, String is_suffix) {
        Set<String> stringSet = new HashSet<>();
        int len = my_string.length();
        for (int i = 0; i < len; i++) {
            stringSet.add(my_string.substring(i, len));
        }
        if (stringSet.contains(is_suffix)) {
            return 1;
        } else {
            return 0;
        }
    }
}