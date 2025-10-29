import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        Deque<Integer> linkList = new LinkedList<>();
        
        for (int number : numbers) {
            linkList.add(number);
        }
        
        if (direction.equals("right")) {
            linkList.addFirst(linkList.pollLast());
        } else {
            linkList.addLast(linkList.pollFirst());
        }
        
        int[] answer = linkList.stream().mapToInt(i->i).toArray();
        return answer;
    }
}