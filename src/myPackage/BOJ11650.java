package myPackage;

import java.util.*;
import java.io.*;
class Point implements Comparable<Point> {
	public int x_point, y_point;

	Point(int x, int y) {
		this.x_point = x;
		this.y_point = y;
	}
	public int compareTo(Point that) {
		if (this.x_point < that.x_point) {
			return -1;
		} else if (this.x_point == that.x_point) {
			if (this.y_point < that.y_point) {
				return -1;
			} else if (this.y_point == that.y_point) {
				return 0;
			} else {
				return 1;
			}
		} else {
			return 1;
		}
	}

}
public class BOJ11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.valueOf(br.readLine());
		Point[] a = new Point[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x  = Integer.parseInt(st.nextToken());
			int y  = Integer.parseInt(st.nextToken());
			a[i] = new Point(x,y);
		}
		Arrays.sort(a, new Comparator<Point>(){
			public int compare(Point p, Point p2){
				return p.compareTo(p2);
			}
		});
//		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			System.out.println(a[i].x_point + " " + a[i].y_point);
		}
		}

}
