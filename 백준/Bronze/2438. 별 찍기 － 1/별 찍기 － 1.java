import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= a; i++) { // 행
            for (int j = 1; j <= i; j++) { // 열
                bw.write("*");
            }
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}