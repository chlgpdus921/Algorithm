package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * d[i][j] = �� j���̰�, j��°�� ��������(i)�� �� �������� �ִ� ��
 */
public class BOJ2156 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int[] grape = new int[n + 1];
		int[] d = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			grape[i] = Integer.valueOf(br.readLine());
		}
		d[0] = 0;
		d[1] = grape[1];
		for (int i = 2; i < n + 1; i++) {
			if (i > 2) {
				d[i] = Math.max(Math.max(d[i - 1], d[i - 2] + grape[i]), d[i - 3] + grape[i - 1] + grape[i]);
			}
			else if(i==2) {
				d[2] = grape[1] + grape[2];

			}
		}
		System.out.println(d[n]);

	}
}