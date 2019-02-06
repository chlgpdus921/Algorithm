package myPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ11726 {
	static int[] d;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.valueOf(br.readLine());
		d = new int[x+1];
		d[0] = 1;
		d[1] = 1;
		System.out.println(tile(x));
	}
	public static int tile(int x) {//5
		if (d[x] > 0) {
			return d[x];
		}
		d[x] = ( tile(x-1)+tile(x-2) ) % 10007;//1 00
		return d[x];
	}
}
