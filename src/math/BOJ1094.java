package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
 * 1. arraylist에 할당
 * 2. 이진법구해서 1 count (input할때 valueOf ->  toBinaryString)
 */
public class BOJ1094 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.valueOf(br.readLine());
		double temp = 64;

		ArrayList<Double> bar = new ArrayList<Double>();

		bar.add(temp);
		while (sum(bar) != x) {
			bar.remove(bar.size() - 1);
			temp /= 2.0;

			bar.add(temp);
			if (!(sum(bar) >= x)) {
				bar.add(temp);
			}
		}
		System.out.println(bar.size());
	}

	public static double sum(ArrayList<Double> bar) {
		double result = 0;
		for (int i = 0; i < bar.size(); i++) {
			result += bar.get(i);
		}
		return result;
	}
}
