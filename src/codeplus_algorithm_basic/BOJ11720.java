package codeplus_algorithm_basic;

import java.io.*;

public class BOJ11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = 0;
		int n = Integer.valueOf(br.readLine());
		String temp = br.readLine();
		for (int i = 0; i < temp.length(); i++) {
			int a = Integer.parseInt(temp.substring(i, i + 1));
			total += a;
		}
		System.out.println(total);
	}

}
