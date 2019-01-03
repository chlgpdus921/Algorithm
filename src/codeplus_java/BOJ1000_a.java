package codeplus_java;

import java.util.*;

public class BOJ1000_a {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		float sum = 0;
		while (sc.hasNextFloat()) {
			sum += sc.nextFloat();
		}
		System.out.println(sum);
	}
	
}