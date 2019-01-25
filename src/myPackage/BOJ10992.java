package myPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10992 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.valueOf(br.readLine());
		int temp = 1;
		for (int i = n; i > 0; i--) {
			for (int j = i - 1; j > 0; j--) {
				sb.append(" ");
			}
			sb.append("*");
			if (i != n) {
				for (int k = 0; k < temp; k++) {
					if (i != 1)
						sb.append(" ");
					else {
						sb.append("*");
					}
				}
				sb.append("*");
				temp += 2;
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}