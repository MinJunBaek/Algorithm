import java.time.LocalDate;

class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDate dateTime1 = converterDateTime(date1);
        LocalDate dateTime2 = converterDateTime(date2);
        int answer = dateTime1.isBefore(dateTime2) ? 1 : 0;
        return answer;
    }
    
    public LocalDate converterDateTime(int[] dateTime) {
        int year = dateTime[0];
        int month = dateTime[1];
        int day = dateTime[2];
        return LocalDate.of(year, month, day);
    }
}