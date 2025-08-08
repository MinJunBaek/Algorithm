import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> eligibleStudents = new ArrayList<>();
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {
                eligibleStudents.add(new int[]{rank[i], i});
            }
        }
        
        eligibleStudents.sort(Comparator.comparingInt(s -> s[0]));
        
        int a = eligibleStudents.get(0)[1];
        int b = eligibleStudents.get(1)[1];
        int c = eligibleStudents.get(2)[1];
        
        int answer = 10000 * a + 100 * b + c;
        return answer;
    }
}