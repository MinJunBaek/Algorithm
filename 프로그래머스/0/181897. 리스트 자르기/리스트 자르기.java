import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> numList = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        switch(n) {
            case 1 -> {
                for(int i = 0; i <= b; i++) {
                    numList.add(num_list[i]);
                }
            }
            case 2 -> {
                for(int i = a; i < num_list.length; i++) {
                    numList.add(num_list[i]);
                }
            }
            case 3 -> {
                for(int i = a; i <= b; i++) {
                    numList.add(num_list[i]);
                }
            }
            case 4 -> {
                for(int i = a; i <= b; i+= c) {
                    numList.add(num_list[i]);
                }
            }
        }
        
        int[] answer = numList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}