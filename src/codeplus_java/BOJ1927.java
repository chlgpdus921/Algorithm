package codeplus_java;

import java.util.*;
import java.io.*;

public class BOJ1927 {
	static PriorityQueue <Integer> queue = new PriorityQueue<Integer>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.valueOf(br.readLine());
		for (int i = 0; i < n; i++) {
			int x = Integer.valueOf(br.readLine());
			if (x == 0) {
				sb.append(pop() + "\n");
			} else if (x > 0) {
				queue.offer(x);
			}
		}
		System.out.println(sb);

	}

	private static int pop() {
		if (queue.isEmpty()) {
			return 0;
		}
		int temp = queue.peek();
		queue.poll();
		return temp;
	}
}
