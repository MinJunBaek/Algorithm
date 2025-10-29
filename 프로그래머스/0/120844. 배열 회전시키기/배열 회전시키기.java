import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> numList = new ArrayList<>();
        for (int number : numbers) {
            numList.add(number);
        }
        
        Collections.rotate(numList, direction.equals("right") ? 1 : -1);
        
        int[] answer = numList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}