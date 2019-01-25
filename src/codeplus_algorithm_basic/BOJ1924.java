package codeplus_algorithm_basic;

import java.io.*;
import java.util.*;

public class BOJ1924 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String[] day = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int temp = 0;
		if (a == 1) {
			int num = (b - 1) % 7;
			System.out.println(day[num]);
		} 
		else {
			for (int i = 0; i < a - 1; i++) {
				temp = temp + month[i];
			}
			temp = temp % 7;
			int d = (b - 1) % 7;
			int str = d + temp;
			if (str >= 7) {
				str = str % 7;
			}
			System.out.println(day[str]);
			temp = 0;
		}
	}
}
