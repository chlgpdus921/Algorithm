package myPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2442 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int temp = 1;
		int n = Integer.valueOf(br.readLine());
		for(int i = 0; i<n; i++){
			for(int j = i; j<n-1; j++){
				sb.append(" ");
			}//1 3 5 7 9
			for(int a = 1; a<=temp; a++){
				sb.append("*");
			}
			temp = temp+2; //3
			sb.append("\n");
		}
		System.out.println(sb);
	}
}