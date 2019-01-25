package codeplus_algorithm_basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2446 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.valueOf(br.readLine());
		int temp = n * 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				sb.append(" ");
			}
			for (int a = 1; a < temp; a++) {
				sb.append("*");
			}
			sb.append("\n");
			temp -= 2;
		}
		temp = 3;
		for (int i = 0; i < n - 1; i++) {// 0 1 2 3 4
			for (int j = n - 1; j > i + 1; j--) {
				sb.append(" ");
			}
			for (int a = 1; a <= temp; a++) {
				sb.append("*");
			}
			temp += 2;
			sb.append("\n");
		}
		System.out.println(sb);
	}
}