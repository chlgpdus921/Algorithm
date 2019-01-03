package codeplus_java;

import java.util.*;

public class BOJ1000_a {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (sc.hasNextInt()) {
			sum += sc.nextInt();
		}
		System.out.println(sum);
	}
	
}