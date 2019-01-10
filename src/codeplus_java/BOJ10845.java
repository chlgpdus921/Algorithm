package codeplus_java;

import java.util.*;
import java.io.*;

public class BOJ10845 {
	static ArrayList<Integer> queue = new ArrayList<Integer>();
	static int i = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.valueOf(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < size; j++) {
			st = new StringTokenizer(br.readLine(), " ");
			String temp = st.nextToken();
			if (temp.contains("push")) {
				push(Integer.valueOf(st.nextToken()));
			} else if (temp.contains("front")) {
				sb.append(front() + "\n");
			} else if (temp.contains("back")) {
				sb.append(back() + "\n");
			} else if (temp.contains("empty")) {
				sb.append(empty() + "\n");
			} else if (temp.contains("pop")) {
				sb.append(pop() + "\n");
			} else if (temp.contains("size")) {
				sb.append(size() + "\n");
			}
		}
		System.out.println(sb);
	}

	public static void push(int item) {
		queue.add(item);
		i++;
	}

	public static int pop() {
		if (empty() == 0) {
			int temp = queue.get(0);
			queue.remove(0);
			i--;
			return temp;
		}
		return -1;
	}

	public static int size() {
		return queue.size();
	}

	public static int empty() {
		if (queue.isEmpty())
			return 1;
		return 0;
	}

	public static int front() {
		if (empty() == 0) {
			return queue.get(0);
		}
		return -1;
	}

	public static int back() {
		if (empty() == 0) {
			return queue.get(i - 1);
		}
		return -1;
	}
}
