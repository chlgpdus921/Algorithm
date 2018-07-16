package realization;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ5575 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] person_h = new int[6];
		int[] person_m = new int[6];
		int[] person_s = new int[6];
		int i = 0, j = 0;
		StringTokenizer st;
		for (int a = 0; a < 3; a++) {
			st = new StringTokenizer(br.readLine(), " ");
			while (st.hasMoreTokens()) {
				if (j == 0) {
					person_h[i] = Integer.parseInt(st.nextToken());
					j++;
				}
				if (j == 1) {
					person_m[i] = Integer.parseInt(st.nextToken());
					j++;
				}
				if (j == 2) {
					person_s[i] = Integer.parseInt(st.nextToken());
					j = 0;
				}
				i++;
			}
		}
		String result = "";
		for (int k = 0; k < 6; k = k + 2) {
			int h = person_h[k + 1] - person_h[k];
			int m = person_m[k + 1] - person_m[k];
			int s = person_s[k + 1] - person_s[k];
			if (s < 0) {
				m--;
				s = 60 + s;
			}
			if (m < 0) {
				h--;
				m = 60 + m;
			}
			result = result.concat(h + " " + m + " " + s + "\n");
		}
		System.out.println(result);
	}
}
