package codeplus_java;

import java.util.*;
import java.io.*;
import java.math.*;
public class BOJ10827 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BigDecimal a = new BigDecimal(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		System.out.println(a.pow(b).toPlainString());
	}
}
