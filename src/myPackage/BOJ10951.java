package myPackage;

import java.util.*;
import java.io.*;

public class BOJ10951 {

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
	//	int a = sc.nextInt();
	//	int b = sc.nextInt();
	//	sb.append(a+b +"\n");
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			 int b = sc.nextInt();
			sb.append(a+b +"\n");
		}
		sc.close();
		System.out.println(sb);
	}

}
