package myPackage;

import java.util.*;
import java.io.*;

public class BOJ1076 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> color = new HashMap<String, Integer>();
		StringBuilder sb = new StringBuilder();
		color.put("black", 0);
		color.put("brown", 1);
		color.put("red", 2);
		color.put("orange", 3);
		color.put("yellow", 4);
		color.put("green", 5);
		color.put("blue", 6);
		color.put("violet", 7);
		color.put("grey", 8);
		color.put("white", 9);

		for (int i = 0; i < 2; i++) {
			sb.append(color.get(br.readLine()));
		}
		long  a = 1;
		int size = color.get(br.readLine());
		for (int i = 0; i < size; i++) {
			a = a * 10;
		}
		System.out.println(Integer.parseInt(sb.toString()) * a);
	}
}
