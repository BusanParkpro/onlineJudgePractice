import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken()); // 물품의 수
        int K = Integer.parseInt(st.nextToken()); // 배낭이 수용 가능 한 최대 무게
        
        // 하위 인덱스 부터 시작하기 때문에 인덱스 범위 밖 초과를 방지하기 위하여 N + 1
        int[] W = new int[N + 1]; // 각 물건의 무게
        int[] V = new int[N + 1]; // 각 물건의 가치
        int[] bag = new int[K + 1]; // 짐을 쪼갤 수 없을 땐 DP

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= N; i++) { // K(최대 무게)부터 탐색하여 무게 최대치가 넘지 않을 때 까지 반복
            for (int j = K; j - W[i] >= 0; j--) {
                bag[j] = Math.max(bag[j], bag[j - W[i]] + V[i]);
            }
        }
        System.out.println(bag[K]);
    }
}