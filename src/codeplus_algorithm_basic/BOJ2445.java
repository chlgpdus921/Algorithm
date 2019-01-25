package codeplus_algorithm_basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2445 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int temp = 1;
		int n = Integer.valueOf(br.readLine());
		int cnt = n * 2;
		for (int i = 0; i < n * 2; i++) {
			if (i == n) {
				temp = n - 1;
				cnt = 4;
			}
			for (int j = 0; j < temp; j++) {
				sb.append("*");
			}
			for (int a = 0; a < cnt - 2; a++) {// 8 6 4 2 0
				sb.append(" ");
			}
			for (int j = 0; j < temp; j++) {
				sb.append("*");
			}
			if (i < n) {
				cnt -= 2;
				temp++;
			} else {
				cnt += 2;
				temp--;
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
