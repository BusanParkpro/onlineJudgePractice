import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            if(X == 0 && Y == 0) {
                break;
            }
            sb.append(X + Y).append('\n');
        }
        System.out.println(sb);
    }
}