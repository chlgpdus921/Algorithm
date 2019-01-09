package myPackage;

import java.util.*;
import java.io.*;

public class BOJ1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.valueOf(st.nextToken());
		int n = Integer.valueOf(st.nextToken());
		HashMap<String, Integer> nolisten = new HashMap<String, Integer>();
		HashMap<String, Integer> nosee = new HashMap<String, Integer>();
		
		for(int i =0; i<m; i++){
			nolisten.put(br.readLine(), 1);
		}
		int l=0;String temp="";
		for(int j =0; j<n; j++){
			 temp = br.readLine();
			if(nolisten.containsKey(temp)){
				nosee.put(temp, 1);
				l++;
			}
		}
		System.out.println(nosee.size());
		ArrayList <String> arr = new ArrayList<String>(nosee.size());
		for(String a: nosee.keySet()){
			arr.add(a);
		}
		Collections.sort(arr);
	for(int i=0; i< arr.size(); i++){
		System.out.println(arr.get(i));
		}
	}

}
