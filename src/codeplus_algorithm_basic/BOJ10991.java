package codeplus_algorithm_basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10991 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.valueOf(br.readLine());
		int temp = 1;
		for (int i = n; i > 0; i--) {
			for (int j = i - 1; j > 0; j--) {
				sb.append(" ");
			}
			for (int k = 0; k < temp; k++) {
				if (k > 0) {
					sb.append(" ");
				}
				sb.append("*");
			}
			temp++;
			sb.append("\n");
		}
		System.out.println(sb);
	}
}