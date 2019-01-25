package codeplus_algorithm_basic;

import java.io.*;
import java.util.*;

public class BOJ9012 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> sk;
		boolean temp = true;
		int n = Integer.valueOf(br.readLine());
		for (int i = 0; i < n; i++) {
			sk = new Stack<Character>();
			String a = br.readLine();
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) == '(') {
					sk.push('(');
				} else {
					if (sk.size() != 0) {
						sk.pop();
					} else {
						temp = false;
						break;
					}
				}
			}
			if (sk.size() == 0 && temp) {
				sb.append("YES\n");
			} else
				sb.append("NO\n");
			temp = true;
		}
		System.out.println(sb);
	}
}
