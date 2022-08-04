import java.io.*;
import java.util.*;

public class Main {
	public static long C;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

		for (int i = 0; i <= N; i++) {
			arr.add(new ArrayList<>());
		}
		for (int i = 0; i < N - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr.get(a).add(b);
			arr.get(b).add(a);
		}

		Queue<Integer> queue = new LinkedList<>();
		boolean[] visit = new boolean[N + 1];
		int[] parent = new int[N + 1];

		queue.add(1);
		visit[1] = true;

		while (!queue.isEmpty()) {
			int v = queue.poll();
			for (int next : arr.get(v)) {
				if (!visit[next]) {
					visit[next] = true;
					parent[next] = v;
					queue.add(next);
				}
			}
		}
		for (int i = 2; i <= N; i++) {
			sb.append(parent[i] + "\n");
		}
		System.out.println(sb);
	}
}