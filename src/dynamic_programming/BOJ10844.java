package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;;

public class BOJ10844 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		// i자리 계단수 마지막수 j (0~9)
		/* i-digit stair number - last j */
		int[][] d = new int[n + 1][10];

		for (int i = 1; i < 10; i++) {
			d[1][i]++;
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0)
					d[i][j] = d[i - 1][1] % 1000000000;
				else if (j == 9)
					d[i][j] = d[i - 1][8] % 1000000000;
				else
					d[i][j] = (d[i - 1][j - 1] + d[i - 1][j + 1]) % 1000000000;
			}
		}
		int sum = 0;
		for (int j = 0; j < 10; j++) {
			sum = (sum + d[n][j]) % 1000000000;
		}
		System.out.println(sum % 1000000000);
	}
}
