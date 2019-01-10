package codeplus_java;

import java.util.*;
import java.io.*;

public class BOJ2750_a {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			p[i] = a;
		}
		Arrays.sort(p);
		for (int i : p) {
			System.out.println(i);
		}

	}
}
