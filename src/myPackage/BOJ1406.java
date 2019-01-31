package myPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ1406 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		String a = br.readLine();
		for (int i = 0; i < a.length(); i++) {
			left.push(a.charAt(i));
		}
		int n = Integer.valueOf(br.readLine());
		for (int i = 0; i < n; i++) {
			String order = br.readLine();
			if (order.contains("P")) {
				left.push(order.charAt(2));
			} else if (order.contains("L")) {
				if (!left.isEmpty()) {
					right.push(left.get(left.size() - 1));
					left.pop();
				}
			} else if (order.contains("D")) {
				if (!right.isEmpty()) {
					left.push(right.get(right.size() - 1));
					right.pop();
				}
			} else if (order.contains("B")) {
				if (!left.isEmpty())
					left.pop();
			}

		}
		for (int i = 0; i < left.size(); i++) {
			sb.append(left.get(i));
		}
		for (int i = right.size() - 1; i >= 0; i--) {
			sb.append(right.get(i));
		}
		System.out.println(sb);
	}

}
