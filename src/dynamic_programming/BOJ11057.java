package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11057 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());

		int[][] d = new int[n + 1][10];
		Arrays.fill(d[1], 1);

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < 10; j++) {
				int cnt = 0;
				while (cnt <= j) {
					d[i][j] = (d[i][j] + d[i - 1][cnt]) % 10007;
					cnt++;
				}
			}
		}

		long sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += d[n][i];
		}
		System.out.println(sum % 10007);
	}
}
