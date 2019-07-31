package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1485 {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		/* 네변의 길이가 같고, 그안의 대각선 또한 길이가 같아야 함 */
		int t = Integer.valueOf(br.readLine());
		for (int i = 0; i < t; i++) {
			int[][] d = new int[4][2];
			for (int j = 0; j < 4; j++) {
				st = new StringTokenizer(br.readLine());
				d[j][0] = Integer.valueOf(st.nextToken());
				d[j][1] = Integer.valueOf(st.nextToken());
			}

			int[] result = new int[6];
			int index = 0;
			for (int n = 0; n < 4; n++) {
				for (int k = n + 1; k < 4; k++) {
					result[index] = Math.abs(d[n][0] - d[k][0]) + Math.abs(d[n][1] - d[k][1]);
					index++;
				}
			}
			Arrays.sort(result);
			if ((result[0] == result[3]) && (result[4] == result[5]))
				sb.append(1 + "\n");
			else
				sb.append(0 + "\n");
		}
		System.out.println(sb);
	}

}
