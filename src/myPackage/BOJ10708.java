package myPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10708 {
	private static final String SPACE = " ";

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), SPACE);
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		int[] a = new int[m];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		int[][] b = new int[m][n];
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), SPACE);
			for (int j = 0; j < n; j++) {
				b[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int[][] result = new int[m][n];
		int sum = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = 0;
				if (b[i][j] == a[i]) {
					result[i][j]++;
					sum++;
				}
			}
			result[i][a[i] - 1] += n - sum;
			sum = 0;
		}

		for (int i = 0; i < n; i++) {
			int total = 0;
			for (int j = 0; j < m; j++) {
				total += result[j][i];
			}
			System.out.println(total);
		}
	}
}