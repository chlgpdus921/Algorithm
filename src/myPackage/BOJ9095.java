package myPackage;

import java.io.*;

public class BOJ9095 {
	static int[] d;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.valueOf(br.readLine());

		for (int i = 0; i < t; i++) {
			int n = Integer.valueOf(br.readLine());
			d = new int[n + 1];
			d[0] = 1;
			sb.append(caculate(n) + "\n");
		}
		System.out.println(sb);
	}

	public static int caculate(int n) {
		if (d[n] > 0) {
			return d[n];
		}
		else if (n <= 2) {
			d[n] = n;
			return d[n];
		}
		d[n] = caculate(n - 1) + caculate(n - 2) + caculate(n - 3);
		return d[n];
	}

}
