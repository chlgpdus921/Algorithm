package codeplus_java;

import java.io.*;
import java.math.*;

public class BOJ10826 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		BigInteger[] a = new BigInteger[Math.max(n+1, 2)];
		a[0] = BigInteger.ZERO;
		a[1] = BigInteger.ONE;
		for(int i =2; i<=n; i++){
			a[i] = a[i-1].add(a[i-2]);
		}
		System.out.println(a[n]);
	}
}
