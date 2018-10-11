package myPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10718 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "\n");
		String a = br.readLine();
		String b = "";
		String c = " ";
		c.concat(a+ "\n");
		System.out.println(c);
		while (st.hasMoreTokens()) {	
			st = new StringTokenizer(br.readLine(), "\n");
			a = br.readLine();
			b = st.nextToken();
			c.concat(b + "\n");
		}
		System.out.println(c);
	}

}
