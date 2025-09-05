import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int x = Integer.parseInt(br.readLine().trim());
        int count = 0;
        
        boolean[] seen = new boolean[1000001];
        
        for (int num : arr) {
            int need = x - num;
            
            if (1 <= need && need <= 1000000 && seen[need]) {
                count++;
            }
            seen[num] = true;
        }
        System.out.println(count);
    }
}
