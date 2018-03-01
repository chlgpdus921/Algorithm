package realization;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2839 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int temp = n / 5;
		int num = n;
		int k =-1 ;
		
		for (int i = 0; i <= temp; i++) {
			num = n - i * 5;
			if (num % 3 != 0)
				continue;
			else if(num%3 ==0) {
				num = num / 3;
				if (k==-1 || k > num + i)
					k = num + i;	
			}			
		}
		System.out.println(k);
	}
}