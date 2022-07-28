import java.io.*;
import java.util.*;

public class Main {
	public static long C;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		C = Long.parseLong(st.nextToken());

		System.out.println(module(A, B));
	}

	public static long module(long A, long sol) {
		if (sol == 1) {
			return A % C;
		}

		long tmp = module(A, sol / 2);

		if (sol % 2 == 1) {
			return (tmp * tmp % C) * A % C;
		}
		return tmp * tmp % C;
	}
}