import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> hs = new HashMap<>();
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			hs.put(br.readLine(), 1);
		}

		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			if (hs.get(str) != null) {
				cnt++;
			}
		}
		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}