/**
 * @author: CHOI_HYE_YEON
 */
package codeplus_basic;

import java.util.*;
import java.io.*;

/*
 * Tip! TC의 갯수가 정해져 있지 않다는 것은 Ctrl+z 으로 프로그램 종료를 의미 
 * */
public class BOJ10951 {

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sb.append(a + b + "\n");
		}
		sc.close();
		System.out.println(sb);
	}

}
