package codeplus_java;

import java.util.*;
import java.io.*;

class Pointt implements Comparable<Pointt> {
	int x, y;

	Pointt(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int compareTo(Pointt that) {
		if (this.y < that.y) {
			return -1;
		} else if (this.y == that.y) {
			if (this.x < that.x) {
				return -1;
			} else if (this.x == that.x) {
				return 0;
			} else
				return 1;
		} else
			return 1;
	}
}

public class BOJ11651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.valueOf(br.readLine());
		Pointt[] a = new Pointt[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			a[i] = new Pointt(x, y);
		}
		/*Arrays.sort(a, new Comparator<Point>(){
			public int compare(Point x, Point y){
				return x.compareTo(y);
			}
		});*/
		Arrays.sort(a);
		for(int i=0; i<n; i++){
			System.out.println(a[i].x +" "+a[i].y);
		}
	}

}
