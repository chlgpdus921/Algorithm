package codeplus_algorithm_basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2522 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.valueOf(br.readLine());
		int cnt = n;
		for (int i = 0; i < n; i++) {
			for (int a = 0; a < cnt - 1; a++) {// 8 6 4 2 0
				sb.append(" ");
			}
			for (int j = 0; j <= i; j++) {
				sb.append("*");
			}
			cnt--;
			sb.append("\n");
		}
		cnt = 2;
		for (int i = 0; i < n - 1; i++) {
			for (int a = 0; a < cnt - 1; a++) {// 8 6 4 2 0
				sb.append(" ");
			}
			for (int j = n - 1; j > i; j--) {
				sb.append("*");
			}
			cnt++;
			sb.append("\n");
		}
		System.out.println(sb);
	}
}