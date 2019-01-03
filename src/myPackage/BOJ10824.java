package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10824 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String[] line = a.split(" ");
		long num1 = Long.parseLong(line[0] + line[1]);
		long num2 = Long.parseLong(line[2] + line[3]);
		System.out.println(num1 + num2);
	}

}
