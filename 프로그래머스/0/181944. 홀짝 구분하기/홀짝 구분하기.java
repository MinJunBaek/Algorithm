import java.util.Scanner;

public class Solution {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = n % 2 == 0 ? n + " is even" : n + " is odd";
        System.out.println(result);
    }
}