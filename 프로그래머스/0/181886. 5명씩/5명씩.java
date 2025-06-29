import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        List<String> nameList = new ArrayList<>();
        
        for(int i = 0; i < names.length; i+=5) {
            nameList.add(names[i]);
        }
        String[] answer = nameList.toArray(new String[nameList.size()]);
        return answer;
    }
}