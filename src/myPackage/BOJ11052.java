package myPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ11052 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] p = new int[n + 1];
		int[] d = new int[n + 1];
		int i = 1;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()) {
			p[i] = Integer.valueOf(st.nextToken());
			i++;
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				d[i] = Math.max(d[i], p[j] + d[i - j]);
				System.out.println(d[i]+"  "+( p[j] + d[i - j]));
			}
		}
		System.out.println(d[n]);
	}

}
