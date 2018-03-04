package realization;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ4948 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0, total = 0, k=0;
		int[] atotal = new int[1000];
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;
			for(int i = n+1; i <= (2 * n); i++) {
				
			}
			}
			/*f  or (int i = n+1; i <= (2 * n); i++) {
				for (int j = 2; j <= i/2; j++) {
					if (sum >=2)
						break;
					if(i%j ==0)
						sum++;
				}
				if (sum == 0)
					total++;
				sum = 0;
			}*/
	/*		atotal[k] = total;
			k++;
			total = 0;
		}
		for(int i =0; i<k; i++){
			System.out.println(atotal[i]);
		}*/
	}
}
