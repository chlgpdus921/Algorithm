package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/* 500 -200 -400 50 50* -> 최소 배달 비용 : 950 */
public class BOJ14943 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.valueOf(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] d = new int[n+1];
		int i = 1;
		while(st.hasMoreTokens()) {
			d[i] = Integer.valueOf(st.nextToken());
			i++;
		}
			
	}
}
