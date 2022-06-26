import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 
        String strArr[] = new String[N];

        for (int i = 0; i < N; i++) {
            strArr[i] = br.readLine();
        }
        for (int i = 0; i < N; i++) {
            int sum = 0; // 누적 합산
            int cnt = 0; // count
            for (int j = 0; j < strArr[i].length(); j++) {
                if (strArr[i].charAt(j) =='O') {
                    cnt++; // O가 연속되면 count 증가
                } else {
                    cnt = 0; // 아니면 0으로 초기화
                }
                sum += cnt; // count 개수 누적 합산
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}