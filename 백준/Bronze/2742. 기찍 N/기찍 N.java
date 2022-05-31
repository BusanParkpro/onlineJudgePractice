import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

            for (int i = N; N <= 100000; i--) {
                if (i < 1) break;
                bw.write(i + "\n");
            }
        bw.flush();
        bw.close();
    }
}