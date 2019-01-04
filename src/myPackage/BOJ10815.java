package myPackage;

import java.util.*;
import java.io.*;

public class BOJ10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean result = true;
		StringBuilder sb = new StringBuilder();
		int num = Integer.valueOf(br.readLine());
		HashSet<String> hs = new HashSet<String>(num);
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()) {
			hs.add(st.nextToken());
		}
		Integer.valueOf(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()) {
			if(hs.contains(st.nextToken()))
				sb.append(1+" ");
			else sb.append(0+" ");
		}
		System.out.println(sb);
	}
}