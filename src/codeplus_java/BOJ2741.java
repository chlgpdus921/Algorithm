package codeplus_java;

import java.io.IOException;
import java.util.Scanner;

public class BOJ2741 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<a; i++){
			sb.append(i+1+"\n");
		}
		System.out.println(sb);
	}

}
