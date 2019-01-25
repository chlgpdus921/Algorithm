package codeplus_algorithm_basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2444 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int temp = 1;
		int n = Integer.valueOf(br.readLine());
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - 1; j++) {
				sb.append(" ");
			}
			for (int a = 1; a <= temp; a++) {
				sb.append("*");
			}
			temp = temp + 2;
			sb.append("\n");
		}
		temp -= 4;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j <= i; j++) {
				sb.append(" ");
			}
			for (int a = 1; a <= temp; a++) {
				sb.append("*");
			}
			temp = temp - 2;
			sb.append("\n");
		}
		System.out.println(sb);
	}
}