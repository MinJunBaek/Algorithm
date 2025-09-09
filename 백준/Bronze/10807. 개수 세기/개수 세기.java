import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int search = Integer.parseInt(br.readLine().trim());
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == search) {
                count++;
            }
        }
        
        System.out.println(count);
        
    }
}