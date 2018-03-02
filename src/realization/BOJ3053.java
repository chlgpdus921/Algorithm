package realization;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ3053 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int r = Integer.parseInt(br.readLine());
		double u = r * r * Math.PI;
		System.out.printf("%.6f\n", u);

		double t = 0.5 * (r+r)*(r+r);
		System.out.printf("%.6f\n", t);
	}
}
