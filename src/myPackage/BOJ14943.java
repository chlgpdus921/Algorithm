package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 
 * 500 -200 -400 50 50 -> 최소 배달 비용 : 950 
 * 누적하여 계산 500 300 -100 -50 0  절댓값으로 sum 계산하기
 */
public class BOJ14943 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.valueOf(br.readLine());
		st = new StringTokenizer(br.readLine());
		long[] d = new long[n];
		int i = 0;
		while (st.hasMoreTokens()) {
			d[i] = Integer.valueOf(st.nextToken());
			i++;
		}
		long sum = Math.abs(d[0]);
		for (int j = 1; j < n; j++) {
			d[j] = d[j] + d[j - 1];
			sum += Math.abs(d[j]);
		}
		System.out.println(sum);
	}
}
