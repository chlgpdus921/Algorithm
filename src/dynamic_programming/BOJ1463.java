package dynamic_programming;

import java.util.*;
import java.io.*;

public class BOJ1463 {
	static int[] d;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.valueOf(br.readLine());
		d = new int[x + 1];
		for (int i = 0; i < d.length; i++) {
			d[i] = 0;
		}
		System.out.println(first_div(x));
	}

	public static int first_div(int x) {
		if (x == 1) {
			return 0;
		}
		if (d[x] > 0) {
			return d[x];
		}
		d[x] = first_div(x - 1) + 1;
		if (x % 3 == 0) {
			int temp = first_div(x / 3) + 1;
			if (d[x] > temp) {
				d[x] = temp;
			}
		} else if (x % 2 == 0) {
			int temp = first_div(x / 2) + 1;
			if (d[x] > temp) {
				d[x] = temp;
			}
		}
		return d[x];
	}
}
