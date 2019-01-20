package myPackage;

import java.util.*;
import java.io.*;

public class BOJ11021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.valueOf(br.readLine());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			sb.append("Case #"+(i+1)+": "+ (a + b) + "\n");
		}
		System.out.println(sb);
	}
}
