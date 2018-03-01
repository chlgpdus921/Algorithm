package realization;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2033 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double n = Double.parseDouble(br.readLine());
		int num = (int) n;
		int i = 10;

		while ((int) n / i > 0) {
			n = n / i;
			num = (int) Math.round(n);
			n = num * i;
			i *= 10;
		}
		System.out.println((int) n);
	}
}
