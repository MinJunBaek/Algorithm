import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[9];
        int idx = 0;
        
        while (number > 0) {
            idx = number % 10;
            if (idx == 9) {
                idx -= 3;
            }
            arr[idx] += 1;
            number /= 10;
        }
        
        arr[6] = (arr[6] + 1) / 2;
        int answer = arr[0];
        for (int i = 0; i < arr.length; i++) {
            answer = Math.max(answer, arr[i]);
        }
        System.out.println(answer);
    }
}