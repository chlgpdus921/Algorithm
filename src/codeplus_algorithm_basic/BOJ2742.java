package codeplus_algorithm_basic;

import java.io.*;
public class BOJ2742 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.valueOf(br.readLine());
		for (int i = a; i > 0; i--) {
			sb.append(i + "\n");
		}
		System.out.println(sb);
	}

}
