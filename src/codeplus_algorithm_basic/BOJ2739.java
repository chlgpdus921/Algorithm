package codeplus_algorithm_basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2739 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.valueOf(br.readLine());
		for (int i = 1; i < 10; i++) {
			sb.append(n + " * " + i + " = " + (n * i) + "\n");
		}
		System.out.println(sb);
	}
}
