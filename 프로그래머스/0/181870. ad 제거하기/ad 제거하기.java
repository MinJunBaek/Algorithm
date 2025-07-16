import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.contains("ad")) {
                continue;
            }
            strList.add(str);
        }
        String[] answer = strList.toArray(String[]::new);
        return answer;
    }
}