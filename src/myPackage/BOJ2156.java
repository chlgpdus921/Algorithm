package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
 * d[i]= i가 선택될때의 최댓값
 *  
 * 
 */
public class BOJ2156 {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int[][] grape = new int[2][n];
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			grape[0][i] = Integer.valueOf(br.readLine());
			temp[i] = grape[0][i];
		}

		Arrays.sort(temp);

		int size = n - 1;

		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (grape[0][j] == temp[i]) { // max값이구
					if (j > 0 && j < n-1) {
						if (!(grape[1][j + 1] == 1 && grape[1][j - 1] == 1)) {
							grape[1][j] = 1;

						}
					}
				}
			}
		}
		int sum = 0;
		for(int i = 0; i<n;i++) {
			if(grape[1][i] == 1)
				sum += grape[0][i];
		}
		System.out.println(sum);

	}
}