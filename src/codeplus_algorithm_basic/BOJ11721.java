package codeplus_algorithm_basic;

import java.io.*;

public class BOJ11721 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		StringBuilder sb = new StringBuilder();
		int c = 0, i;
		for (i = 0; i < n.length(); i++) {
			if ((i + 1) % 10 == 0) {
				String temp = n.substring(c, i + 1);
				sb.append(temp+"\n");
				c = i + 1;
			}
		}
		sb.append(n.substring(c, i));
		System.out.println(sb);
	}

}
