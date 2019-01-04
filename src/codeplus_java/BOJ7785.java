package codeplus_java;

import java.util.*;
import java.io.*;

public class BOJ7785 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int a = Integer.valueOf(br.readLine());
		HashSet<String> hs = new HashSet<String>(a);
		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine(), " ");// b
			String temp = st.nextToken();
			if (hs.contains(temp)) {
				hs.remove(temp);
			} else
				hs.add(temp);// b
		}
		String[] arr = new String[hs.size()];
		arr = (String[]) hs.toArray(arr);
		Arrays.sort(arr, Collections.reverseOrder());
		for (String q : arr) {
			System.out.println(q);
		}
	}
}
