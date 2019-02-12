package myPackage;

import java.io.*;
import java.math.BigInteger;

public class BOJ2193 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		BigInteger[] d = new BigInteger[n+1];
		d[0] = BigInteger.ZERO;
		d[1] = BigInteger.ONE;
		for(int i =2; i<=n; i++){
			d[i] = d[i-1].add(d[i-2]);
		}
		System.out.println(d[n]);
	}

}
