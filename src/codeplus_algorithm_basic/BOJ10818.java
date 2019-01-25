package codeplus_algorithm_basic;

import java.io.*;
import java.util.*;

public class BOJ10818 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		ArrayList<Integer> hs = new ArrayList<Integer>();
		while (st.hasMoreTokens()) {
			hs.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(hs);
		System.out.println(hs.get(0) + " " + hs.get(hs.size() - 1));
	}
}
