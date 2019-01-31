package codeplus_algorithm_basic;

import java.io.*;
import java.util.*;

public class BOJ10799 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> sk = new Stack<Character>();
		int cnt = 0;
		String a = br.readLine();
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '(') {
				sk.push('(');
			}
			else if (a.charAt(i) == ')' && a.charAt(i - 1) == '(') {
				sk.pop();
				cnt += sk.size();
			}
			else if (a.charAt(i) == ')') {
				sk.pop();
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
