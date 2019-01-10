package codeplus_java;

import java.util.*;
import java.io.*;

public class BOJ11279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(1000, new Comparator<Integer>() {
			public int compare(Integer w1, Integer w2) {
				return -w1.compareTo(w2);
			};
		});
		int n = Integer.valueOf(br.readLine());
		for (int i = 0; i < n; i++) {
			int x = Integer.valueOf(br.readLine());
			if (x == 0) {
				if (queue.isEmpty()) {
					sb.append(0 + "\n");
				} else {
					sb.append(queue.poll() + "\n");
				}
			} else
				queue.offer(x);
		}
		System.out.println(sb);
	}
}
