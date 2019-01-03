package codeplus_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10824 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String[] line = a.split(" ");
		int num1 = Integer.parseInt(line[0] + line[1]);
		int num2 = Integer.parseInt(line[2] + line[3]);

		System.out.println(num1 + num2);
	}

}
