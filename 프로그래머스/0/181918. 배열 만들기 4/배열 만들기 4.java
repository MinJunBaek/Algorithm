import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> listArray = new ArrayList<>();
        int i = 0;
        
        while (i < arr.length) {
            if(listArray.isEmpty()) {
                listArray.add(arr[i++]);
            } else if (listArray.get(listArray.size() - 1) < arr[i]) {
                listArray.add(arr[i++]);
            } else {
                listArray.remove(listArray.size() - 1);
            }
        }
        
        int[] stk = listArray.stream().mapToInt(Integer::intValue).toArray();
        
        return stk;
    }
}