package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9465 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.valueOf(br.readLine());

		for (int temp = 0; temp < t; temp++) {
			int size = Integer.valueOf(br.readLine());
			int[][] d = new int[2][size + 2];
			int[][] a = new int[2][size + 1];

			for (int k = 0; k < 2; k++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int j = 0;
				while (st.hasMoreTokens()) {
					a[k][j] = Integer.valueOf(st.nextToken());
					j++;
				}
			}

			d[0][1] = a[0][0];
			d[1][1] = a[1][0];

			int i;
			for (i = 2; i <= size; i++) {
				d[0][i] = max(d[1][i - 1] + a[0][i - 1], d[0][i - 2] + a[0][i - 1], d[1][i - 2] + a[0][i - 1]);
				d[1][i] = max(d[0][i - 1] + a[1][i - 1], d[0][i - 2] + a[1][i - 1], d[1][i - 2] + a[1][i - 1]);
			}
			sb.append(Math.max(d[0][i - 1], d[1][i - 1]) + "\n"); 

		}
		System.out.println(sb);
	}

	public static int max(int a, int b, int c) {
		return Math.max(Math.max(a, b), c);
	}
}
