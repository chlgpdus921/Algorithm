package myPackage;

import java.io.*;
import java.util.*;

public class BOJ10799 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> sk = new Stack<Character>();
		int cnt=0;
		String a = br.readLine();
		for(int i = 0; i< a.length(); i++){
			if(a.charAt(i) =='('){
				sk.push('(');
				if(a.charAt(i+1) ==')'){
					cnt++;
				}
			}
			else {
				sk.pop();
			}
		}
	}
}
