package myPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ11052 {
	static int[] p;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		p = new int[n + 1];
		int i = 1;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()) {
			p[i] = Integer.valueOf(st.nextToken());
			i++;
		}
		int maxlist = n - 1;// 3
		list.add(price(1) * n);
		for (i = 1; i <= n; i++) {
			list.add(price(i) + price(maxlist));// 1 3 2 2 3 1 4 0
			maxlist--;
		}
		Collections.sort(list);
		System.out.println(list.get(list.size() - 1));
	}

	public static int price(int e) {
		return p[e];
	}
}
