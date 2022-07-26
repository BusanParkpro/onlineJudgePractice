import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int changes = 1000 - Integer.parseInt(br.readLine());
		int cnt = 0;
		int[] coins = {500, 100, 50, 10, 5, 1};

		for (int i = 0; i < coins.length; i++) {
			if (changes < coins[i]) {
				continue;
			}
			int q = changes / coins[i];
			changes %= coins[i];
			cnt += q;
		}
		System.out.println(cnt);
	}
}