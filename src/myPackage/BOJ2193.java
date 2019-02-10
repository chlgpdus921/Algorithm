package myPackage;

import java.util.*;
import java.io.*;

public class BOJ2193 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		if (n > 4) {
			double result= Math.pow(2, n - 4)-1;
			double result2 = Math.pow(2, n - 3)-1;
			int a =(int)((int) result + result2);
			System.out.println(a);
		}
		else{
			if(n ==1 || n ==2){
				System.out.println(1);
			}
			else if(n ==3 || n ==4){
				System.out.println(2);
			}
		}
	}

}
