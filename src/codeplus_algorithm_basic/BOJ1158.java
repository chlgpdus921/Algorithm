package codeplus_algorithm_basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1158 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		Queue<Integer> queue = new LinkedList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int size = Integer.valueOf(st.nextToken());
		for (int i = 1; i <= size; i++) {
			queue.add(i);
		}
		int m = Integer.valueOf(st.nextToken());
		int j = 1;
		while (!queue.isEmpty()) {
			while (j != m) {
				int first = queue.element();
				queue.remove();
				queue.add(first);
				j++;
			}
			j = 1;
			sb.append(queue.element() + ", ");
			queue.remove();
		}
		sb.replace(sb.length() - 2, sb.length() - 1, ">");
		System.out.println(sb);
	}
}
