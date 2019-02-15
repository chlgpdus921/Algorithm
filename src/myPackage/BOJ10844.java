package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10844 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		
		int[][] d = new int[n][9];
		for(int i = 0; i< n; i++){
			for(int j = 0; j<9; j++){
				
				d[i][j] = d[i+1][j]+ d[i-1][j]; 
			}
		}
	System.out.println(d[n][]);
	}

}
