package codeplus_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ2750 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		ArrayList <Integer> list = new ArrayList<Integer>(n);
		for(int i = 0; i<n; i++){
			list.add(i,Integer.valueOf(br.readLine()));
		}
		for(int i =0; i<n; i++){
			for(int j = i; j<n; j++){
				if(list.get(i) > list.get(j)){
					int temp = list.get(i);
					list.set(i,list.get(j));
					list.set(j, temp);
				}
			}
		}
		//Collections.sort(list);
		for(int i =0; i<n; i++){
			System.out.println(list.get(i));
		}
	}
}
