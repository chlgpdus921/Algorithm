package codeplus_java;

import java.io.*;
import java.util.*;
public class BOJ10828 {
	static ArrayList <Integer> list; 
	static int i = 0;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		list = new ArrayList<Integer>();
	 sb = new StringBuilder();
		int n = Integer.valueOf(br.readLine());
		int temp = 0;
		while(temp< n){
			String q = br.readLine();
			if(q.contains("push")){
				String[] t = q.split(" ");
				push(Integer.parseInt(t[1]));
			}
			else if(q.equals("pop"))
				sb.append(pop()+"\n");
			else if(q.equals("top"))
				sb.append(top()+"\n");
			else if(q.equals("size"))
				sb.append(size()+"\n");
			else if(q.equals("empty"))
				sb.append(empty()+"\n");
			temp++;
		}
		System.out.println(sb);
	}
	public static void push(int x) {
		list.add(x);
		i++;
	}
	public static int pop(){
		if(size() >0){
		int num = list.get(i-1);
		list.remove(i-1);
		i--;
		return num;
		}
		return -1;
	}
	public  static int size(){
		return list.size();
	}
	public  static int empty(){
		if(list.isEmpty())
			return 1;
		return 0;
	}
	public  static int top(){
		if(empty()==1)
			return -1;
		return list.get(i-1);
	}
}
