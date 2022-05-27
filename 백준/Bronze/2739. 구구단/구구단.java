import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        br.close();

        for (int n = 1; n <= 9; n++) {
            String str = String.format("%d * %d = %d",a,n, a * n);
            System.out.println(str);
        }
    }
}
