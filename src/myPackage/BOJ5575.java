package myPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ5575 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] person_h = new int[6];
		int[] person_m = new int[6];
		int[] person_s = new int[6];
		int i = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine(), " ");
			person_h[i] = Integer.parseInt(st.nextToken());
		
			i++;
		}
	}
}
