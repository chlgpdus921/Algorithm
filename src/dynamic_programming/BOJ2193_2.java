package dynamic_programming;

import java.io.*;
import java.math.BigInteger;

public class BOJ2193_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		BigInteger[][] d = new BigInteger[n + 1][2];
		d[1][1] = BigInteger.ONE;
		d[1][0] = BigInteger.ZERO;
		for (int i = 2; i <= n; i++) {
			d[i][1] = d[i - 1][0];
			d[i][0] = d[i - 1][0].add(d[i - 1][1]);
		}

		BigInteger sum = d[n][1].add(d[n][0]);
		System.out.println(sum);
	}
}
